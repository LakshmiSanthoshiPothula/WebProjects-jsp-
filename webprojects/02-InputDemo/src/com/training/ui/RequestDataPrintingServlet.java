package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDataPrintingServlet
 */
@WebServlet("/RequestDataPrintingServlet")
public class RequestDataPrintingServlet extends HttpServlet {
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
		out.println(request.getRequestURI());
		out.println("<br>");
		out.println(request.getRequestURL());
		out.print("<br>");
		out.print(request.getServerName());
		out.print("<br>");
		out.print(request.getServerPort());
		out.print("<br>");
		out.print(request.getServletPath());
		out.print("<br>");
		out.print(request.getLocale());
		out.print("<br>");
		out.print(request.getLocalName());
		out.print("<br>");
		out.print(request.getRemoteAddr());
		out.print("<br>");
		out.print(request.getRemotePort());
		out.print("<br>");
		out.print(request.getRemoteHost());
		out.print("<br>");
		out.print(request.getRemoteUser());
		out.print("<br>");
		
		
		
	}

}
