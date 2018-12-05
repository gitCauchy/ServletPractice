package com.cauchy.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		System.out.println("doPost");
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		System.out.println("doGet");
	}
	
}
