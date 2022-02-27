package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;

@WebServlet("/Userlogin")
public class Userlogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("uname");
		String pass = req.getParameter("pass");

		LoginDao dao = new LoginDao();
		/* if (name.equals("ram") && pass.equals("ram")) { */
		if (dao.check(name, pass)) {
			HttpSession session = req.getSession();
			session.setAttribute("uname", name);
			resp.sendRedirect("Welcome.jsp");
		} else {

			resp.sendRedirect("login.jsp");
		}

	}
}
