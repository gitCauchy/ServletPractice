package com.cauchy.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 防盗链
 * @author Cauchy
 *
 */
public class RServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
		// 使用referer请求头实现防盗链
		String referer = request.getHeader("Referer");
		System.out.println(referer);
	}
	
}
