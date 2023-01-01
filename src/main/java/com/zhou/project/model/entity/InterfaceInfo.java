package com.zhou.project.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * @Author: code muxiaoming
 * @Date Created in 2022/11/19 20:47
 * @Description:
 * @Modified By:
 * @version: $
 */

/**
 * 接口信息表
 *
 * @author ASUS
 * @TableName interface_info
 */
@TableName(value = "interface_info")
@Data
public class InterfaceInfo implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

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
     * 请求参数: type可以使用json的类型
     * [
     *   {"name":"username", "type":"string"},
     *   {"name":"xxx", "type":"number"}
     * ]
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

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人id
     */
    private Long createId;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除(0-未删, 1-已删)
     * 逻辑删除注解
     */
    @TableLogic
    private Integer idDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}