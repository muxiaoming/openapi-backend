package com.zhou.project.service.impl.inner;

import com.zhou.common.model.entity.InterfaceInfo;
import com.zhou.common.service.InnerInterfaceInfoService;
import com.zhou.project.common.ErrorCode;
import com.zhou.project.exception.BusinessException;
import com.zhou.project.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @Author: code muxiaoming
 * @DateCreatedIn: 2023/5/10 22:57
 * @Description:
 */
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoService interfaceInfoService;

    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        if (StringUtils.isAnyBlank(url, method)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        return interfaceInfoService.lambdaQuery()
                .eq(InterfaceInfo::getUrl, url)
                .eq(InterfaceInfo::getMethod, method)
                .one();
    }
}
