package com.design.patterns.chain.levels.leve;

import com.design.patterns.chain.levels.PurchaseRequest;
import com.design.patterns.chain.levels.Approver;

/**
 * 院长级别
 */
public class CollegeApprover extends Approver {

	public CollegeApprover(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() < 5000 && purchaseRequest.getPrice() <= 10000) {
			System.out.println(" 请求 id= " + purchaseRequest.getId() + " 被" + this.name + " 处理");
		}else {
			approver.processRequest(purchaseRequest);
		}
	}
}
