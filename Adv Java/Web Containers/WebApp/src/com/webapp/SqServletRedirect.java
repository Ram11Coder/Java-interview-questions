package com.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sqRedirect")
public class SqServletRedirect extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("SqServletRedirect");
		/*
		 * 1. Url rewrite int k = Integer.parseInt(req.getParameter("k"));
		 */
		/*
		 * 2. Session HttpSession session = req.getSession(); int k = (int)
		 * session.getAttribute("k");
		 */
		int k = 0;
		Cookie cookies[] = req.getCookies();
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("k")) {
				k = Integer.parseInt(cookie.getValue());
			}
		}
		k *= k;
		PrintWriter out = resp.getWriter();
		out.write("Result -> " + k);
		out.println("Hi<br/>");

		ServletContext ctx = getServletContext();
		String name = ctx.getInitParameter("Name");
		out.println(name);

		ServletConfig cfg = getServletConfig();
		name = cfg.getInitParameter("Name");
		out.println(name); 
	}
}
