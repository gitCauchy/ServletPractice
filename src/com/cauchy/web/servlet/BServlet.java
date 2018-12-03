package com.cauchy.web.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 * 模拟GenericServlet
 * @author Cauchy
 *
 */
public class BServlet implements Servlet {
	private ServletConfig servletConfig;
	
	public void destroy() {
		System.out.println("Servlet destory.....");
		
	}

	// 这个方法一定会在init方法之后被调用，init被调用之后，this.servletConfig一定会有值。
	public ServletConfig getServletConfig() {
		
		
		return this.servletConfig;
	}

	// 实现与否无所谓
	public String getServletInfo() {
		
		
		return null;
	}

	// tomcat来调用并只调用一次，是这些方法中第一个被调用，会在构造器之后第一个被调用
	public void init(ServletConfig servletConfig) throws ServletException {
		// 把Tomcat传递的servletConfig赋值给本类的一个成员，
	    // 其实就是把它保存起来，方便之后调用。
		this.servletConfig = servletConfig;
		init();
		
	}
	public void init() {
		
	}
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// 每次处理请求都会被调用
		// 这里可以使用servletConfig
		
	}
	
	public ServletContext getServletContext() {
		return servletConfig.getServletContext();
	}
	public String getServletName() {
		return servletConfig.getServletName();
	}
	public String getInitParameter(String name) {
		return servletConfig.getInitParameter(name);
	}
}
