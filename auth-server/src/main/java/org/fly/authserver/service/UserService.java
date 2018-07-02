package org.fly.authserver.service;

import org.fly.authserver.bean.UserVO;

/**
 * Created by admin on 2018/7/2.
 */
public interface UserService {
    UserVO findUserByUsername(String username);
}
