package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Customer;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Customer customer=new Customer();
		
		String strId=request.getParameter("txtId");
		if(strId!=null){
		int id=Integer.parseInt(strId);
		customer.setId(id);
		}
		
		String strName=request.getParameter("txtName");
		if(strName!=null){

		customer.setName(strName);
		}
		
		String strGender=request.getParameter("radGender");
		if(strGender!=null){
			
		int gender=Integer.parseInt(strGender);
		customer.setGender(gender);
		}
		
		String strIsPrivilage=request.getParameter("chkPrivilaged");
		if(strIsPrivilage==null){
			customer.setPrevileage(false);
	
		}else{
			if(strIsPrivilage.equals("yes")){
				customer.setPrevileage(true);
				
			}
		}
		
		String strDOJ=request.getParameter("txtDOJ");
		if(strDOJ!=null){
         SimpleDateFormat sdf=new SimpleDateFormat("YYYY-mm-dd");
         Date doj;
		try {
			doj = sdf.parse(strDOJ);
			customer.setDateOfJoining(doj);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		String strEmail=request.getParameter("email");
		if(strEmail!=null){

		customer.setEmail(strEmail);
		}
		

		String strPhone=request.getParameter("phone");
		if(strPhone!=null){

		customer.setPhone(strPhone);
		}
		

		String strAddress=request.getParameter("address");
		if(strAddress!=null){

		customer.setAddress(strAddress);
		}
		

		String strDescription=request.getParameter("desc");
		if(strDescription!=null){

		customer.setDescription(strDescription);
		}
		
		String strbalance=request.getParameter("bal");
		if(strbalance!=null){
		double balance=Double.parseDouble(strbalance);
		customer.setBalanceAmount(balance);
		}
		
		String strRating=request.getParameter("txtRating");
		if(strRating!=null){
			int rate=Integer.parseInt(strRating);
		customer.setCustomerRating(rate);
		}
		
		
		
		
		out.println(customer.getId());
		out.println(customer.getName());
		out.println(customer.getGender());
		out.println(customer.getEmail());
		out.println(customer.getPhone());
		out.println(customer.getDateOfJoining());
		out.println(customer.getDescription());
		out.println(customer.getCustomerRating());
		out.println(customer.getBalanceAmount());
		
	}

}
