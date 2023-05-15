package com.zhou.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhou.common.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author ASUS
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Mapper
* @createDate 2023-03-08 23:29:20
* @Entity com.zhou.project.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {


    /**
     *  获取历史总调用次数前三的接口(其实我觉得要加时间比如说近一年,或者近三个月, 或者多写几个接口)
     * @param limit
     * @return
     */
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);

}




