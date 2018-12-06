package com.cauchy.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException,IOException{
		System.out.println("V Servlet.....");
		response.setHeader("aaa", "AAA"); //设置响应头
		response.getWriter().print("Hello VServlet"); // 设置响应体
		// 等同于调用UServlet的service方法
		request.getRequestDispatcher("/HttpServletTestW").include(request, response);// 请求包含
	}
}
