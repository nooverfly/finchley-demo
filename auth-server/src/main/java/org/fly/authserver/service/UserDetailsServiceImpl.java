package org.fly.authserver.service;

import org.fly.authserver.util.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2018/7/2.
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetailsImpl user = new UserDetailsImpl();
        user.setUserId(1);
        user.setUsername("admin");
        user.setPassword("123456");
        user.setStatus("true");
        return user;
    }
}
