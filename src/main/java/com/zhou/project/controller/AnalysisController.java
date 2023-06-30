package com.zhou.project.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.collection.CollectionUtil;
import com.zhou.common.model.entity.InterfaceInfo;
import com.zhou.common.model.entity.UserInterfaceInfo;
import com.zhou.common.model.vo.InterfaceInfoVO;
import com.zhou.project.annotation.AuthCheck;
import com.zhou.project.common.BaseResponse;
import com.zhou.project.common.ErrorCode;
import com.zhou.project.common.ResultUtils;
import com.zhou.project.exception.BusinessException;
import com.zhou.project.mapper.UserInterfaceInfoMapper;
import com.zhou.project.service.InterfaceInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: code muxiaoming
 * @DateCreatedIn: 2023/5/15 20:03
 * @Description:
 */
@CrossOrigin
@RestController
@Slf4j
@RequestMapping("/analysis")
public class AnalysisController {

    @Resource
    private UserInterfaceInfoMapper userInterfaceInfoMapper;

    @Resource
    private InterfaceInfoService interfaceInfoService;

    @GetMapping("/top/interface/invoke")
    @AuthCheck(mustRole = "admin")
    public BaseResponse<List<InterfaceInfoVO>> listTopInvokeInterfaceInfo() {
        List<UserInterfaceInfo> userInterfaceInfoList = userInterfaceInfoMapper.listTopInvokeInterfaceInfo(4);
        if (CollectionUtil.isEmpty(userInterfaceInfoList)) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR);
        }
        List<Long> interfaceInfoIdList = userInterfaceInfoList.stream()
                .map(UserInterfaceInfo::getInterfaceInfoId)
                .distinct().collect(Collectors.toList());
        List<InterfaceInfo> interfaceInfoList = interfaceInfoService.listByIds(interfaceInfoIdList);
        List<InterfaceInfoVO> resultList = new ArrayList<>();
        for (UserInterfaceInfo userInterfaceInfo : userInterfaceInfoList) {
            InterfaceInfoVO vo = new InterfaceInfoVO();
            vo.setId(userInterfaceInfo.getInterfaceInfoId());
            vo.setTotalNum(userInterfaceInfo.getTotalNum());
            for (InterfaceInfo interfaceInfo : interfaceInfoList) {
                if (interfaceInfo.getId().equals(userInterfaceInfo.getInterfaceInfoId())) {
                    BeanUtil.copyProperties(interfaceInfo, vo,
                            CopyOptions.create().setIgnoreNullValue(true));
                    resultList.add(vo);
                    break;
                }
            }
        }
        return ResultUtils.success(resultList);
    }
}
