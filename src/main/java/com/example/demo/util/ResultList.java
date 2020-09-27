package com.example.demo.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @description:
 * @author: huangyixin
 * @create: 2020/9/24 16:39
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultList<T> implements Serializable {
    private static final long serialVersionUID = -1707214407705331009L;

    /**
     * 结果列表
     */
    List<T> list;

    /**
     * 结果总数
     */
    Long total;

    /**
     * 每页大小
     */
    Integer pageSize;

    /**
     * 页码
     */
    Integer pageNum;
}
