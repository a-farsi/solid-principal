package fr.designpattern.example.factory;

import fr.designpattern.example.factory.FactoryEmployee;
import fr.designpattern.example.model.Contractor;
import fr.designpattern.example.model.Employee;
import fr.designpattern.example.model.FixedDurationContract;
import fr.designpattern.example.model.PermanentContract;

public class FactoryEmployeeImpl implements FactoryEmployee {

	@Override
	public Employee create(String label) {
		switch (label) {
			case("FDC") :
				return new FixedDurationContract();
			case ("PC"):
				return new PermanentContract();
			case ("CTR"):
				return new Contractor();
		}
		return null;
	}
}
