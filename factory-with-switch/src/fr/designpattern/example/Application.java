package fr.designpattern.example;

import java.time.LocalDateTime;

import fr.designpattern.example.factory.FactoryEmployee;
import fr.designpattern.example.factory.FactoryEmployeeImpl;
import fr.designpattern.example.model.Employee;

public class Application {
	public static void main(String[] args) {

		FactoryEmployee factoryEmployee = new FactoryEmployeeImpl();
		Employee employee = factoryEmployee.create("FDC");
		employee.setFirstname("Gilbert");
		employee.setLastname("Fenault");
		employee.setContractIssueDate(LocalDateTime.of(2022,12,29,00,00));
		System.out.println(employee);
		//((FixedDurationContract)employee).setContractEndingDate(LocalDateTime.of(2023,12,29,00,00));
	}
}