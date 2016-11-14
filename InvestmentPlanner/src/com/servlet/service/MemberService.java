package com.servlet.service;

import com.servlet.bean.Member;
import com.servlet.util.MemberUtil;

public class MemberService {
	public Member extractInvestmentPlan(String memberAge){
		MemberUtil util = new MemberUtil();
		return util.searchInvestmentPlan(memberAge);		
	}
	
}
