package javier.fullstack.validaciones.service;

import java.util.ArrayList;

import javier.fullstack.validaciones.model.Employee;

public interface EmpService {

	public Employee createEmp(Employee e);
	public ArrayList<Employee>readEmp();
	public Employee updateEmp(Employee e);
	public void deleteEmp(int id);
	
}
