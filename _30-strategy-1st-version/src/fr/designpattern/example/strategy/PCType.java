package fr.designpattern.example.strategy;

import fr.designpattern.example.model.Employee;
import fr.designpattern.example.model.PermanentContract;

public class PCType extends AbstractEmployeeType{
	@Override
	public Employee create(final String type) {
		Employee permanentContract = new PermanentContract();
		return permanentContract;
	}
}