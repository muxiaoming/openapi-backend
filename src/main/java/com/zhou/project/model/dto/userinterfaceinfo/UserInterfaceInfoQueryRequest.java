package com.zhou.project.model.dto.userinterfaceinfo;

import com.zhou.project.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询请求
 *
 * @author zhou
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserInterfaceInfoQueryRequest extends PageRequest implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 部调用次数
     */
    private Integer totalNum;

    /**
     * 剩余调用次数
     */
    private Integer leftNum;

    /**
     * 0-正常, 1-禁用
     */
    private Integer status;

    /**
     * 是否删除0-未删, 1-已删
     */
    private Integer isDelete;

}