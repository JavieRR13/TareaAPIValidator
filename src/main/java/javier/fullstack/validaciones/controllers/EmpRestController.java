package javier.fullstack.validaciones.controllers;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javier.fullstack.validaciones.model.Employee;
import javier.fullstack.validaciones.service.EmpService;

@RestController
@RequestMapping("/Employee")
public class EmpRestController {

	EmpService empService;
	
	public EmpRestController(EmpService empService) {
		this.empService = empService;
		
	}
	
	@PostMapping
	public ResponseEntity<Employee> createEmp(@RequestBody @Validated Employee e){
		empService.createEmp(e);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id").buildAndExpand(e.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping
	public ResponseEntity<ArrayList<?>> empList(){
		ArrayList<Employee> empList = empService.readEmp();
		return ResponseEntity.ok(empList);
	}
	
	@PutMapping
	public ResponseEntity <Employee> updateEmp(@RequestBody @Validated Employee e){
		empService.updateEmp(e);
		return ResponseEntity.ok(e);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmp(@PathVariable @Validated int id){
		empService.deleteEmp(id);
		return ResponseEntity.noContent().build();
	}
	
}
