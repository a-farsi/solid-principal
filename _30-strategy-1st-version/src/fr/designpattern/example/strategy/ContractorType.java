package fr.designpattern.example.strategy;

import fr.designpattern.example.model.Contractor;
import fr.designpattern.example.model.Employee;

public class ContractorType extends AbstractEmployeeType{
	@Override
	public Employee create(final String type) {
		Employee contractor = new Contractor();
		return contractor;
	}
}