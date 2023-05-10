package com.zhou.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhou.common.model.entity.InterfaceInfo;
/**
 * @Author: code muxiaoming
 * @Date Created in 2022/11/19 20:47
 * @Description:
 * @Modified By:
 * @version: $
 */
/**
* @author ASUS
* @description 针对表【interface_info(接口信息表)】的数据库操作Service
* @createDate 2022-11-19 20:47:12
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add 是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
