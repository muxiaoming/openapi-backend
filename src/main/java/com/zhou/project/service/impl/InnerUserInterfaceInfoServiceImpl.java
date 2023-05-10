package com.zhou.project.service.impl;

import com.zhou.common.model.entity.UserInterfaceInfo;
import com.zhou.common.service.InnerUserInterfaceInfoService;

/**
 * @Author: code muxiaoming
 * @DateCreatedIn: 2023/5/10 23:03
 * @Description:
 */
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {
    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add) {

    }

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return false;
    }
}
