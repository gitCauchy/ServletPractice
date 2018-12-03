package com.cauchy.web.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AServlet implements Servlet{

	/**
	 * 是生命周期方法，会在对象被销毁之前来执行，并只执行一次。
	 */
	public void destroy() {
		System.out.println("destory......");
		
	}

	/**
	 * 获取配置信息
	 */
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig......");
		return null;
	}

	/**
	 * 获取servlet的信息
	 */
	public String getServletInfo() {
		System.out.println("getServletInfo......");
		return null;
	}

	/**
	 * 是生命周期方法，会在servlet对象创建之后马上执行，并只执行一次
	 */
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("init.......");
		/**
		 * 获取初始化参数
		 */
		System.out.println(servletConfig.getInitParameter("p1"));
		System.out.println(servletConfig.getInitParameter("p2"));
		// 获取所有初始化参数的名称
		Enumeration e = servletConfig.getInitParameterNames();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

	/**
	 * 是生命周期方法，会被调用多次，每次处理请求都是调用这个方法。
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service......");
	}

}
