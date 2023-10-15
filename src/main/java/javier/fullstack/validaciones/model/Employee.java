package javier.fullstack.validaciones.model;

import jakarta.annotation.Nonnull;
import javier.fullstack.validaciones.validator.*;

/*
import lombok.AllArgsConstructor;
import lombok.*;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
No funciona Lombok
*/

public class Employee {

	@PositiveNum
	int id;
	
	@Nonnull
	String name;
	
	@EmailCode
	String email;
	
	@EmployeeCode
	String code_emp;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String email, String code_emp) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.code_emp = code_emp;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCode_emp() {
		return code_emp;
	}
	public void setCode_emp(String code_emp) {
		this.code_emp = code_emp;
	}
	
}

