package com.saraya;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/delete.do")
public class DeleteServlet extends HttpServlet {
	BikeService bs = new BikeService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String bikeId = request.getParameter("id");
		int id=Integer.parseInt(bikeId);
		bs.deleteById(id);
		response.sendRedirect("/bike.do");
	}
	



}


