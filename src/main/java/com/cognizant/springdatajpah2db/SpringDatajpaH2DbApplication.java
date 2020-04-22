package com.cognizant.springdatajpah2db;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDatajpaH2DbApplication implements CommandLineRunner {
	
	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaH2DbApplication.class, args);
		
	}
	
	public void addEmployee(){
		Employee employee1=new Employee("Akash", "Barma", "abc@gmail.com", new Date());
		Employee employee2=new Employee("Aman", "Barma", "Kbc@gmail.com", new Date());
		System.out.println(employeeService);
		employeeService.save(employee1);
		employeeService.save(employee2);
	}
	
	public void displayAll(){
		employeeService.findAll().forEach(System.out::println);
	}

	@Override
	public void run(String... args) throws Exception {
		addEmployee();
		displayAll();
	}

}
