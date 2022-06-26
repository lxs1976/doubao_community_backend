package com.douyuehan.doubao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.douyuehan.doubao.model.Dto.LoginDTO;
import com.douyuehan.doubao.model.Dto.RegisterDTO;
import com.douyuehan.doubao.model.entity.UmsUser;

/**
 * @ClassName: IUmsUserService
 * @Description:
 * @Author: lxs
 * @Date: 2022/6/26 21:26
 * @Version: v1.0
 */

public interface IUmsUserService extends IService<UmsUser> {
    UmsUser executeRegister(RegisterDTO dto);
    /**
     * 获取用户信息
     *
     * @param username
     * @return dbUser
     */
    UmsUser getUserByUsername(String username);
    /**
     * 用户登录
     *
     * @param dto
     * @return 生成的JWT的token
     */
    String executeLogin(LoginDTO dto);
}
