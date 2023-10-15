package javier.fullstack.validaciones.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javier.fullstack.validaciones.model.Employee;


@Primary
@Service
public class EmpServiceImp implements EmpService{
	
	ArrayList<Employee> empList = new ArrayList<>(
			Arrays.asList(new Employee(1,"Jose","jose@gmail.com","EMP-CEO-1234"),
					new Employee(2,"Carlos","carlos@gmail.com","EMP-VNT-9876"),
					new Employee(3,"Juan","juan@gmail.com","EMP-MKT-5432")));
	

	@Override
	public Employee createEmp(Employee e) {
		empList.add(e);
		return e;
	}

	@Override
	public ArrayList<Employee> readEmp() {
		return empList;
	}

	@Override
	public Employee updateEmp(Employee e) {
		for(Employee i : empList) {
			if(i.getId() == e.getId()) {
				i.setName(e.getName());
				i.setEmail(e.getEmail());
				return e;
			}
		}
		return null;		
	}

	@Override
	public void deleteEmp(int id) {
		for(Employee i : empList) {
			if(i.getId() == id) {
				empList.remove(i);
			}
		}
	}
	
	
	
}
