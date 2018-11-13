package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo4
 */
@WebServlet("/Demo4")
public class Demo4 extends HttpServlet {
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
		String[] subjects={"English","Physics", "Maths"};
		double[] marks={70.0,75.0,81.0};
		int i,j;
		double total=0;
		
		out.println("<table><tr><th>Subjects</th><th>Marks</th></tr>");
	
		for (i=0; i< marks.length;i++) {
			out.println("<tr>");
			out.print("<td>");
			out.println(subjects[i]);
			out.print("</td>");
			out.print("<td>");
			out.println(marks[i]);
			out.print("</td>");
			out.println("<tr>");
			total=total+marks[i];
		}
			
			out.println("TOTAL=");
			
			
			
		}	

}
