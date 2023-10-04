package fr.designpattern.example.app;

import fr.designpattern.example.model.Employee;
import fr.designpattern.example.strategy.AbstractEmployeeType;

public class Application {
	public static void main(String[] args) {
		String type = "FDC";
		// 2 lines ==> CLIENT CODE to avoid the switch
		// The CLIENT CODE is Closed to Modification,
		AbstractEmployeeType employeeType = AbstractEmployeeType.of(type);
		Employee employee = employeeType.create(type);

		System.out.println("Hello world!");
	}
}