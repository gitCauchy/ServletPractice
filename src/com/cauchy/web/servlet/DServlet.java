package com.cauchy.web.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DServlet extends GenericServlet {

	public void init() throws ServletException{
		System.out.println("hahaha");
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("hello world");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("goodbye world");
	}
}
