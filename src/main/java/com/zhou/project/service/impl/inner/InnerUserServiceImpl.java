package com.zhou.project.service.impl.inner;

import com.zhou.common.model.entity.User;
import com.zhou.common.service.InnerUserService;
import com.zhou.project.common.ErrorCode;
import com.zhou.project.exception.BusinessException;
import com.zhou.project.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @Author: code muxiaoming
 * @DateCreatedIn: 2023/5/10 22:55
 * @Description:
 */
@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserService userService;

    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isBlank(accessKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        return userService.lambdaQuery()
                .eq(User::getAccessKey, accessKey)
                .one();
    }
}
