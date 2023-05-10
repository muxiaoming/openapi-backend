package com.zhou.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhou.common.model.entity.InterfaceInfo;
import com.zhou.project.common.ErrorCode;
import com.zhou.project.exception.BusinessException;
import com.zhou.project.mapper.InterfaceInfoMapper;
import com.zhou.project.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
/**
 * @Author: code muxiaoming
 * @Date Created in 2022/11/19 20:47
 * @Description:
 * @Modified By:
 * @version: $
 */

/**
 * @author ASUS
 * @description 针对表【interface_info(接口信息表)】的数据库操作Service实现
 * @createDate 2022-11-19 20:47:12
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
  implements InterfaceInfoService {

  /**
   * 校验
   *
   * @param interfaceInfo
   * @param add           是否为创建校验
   */
  @Override
  public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
    if (interfaceInfo == null) {
      throw new BusinessException(ErrorCode.PARAMS_ERROR);
    }
    String name = interfaceInfo.getName();
    String url = interfaceInfo.getUrl();
    String method = interfaceInfo.getMethod();
    Integer status = interfaceInfo.getStatus();
    String description = interfaceInfo.getDescription();
    String requestHeader = interfaceInfo.getRequestHeader();
    String responseHeader = interfaceInfo.getResponseHeader();
    // 创建时，所有参数必须非空
    if (add) {
      // ObjectUtils.anyNull(status)
      if (StringUtils.isAnyBlank(name, url, method, description, requestHeader, responseHeader)) {
        throw new BusinessException(ErrorCode.PARAMS_ERROR);
      }
    }
    if (StringUtils.isNotBlank(name) && name.length() > 50) {
      throw new BusinessException(ErrorCode.PARAMS_ERROR, "接口名称过长");
    }
    //具体地对属性进行校验
        /*if (age != null && (age < 18 || age > 100)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "年龄不符合要求");
        }
        if (gender != null && !PostGenderEnum.getValues().contains(gender)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "性别不符合要求");
        }*/
  }
}




