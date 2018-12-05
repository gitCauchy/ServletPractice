package com.cauchy.web.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
		System.out.println("GET:" + request.getParameter("xxx"));
		System.out.println("GET:" + request.getParameter("yyy"));
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String[] test = request.getParameterValues("test");
		System.out  .println(username + "," + password + Arrays.toString(test));
		// 测试获取所有参数名称
		Enumeration names = request.getParameterNames();
		while(names.hasMoreElements()) {
			System.out.println(names.nextElement());
		}
		// 获取所有请求参数封装在Map中：
		Map<String,String[]> map = request.getParameterMap();
		for(String name:map.keySet()) {
			String[] values = map.get(name);
			System.out.println(name + Arrays.toString(values));
		}
	}
}
