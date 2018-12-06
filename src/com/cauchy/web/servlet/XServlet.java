package com.cauchy.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		// 先获取iso错误字符串
		String username = request.getParameter("username");
		byte[] b = username.getBytes("iso-8859-1");
		username = new String(b,"utf-8");
		System.out.println(username);
		// 回退，重新编码
		//
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		/*
		 * 在获取参数之前需要调用request.setCharacterEncoding("utf-8")
		 * 
		 */
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		System.out.println(username);
	}
}
