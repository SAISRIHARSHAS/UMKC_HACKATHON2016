package com.servlet.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.servlet.bean.Member;

public class MemberUtil {
	
	public Member searchInvestmentPlan(String memberAge) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Member mem = new Member();		
		try{
			con = DBUtil.getConnection();			
			String str = "select * from TBL_MemberInvestmentPlan where member_Current_Age = ?";
			ps = con.prepareStatement(str);
			ps.setString(1,memberAge);
			rs = ps.executeQuery();
			while(rs.next()){
				mem.setRetirementFund(rs.getString(5));
				mem.setPremiumPerMonth(rs.getString(6));
				mem.setEducationFund(rs.getString(7));
				mem.setHealthFund(rs.getString(8));				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return mem;
	}
}
