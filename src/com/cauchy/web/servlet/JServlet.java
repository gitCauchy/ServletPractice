package com.cauchy.web.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获取类路径下的资源
 * @author Cauchy
 *
 */
public class JServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException,IOException{
		// 得到classLoader
		ClassLoader cl =  this.getClass().getClassLoader();
		// 调用getResourceAsStream
		InputStream input = cl.getResourceAsStream("test.txt");
	}
}
