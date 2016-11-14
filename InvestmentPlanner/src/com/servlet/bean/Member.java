package com.servlet.bean;

public class Member {
	private String memberName;
	private String memberCurrentAge;
	private int memberRetirementAge;
	private int memberFamilySize;
	private String acceptableRiskLevel;
	private String premiumPerMonth;
	private String retirementFund;
	private String educationFund;
	private String healthFund;

	public String getPremiumPerMonth() {
		return premiumPerMonth;
	}
	public void setPremiumPerMonth(String premiumPerMonth) {
		this.premiumPerMonth = premiumPerMonth;
	}
	public String getRetirementFund() {
		return retirementFund;
	}
	public void setRetirementFund(String retirementFund) {
		this.retirementFund = retirementFund;
	}
	public String getEducationFund() {
		return educationFund;
	}
	public void setEducationFund(String educationFund) {
		this.educationFund = educationFund;
	}
	public String getHealthFund() {
		return healthFund;
	}
	public void setHealthFund(String healthFund) {
		this.healthFund = healthFund;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getMemberCurrentAge() {
		return memberCurrentAge;
	}
	public void setMemberCurrentAge(String memberCurrentAge) {
		this.memberCurrentAge = memberCurrentAge;
	}
	public int getMemberRetirementAge() {
		return memberRetirementAge;
	}
	public void setMemberRetirementAge(int memberRetirementAge) {
		this.memberRetirementAge = memberRetirementAge;
	}
	public int getMemberFamilySize() {
		return memberFamilySize;
	}
	public void setMemberFamilySize(int memberFamilySize) {
		this.memberFamilySize = memberFamilySize;
	}
	public String getAcceptableRiskLevel() {
		return acceptableRiskLevel;
	}
	public void setAcceptableRiskLevel(String acceptableRiskLevel) {
		this.acceptableRiskLevel = acceptableRiskLevel;
	}	
}
