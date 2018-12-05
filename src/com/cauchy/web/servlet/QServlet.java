package com.cauchy.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		/**
		 * 获取URL相关方法
		 * 
		 */
		response.getWriter().print(request.getScheme() + "<br/>");// 获取请求协议
		response.getWriter().print(request.getServerName() + "<br/>"); // 获取服务器名称
		response.getWriter().print(request.getServerPort() + "<br/>");  // 端口
		response.getWriter().print(request.getContextPath() + "<br/>"); // 项目名
		response.getWriter().print(request.getServletPath() + "<br/>"); // servlet路径
		response.getWriter().print(request.getRequestURI() + "<br/>"); // URI
		response.getWriter().print(request.getRequestURL() + "<br/>"); // 请求URL
	}
}
