package com.webapp;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddUrlRedirectServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int i = Integer.parseInt(req.getParameter("num1").toString());
		int j = Integer.parseInt(req.getParameter("num2").toString());
		int k = i + j;
		/*
		 * 1. URL Rewriting resp.sendRedirect("sqRedirect?k=" + k);
		 */
		/*
		 * 2. Session HttpSession session = req.getSession();
		 * 
		 * session.setAttribute("k", k);
		 */
		List<Student> studs = Arrays.asList(new Student(1, "Rocky"), new Student(2, "Raj"));
		req.setAttribute("k", k);
		req.setAttribute("Students", studs);
		RequestDispatcher rd = req.getRequestDispatcher("Display.jsp");
		rd.forward(req, resp);
		/*
		 * 3.Cookies Cookie cookie = new Cookie("k", k + ""); resp.addCookie(cookie);
		 */
		// resp.sendRedirect("sqRedirect");
		// resp.sendRedirect("add.jsp");
	}
}
