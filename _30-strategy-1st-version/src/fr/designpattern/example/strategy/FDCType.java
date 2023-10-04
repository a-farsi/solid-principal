package fr.designpattern.example.strategy;

import fr.designpattern.example.model.Employee;
import fr.designpattern.example.model.FixedDurationContract;

public class FDCType extends AbstractEmployeeType{
	@Override
	public Employee create(final String type) {
		Employee fixedDurationContract = new FixedDurationContract();
		return fixedDurationContract;
	}
}