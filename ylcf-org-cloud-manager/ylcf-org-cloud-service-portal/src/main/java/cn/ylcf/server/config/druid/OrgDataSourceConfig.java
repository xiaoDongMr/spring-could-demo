package cn.ylcf.server.config.druid;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages = OrgDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "orgSqlSessionFactory")
public class OrgDataSourceConfig {
    // 精确到 org 目录，以便跟其他数据源隔离
    static final String PACKAGE = "cn.yilucaifu.mapper.persistence";
    static final String MAPPER_LOCATION = "cn/yilucaifu/mapper/persistence/*.xml";
    @Value("${spring.datasource.druid.org.url}")
    private String url;

    @Value("${spring.datasource.druid.org.username}")
    private String user;

    @Value("${spring.datasource.druid.org.password}")
    private String password;

    @Value("${spring.datasource.druid.driverClassName}")
    private String driverClass;

    @Bean(name = "orgDataSource")
    //必须要有一个主数据源
    @Primary
    public DataSource orgDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "orgTransactionManager")
    @Primary
    public DataSourceTransactionManager orgTransactionManager() {
        return new DataSourceTransactionManager(orgDataSource());
    }

    @Bean(name = "orgSqlSessionFactory")
    @Primary
    public SqlSessionFactory orgSqlSessionFactory(@Qualifier("orgDataSource") DataSource orgDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(orgDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(OrgDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
