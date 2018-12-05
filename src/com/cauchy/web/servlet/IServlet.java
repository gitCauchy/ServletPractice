package com.cauchy.web.servlet;

import java.io.InputStream;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 获取资源路径
 * @author Cauchy
 *
 */
public class IServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		ServletContext application = this.getServletContext();
		// 得到的是有盘符的路径
		String path = this.getServletContext().getRealPath("/index.jsp");
		System.out.println(path);
		// 获取流对象：
		InputStream input = this.getServletContext().getResourceAsStream("/index.jsp");
		// 获取当前路径下所有资源的数据：
		Set<String> pathes = this.getServletContext().getResourcePaths("/WEB-INF");
		System.out.println(pathes);
	}
}
