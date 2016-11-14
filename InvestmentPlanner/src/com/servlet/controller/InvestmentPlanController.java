package com.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.bean.Member;
import com.servlet.service.MemberService;

/**
 * Servlet implementation class InvestmentPlanController
 */
public class InvestmentPlanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvestmentPlanController() {
        super();
        System.out.println("Lava printing11");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Lava printing12");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Lava printing0");
		String str = request.getParameter("action");
		if(str.equals("updating")){
			Member st = new Member();			
			st.setMemberCurrentAge(request.getParameter("memberage"));			
			MemberService service = new MemberService();
			System.out.println("Lava printing1");
			//Member stud = service.extractInvestmentPlan(st.getMemberCurrentAge());
			
			Member stud = new Member(); 
			stud.setMemberCurrentAge(st.getMemberCurrentAge());
			System.out.println("Lava printing2");
			stud.setPremiumPerMonth("100");
			request.setAttribute("stud",stud);
			System.out.println("Lava printing3");
			RequestDispatcher req = request.getRequestDispatcher("investmentPlanOutput.jsp");
			req.forward(request,response);
		}
	}
}
