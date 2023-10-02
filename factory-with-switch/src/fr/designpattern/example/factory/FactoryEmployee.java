package fr.designpattern.example.factory;

import fr.designpattern.example.model.Employee;

public interface FactoryEmployee {
	Employee create(String label);
}
