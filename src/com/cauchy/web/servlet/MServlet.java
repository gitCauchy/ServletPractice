package com.cauchy.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 定时刷新
 */
public class MServlet extends HttpServlet {
	// 设置refresh:表示定时刷新
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		// 下面用来发送响应体：
		PrintWriter writer = response.getWriter();
		writer.print("go to another page after 5s ");
		// 设置响应头：
		response.setHeader("Refresh", "5;URL=/servletPractice/HttpServletTestL");
	}
}
