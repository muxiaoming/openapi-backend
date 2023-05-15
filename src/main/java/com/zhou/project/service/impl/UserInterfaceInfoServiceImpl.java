package com.zhou.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhou.common.model.entity.UserInterfaceInfo;
import com.zhou.project.common.ErrorCode;
import com.zhou.project.exception.BusinessException;
import com.zhou.project.mapper.UserInterfaceInfoMapper;
import com.zhou.project.service.UserInterfaceInfoService;
import org.springframework.stereotype.Service;

/**
 * @author ASUS
 * @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service实现
 * @createDate 2023-03-08 23:29:20
 */
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
        implements UserInterfaceInfoService {

    /**
     * 校验
     *
     * @param userInterfaceInfo
     * @param add 是否为创建校验
     */
    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add) {
        if (userInterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 创建时，所有参数必须非空
        if (add) {
            // ObjectUtils.anyNull(status)
            if (userInterfaceInfo.getInterfaceInfoId() <= 0 || userInterfaceInfo.getUserId() <= 0) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR, "接口或用户不存在");
            }
        }
        if (userInterfaceInfo.getLeftNum() < 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "剩余调用次数不能小于 0");
        }

    }

    /**
     * 调用次数加1
     *
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        // 校验
        if (interfaceInfoId <= 0 || userId <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        return this.lambdaUpdate()
                .eq(UserInterfaceInfo::getId, interfaceInfoId)
                .eq(UserInterfaceInfo::getUserId, userId)
                // 这里要加锁和事务, 防止狗日的用户在次数快用完时疯狂刷调用次数, 调用次数还得大于0, 后面再来实现这个
                //.gt(UserInterfaceInfo::getLeftNum, 0)
                .setSql("leftNum = leftNum - 1, totalNum = totalNum +1")
                .update();
    }
}




