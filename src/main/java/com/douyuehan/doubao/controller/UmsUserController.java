package com.douyuehan.doubao.controller;

import com.douyuehan.doubao.common.api.ApiResult;
import com.douyuehan.doubao.model.Dto.RegisterDTO;
import com.douyuehan.doubao.model.entity.UmsUser;
import com.douyuehan.doubao.service.IUmsUserService;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: UmsUserController
 * @Description:
 * @Author: lxs
 * @Date: 2022/6/26 21:18
 * @Version: v1.0
 */
@RequestMapping("/ums/user")
public class UmsUserController extends BaseController {
    @Resource
    IUmsUserService iUmsUserService;
    @RequestMapping("/register")
    public ApiResult<Map<String, Object>> register(@RequestBody RegisterDTO dto) {
        UmsUser user = iUmsUserService.executeRegister(dto);
        if (ObjectUtils.isEmpty(user)) {
            return ApiResult.failed("账号注册失败");
        }
        Map<String, Object> map = new HashMap<>(16);
        map.put("user", user);
        return ApiResult.success(map);
    }
}
