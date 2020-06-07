package com.design.patterns.chain.levels.leve;

import com.design.patterns.chain.levels.PurchaseRequest;
import com.design.patterns.chain.levels.Approver;

/**
 * 校长级别
 */
public class SchoolMasterApprover extends Approver {

	public SchoolMasterApprover(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() > 30000) {
			System.out.println(" 请求 id= " + purchaseRequest.getId() + " 被" + this.name + " 处理");
		}else {
			approver.processRequest(purchaseRequest);
		}
	}
}
