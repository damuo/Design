package com.design.patterns.chain.levels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Classname PurchaseRequest
 * @Description 请求类
 * @Date 2020/3/6 19:30
 * @Created by yang
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PurchaseRequest {
    /**
     * 请求类型
     */
    private int type=0;
    /**
     * 金额
     */
    private float price=0.0f;
    /**
     * 请求ID
     */
    private int id=0;
}
