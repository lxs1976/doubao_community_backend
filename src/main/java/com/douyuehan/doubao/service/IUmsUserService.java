package com.douyuehan.doubao.service;

import com.baomidou.mybatisplus.extension.service.IService;
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
}
