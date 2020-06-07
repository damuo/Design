package com.design.patterns.chain.levels;

import lombok.Data;

/**
 * @Classname Approver
 * @Description 抽象类
 * @Date 2020/3/6 19:37
 * @Created by yang
 */

@Data
public abstract class Approver {
    /**
     * 下一个处理者
     */
    protected Approver approver;
    /**
     * 处理者名字
     */
    protected String name;

    public  Approver(String name){
        this.name=name;
    }

    //处理审批请求的方法，得到一个请求, 处理是子类完成，因此该方法做成抽象
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
