package fr.designpattern.example.model;

import java.time.LocalDateTime;

public class Employee {
	private String firstname;
	private String lastname;
	private LocalDateTime contractIssueDate;

	public Employee() {
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(final String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(final String lastname) {
		this.lastname = lastname;
	}

	public LocalDateTime getContractIssueDate() {
		return contractIssueDate;
	}

	public void setContractIssueDate(final LocalDateTime contractIssueDate) {
		this.contractIssueDate = contractIssueDate;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"firstname='" + firstname + '\'' +
				", lastname='" + lastname + '\'' +
				", contractIssueDate=" + contractIssueDate +
				'}';
	}
}