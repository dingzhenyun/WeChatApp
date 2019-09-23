package com.imooc.service;

import com.imooc.pojo.Roots;
import com.imooc.pojo.Users;

/**
 * @author DingZhenYun
 * @create 2019-09-23 上午 8:58
 */
public interface RootsService {
    /**
     * @Description: 判断用户名是否存在
     */
    public boolean queryUsernameIsExist(String username);



    /**
     * @Description: 用户登录，根据用户名和密码查询用户
     */
    public boolean queryRootForLogin(String username, String password);
}
