package com.cauchy.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 请求转发
 * @author Cauchy
 *
 */
public class TServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		System.out.println("T Servlet.....");
		response.setHeader("aaa", "AAA"); //设置响应头
		response.getWriter().print("Hello TServlet"); // 设置响应体
		// 等同于调用UServlet的service方法
		request.setAttribute("aaa", "AAA");
		request.getRequestDispatcher("/HttpServletTestU").forward(request, response);// 请求转发
	}
}
