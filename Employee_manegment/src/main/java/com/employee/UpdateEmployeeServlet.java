package com.employee;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateEmployeeServlet")
public class UpdateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("empid");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone_no = request.getParameter("phone_no");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String department = request.getParameter("department");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = EmployeeDBUtil.updateemployee(id, name, address, phone_no, gender, age, department, username, password);
		
		if(isTrue == true) {
			
			List<Employee> empDetails = EmployeeDBUtil.getEmployeeDetails(id);
			request.setAttribute("empDetails", empDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("userprofile.jsp");
			dis.forward(request, response);
		}else {
			
			List<Employee> empDetails = EmployeeDBUtil.getEmployeeDetails(id);
			request.setAttribute("empDetails", empDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("uerprofile.jsp");
			dis.forward(request, response);
		}
	}

}
