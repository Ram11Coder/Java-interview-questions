package com.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

//Refer servlet api source code
public class AddServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, javax.servlet.http.HttpServletResponse resp)
			throws ServletException, IOException {

		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int k = num1 + num2;
		System.out.println(k);

		PrintWriter out = resp.getWriter();
		out.println("Result : " + k);

	}

	@Override
	protected void doGet(HttpServletRequest req, javax.servlet.http.HttpServletResponse resp)
			throws ServletException, IOException {

		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int k = num1 + num2;
		// System.out.println(k);
		req.setAttribute("k", k);
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, resp);
	

	}
}
