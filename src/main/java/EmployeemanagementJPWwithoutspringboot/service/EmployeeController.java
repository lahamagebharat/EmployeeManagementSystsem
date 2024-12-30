package EmployeemanagementJPWwithoutspringboot.service;

import EmployeemanagementJPWwithoutspringboot.Dao.EmployeeDao;
import EmployeemanagementJPWwithoutspringboot.Entity.Employee;

public class EmployeeController {
	
	public static void main(String[] args) {
		//1.save
		EmployeeDao o=new EmployeeDao();
		Employee emp=new Employee("Bharat",50000);
		String msg=o.saveEmployee(emp);
		System.out.println(msg);
	}

}
