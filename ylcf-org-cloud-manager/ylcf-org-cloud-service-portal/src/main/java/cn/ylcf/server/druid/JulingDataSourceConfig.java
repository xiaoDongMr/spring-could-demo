package cn.ylcf.server.druid;

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
@MapperScan(basePackages = JulingDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "julingSqlSessionFactory")
public class JulingDataSourceConfig {
    // 精确到 juling 目录，以便跟其他数据源隔离
    static final String PACKAGE = "cn.yilucaifu.mapper.persistence_jl";
    static final String MAPPER_LOCATION = "classpath:cn/yilucaifu/mapper/persistence_jl/*.xml";
    @Value("${spring.datasource.druid.juling.url}")
    private String url;

    @Value("${spring.datasource.druid.juling.username}")
    private String user;

    @Value("${spring.datasource.druid.juling.password}")
    private String password;

    @Value("${spring.datasource.druid.driverClassName}")
    private String driverClass;

    @Bean(name = "julingDataSource")
    public DataSource julingDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "julingTransactionManager")
    public DataSourceTransactionManager julingTransactionManager() {
        return new DataSourceTransactionManager(julingDataSource());
    }

    @Bean(name = "julingSqlSessionFactory")
    public SqlSessionFactory julingSqlSessionFactory(@Qualifier("julingDataSource") DataSource julingDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(julingDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(JulingDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
