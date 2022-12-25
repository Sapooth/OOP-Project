package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static List<Employee> validate(String username, String password){
		
		ArrayList<Employee> emp = new ArrayList<>();
		
	
		
		//validate 
		
		try { 
			
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from employee_details where username='"+username+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String phone = rs.getString(4);
				String gender = rs.getString(5);
				String age = rs.getString(6);
				String department = rs.getString(7);
				String userU = rs.getString(8);
				String passU = rs.getString(9);
				
				Employee e = new Employee(id,name,address,phone,gender,age,department,userU,passU);
				emp.add(e);
						
			}
		}
		catch(Exception e ) {
			e.printStackTrace(); 
		}
		
		
		return emp;
	}
	
	public static boolean insertemployee(String name, String address, String phone, String gender, String age, String department, String username, String password) {
		
		boolean isSuccess = false;
		
		
		try {
			
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String sql = "insert into employee_details values(0,'"+name+"','"+address+"','"+phone+"','"+gender+"','"+age+"','"+department+"','"+username+"','"+password+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean updateemployee(String id, String name, String address, String phone_no, String gender, String age, String department, String username, String password ) {
		
		try {
			
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "update employee_details set name='"+name+"',address='"+address+"',phone_no='"+phone_no+"',gender='"+gender+"', age='"+age+"', department='"+department+"', username='"+username+"', password='"+password+"' "
					+"where emp_id='"+id+"'";
					
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
		return isSuccess;
	}
	
	public static List<Employee> getEmployeeDetails(String Id){
		
		int covertedID = Integer.parseInt(Id);
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		try {
			
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from employee_details where emp_id='"+covertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String phone = rs.getString(4);
				String gender = rs.getString(5);
				String age = rs.getString(6);
				String department = rs.getString(7);
				String userU = rs.getString(8);
				String passU = rs.getString(9);
				
				Employee e = new Employee(id, name, address, phone, gender, age, department, userU,passU);
				emp.add(e);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return emp;
	}
	
	public static boolean deleteemployee(String id) {
		
		int covertedID = Integer.parseInt(id);
		
		try {
			
			con = DBConnection.getConnection();
			stmt = con.createStatement();
			
			String sql = "delete from employee_details where emp_id='"+covertedID+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
}
