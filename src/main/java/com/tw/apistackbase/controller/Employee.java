  
package com.tw.apistackbase.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *  
 */
@RestController
@RequestMapping("/employees")
public class  Employee {
	List<EmployeeInformation> employees = new ArrayList<EmployeeInformation>();

    @GetMapping(path = "/")
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeInformation> getEmployees() {
//    	employees.add(new EmployeeInformation("NO01","zhangsan","man",20));
//    	employees.add(new EmployeeInformation("NO02","lisi","man",25));
        return  employees ;
    }
    @PostMapping(path = "/insert")
    @ResponseStatus(HttpStatus.CREATED)
    public List<EmployeeInformation> postEmployees(@RequestBody EmployeeInformation employee) {
    	employees.add(employee);
    	return employees;
    }
    @RequestMapping(path = "/{id}")
//    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<EmployeeInformation> getEmployee (@PathVariable String id){
    	for(EmployeeInformation employee  : employees) {
    		if(employee.getId().equals(id))
    			return ResponseEntity.ok(employee);
    	}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
    
    @PutMapping(path = "/{id}")
    public ResponseEntity<EmployeeInformation> updateEmployee (@PathVariable String id,EmployeeInformation employee){
    	for(EmployeeInformation employee  : employees) {
    		for(int i=0;i<employees.size(),i++) {
    			if(employee.getId().equals(id))
        			return  employees = employee;
    		}
    	
    	}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping(path = "/{id}")
//  @ResponseStatus(HttpStatus.CREATED)
  public void deleteEmployee (@PathVariable String id){
  	for(EmployeeInformation employee  : employees) {
  		if(employee.getId().equals(id))
  			employees.remove(employee);
  	}
   }
}
