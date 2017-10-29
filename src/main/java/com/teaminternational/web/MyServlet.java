package com.teaminternational.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teaminternational.HelloWorldGenerator;

@WebServlet("/MyServlet")
public class MyServlet extends BaseHttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doGet(req, resp);
		HelloWorldGenerator generator = getBean(HelloWorldGenerator.COMPONENT_NAME);
		String hello = generator.sayHello();
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
        out.println("<title>Hola</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(hello);
        out.println("</body>");
        out.println("</html>");
	}
}
