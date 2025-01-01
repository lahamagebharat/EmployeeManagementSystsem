package EmployeemanagementJPWwithoutspringboot.service;

import EmployeemanagementJPAwithoutspringboot.Dao.EmployeeDao;
import EmployeemanagementJPAwithoutspringboot.Entity.Employee;

public class EmployeeService {
	
	EmployeeDao obj=new EmployeeDao();
	
	public String saveEmployee(Employee emp) {
		String msg=obj.saveEmployee(emp);
		return msg;
	
	}
	
	public String updateData(int id) {
		String msg=obj.updateData(id);
		return msg;
		
	}
	
	public Employee getData(int id)
	{
		Employee emp=obj.getData(id);
		return emp;
	}
	public String deleteData(int id) {
		String msg=obj.deleteData(id);
		return msg;
		
	}
	
	
}
