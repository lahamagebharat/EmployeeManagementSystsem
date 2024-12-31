package EmployeemanagementJPAwithoutspringboot.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import EmployeemanagementJPAwithoutspringboot.Entity.Employee;

public class EmployeeDao {
	
	public static EntityManagerFactory getFactory()
	{
		EntityManagerFactory enititymanagerfactory=Persistence.createEntityManagerFactory("employeePU");
		return enititymanagerfactory;
	}
	public String saveEmployee(Employee emp)
	{
		EntityManagerFactory factory=EmployeeDao.getFactory();
		EntityManager entitymanager=factory.createEntityManager();
		
		entitymanager.getTransaction().begin();
		entitymanager.persist(emp);
		entitymanager.getTransaction().commit();
		
		return "Employee Saved Successfully";
	}

	

}
