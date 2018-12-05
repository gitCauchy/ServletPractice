package com.cauchy.web.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 演示向ServletContext中保存数据
 * @author Cauchy
 *
 */
public class FServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		/*
		 * 1.获取ServletContext对象
		 * 2、调用setAttribute方法保存数据
		 */
		ServletContext application = this.getServletContext();
		application.setAttribute("name", "Cauchy");
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
	}
}
