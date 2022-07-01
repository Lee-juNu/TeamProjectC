package com.sm.hc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BoardPageC")
public class BoardPageC extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int p = Integer.parseInt(request.getParameter("p")); //���� �Ķ���� ��
		
		AccountDAO.loginCheck(request);
		AccountDAO.getAllFree(request);
		AccountDAO.paging(p, request);
		
		request.setAttribute("contentPage", "jsp/sm/boardFree.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}