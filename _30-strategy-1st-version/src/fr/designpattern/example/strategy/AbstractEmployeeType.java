package fr.designpattern.example.strategy;

import fr.designpattern.example.model.Employee;

public abstract class AbstractEmployeeType {

	//The APPLICATION CODE is Open to extension
	public static AbstractEmployeeType of(final String type) {
		// The switch select the strategy to be applied
		switch (type) {
			case "CTR":
				return new ContractorType();
			case "FDC":
				return new FDCType();
			case "PC":
				return new PCType();
			default:
				return null;
		}
	}

	abstract public Employee create(String type);
}
