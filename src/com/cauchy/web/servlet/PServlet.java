package com.cauchy.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 获取客户端的IP地址，获取请求方式，获取User-agent
 * @author Cauchy
 *
 */
public class PServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		String addr = request.getRemoteAddr();
		System.out.println(addr);
		String getMethod = request.getMethod();
		System.out.println(getMethod);
		String userAgent = request.getHeader("User-Agent");
		System.out.println(userAgent);
	}
}
