package cn.ylcf.server.impl;

import cn.yilucaifu.domain.Users;
import cn.yilucaifu.domain.UsersExample;
import cn.yilucaifu.mapper.persistence.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Created by Mr.Yangxiufeng on 2017/12/27.
 * Time:16:37
 * ProjectName:Mirco-Service-Skeleton
 */
@RestController
@RefreshScope
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria uCrit = usersExample.createCriteria();
        uCrit.andUserIdEqualTo(999);
        List<Users> usersList = usersDao.selectByExample(usersExample);
        Users users = usersList.get(0);

        boolean enabled = true; // 可用性 :true:可用 false:不可用
        boolean accountNonExpired = true; // 过期性 :true:没过期 false:过期
        boolean credentialsNonExpired = true; // 有效性 :true:凭证有效 false:凭证无效
        boolean accountNonLocked = true; // 锁定性 :true:未锁定 false:已锁定
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_"+"ADMIN");
        grantedAuthorities.add(grantedAuthority);
        GrantedAuthority authority = new SimpleGrantedAuthority("100010");
        grantedAuthorities.add(authority);

        User user = new User(users.getUsername(), users.getPassword(),
                enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, grantedAuthorities);
        return user;
    }
}