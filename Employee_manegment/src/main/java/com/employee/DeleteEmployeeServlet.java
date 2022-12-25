package com.employee;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("empid");
	
		boolean isTrue;
		
		isTrue = EmployeeDBUtil.deleteemployee(id);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("employeeinsert.jsp");
			dis.forward(request, response);
		}else {
			
			List<Employee> empDetails = EmployeeDBUtil.getEmployeeDetails(id);
			request.setAttribute("empDetails", empDetails);
			RequestDispatcher dis = request.getRequestDispatcher("userprofile.jsp");
			dis.forward(request, response);
		}
	}

}
