package com.design.patterns.chain;

import com.design.patterns.chain.levels.Approver;
import com.design.patterns.chain.levels.PurchaseRequest;
import com.design.patterns.chain.levels.leve.CollegeApprover;
import com.design.patterns.chain.levels.leve.DepartmentApprover;
import com.design.patterns.chain.levels.leve.SchoolMasterApprover;
import com.design.patterns.chain.levels.leve.ViceSchoolMasterApprover;

public class Client {

	public static void main(String[] args) {
		//创建请求
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 9000, 1);
		
		//创建审批人
		Approver departmentApprover = new DepartmentApprover("张主任");
		Approver collegeApprover = new CollegeApprover("李院长");
		Approver viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校长");
		Approver schoolMasterApprover = new SchoolMasterApprover("童校长");
	
	
		//将各个审批级别的下一个设置好(处理人构成环形)
		//主任
		departmentApprover.setApprover(collegeApprover);
		//院长
		collegeApprover.setApprover(viceSchoolMasterApprover);
		//副校长
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		//校长
		schoolMasterApprover.setApprover(departmentApprover);
		
		//开始处理请求
		departmentApprover.processRequest(purchaseRequest);
//		collegeApprover.processRequest(purchaseRequest);
//		viceSchoolMasterApprover.processRequest(purchaseRequest);
//		schoolMasterApprover.processRequest(purchaseRequest);
	}

}
