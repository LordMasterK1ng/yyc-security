package security.browser.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import security.browser.service.YycUserDetailsService;

/**
 * @author 姚琛
 * @description
 * @date 2019/5/16
 */
@Component
@Slf4j
public class YycUserDetailsServiceImpl implements YycUserDetailsService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String pass = passwordEncoder.encode("123456");
        log.error("password:{}", pass);
        return new User(username, pass,
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
