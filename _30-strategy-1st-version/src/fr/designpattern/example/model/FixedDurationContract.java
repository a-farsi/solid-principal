package fr.designpattern.example.model;

import java.time.LocalDateTime;

public class FixedDurationContract extends Employee{
	private LocalDateTime contractEndingDate;

	public LocalDateTime getContractEndingDate() {
		return contractEndingDate;
	}

	public void setContractEndingDate(final LocalDateTime contractEndingDate) {
		this.contractEndingDate = contractEndingDate;
	}

	@Override
	public String toString() {
		super.toString();
		return "FixedDurationContract{" + "\n" +
				"firstname='" + getFirstname() + ",\n" +
				" lastname='" + getLastname() + ",\n" +
				" contractIssueDate=" + getContractIssueDate() + "\n" +
				"contractEndingDate=" + contractEndingDate +
				'}';
	}
}
