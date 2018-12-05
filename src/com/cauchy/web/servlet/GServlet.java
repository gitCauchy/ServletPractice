package com.cauchy.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GServlet extends HttpServlet{
	/**
	 * 演示向ServletContext中获取数据
	 * @author Cauchy
	 *
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		/*
		 * 1.获取ServletContext对象
		 * 2、调用setAttribute方法保存数据
		 */
		ServletContext application = this.getServletContext();
		String name = (String) application.getAttribute("name");
		//System.out.println(name);
		// 统计访问量
		Integer count = (Integer)application.getAttribute("count");
		if(count == null) {
			application.setAttribute("count", 1);
		}else {
			application.setAttribute("count", count+1);
		}
		// 向浏览器输出
		PrintWriter pw = response.getWriter();
		pw.print("<h1>" + count + "</h1>");
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
	}
	
}
