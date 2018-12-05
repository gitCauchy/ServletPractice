package com.cauchy.web.servlet;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 演示ServletContext获取公共初始化参数
 * @author Cauchy
 *
 */
public class HServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		ServletContext application = this.getServletContext();
		String contextValue = application.getInitParameter("context-param");
		System.out.println(contextValue);
	}
}
