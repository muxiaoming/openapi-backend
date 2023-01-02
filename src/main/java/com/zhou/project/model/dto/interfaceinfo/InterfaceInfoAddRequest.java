package com.zhou.project.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建请求
 *
 */
@Data
public class InterfaceInfoAddRequest implements Serializable {

    /**
     * 接口名称
     */
    private String name;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 方法类型
     */
    private String method;

    /**
     * 请求参数
     */
    private String requestParams;

    /**
     * 接口状态:0:关闭,1开启
     */
    private Integer status;

    /**
     * 接口描述
     */
    private String description;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;
}