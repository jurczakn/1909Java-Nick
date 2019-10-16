package com.revature.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.pojo.Furniture;
import com.revature.pojo.User;
import com.revature.service.FurnitureService;
import com.revature.service.UserService;
import com.revature.service.UserServiceImpl;

/**
 * Servlet implementation class FurnitureServlet
 */
public class FurnitureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static FurnitureService furnitureService = new FurnitureService();
	private static UserService userService = new UserServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FurnitureServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ObjectMapper om = new ObjectMapper();

		String name = request.getPathInfo();

		if (name != null && !"".equals(name.substring(1))) {
			response.getWriter().write(om.writeValueAsString(furnitureService.findByName(name.substring(1))));
		} else {

			List<Furniture> furnitureList = furnitureService.findAllFurniture();

			response.getWriter().write(om.writeValueAsString(furnitureList));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String body = request.getReader().readLine();
		System.out.println(body);
		ObjectMapper om = new ObjectMapper();
		Furniture furniture = om.readValue(body, Furniture.class);
		User owner = userService.getUserByUsername(furniture.getOwner().getUsername());
		if (owner != null) {
			furniture.setOwner(owner);
		} else {
			response.getWriter().write(
					"Failure: owner " + furniture.getOwner().getUsername() + " is not registered in our system.");
			return;
		}
		System.out.println(furniture);
		furnitureService.makeFurniture(furniture);
		System.out.println(furnitureService.findAllFurnitureForUser(owner));
		response.getWriter().write("Success");

	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
