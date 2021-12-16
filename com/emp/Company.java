package com.emp;

public class Company {

	static final int IS_PRESENT = 1;
	static final int IS_PART_TIME = 2;

	String companyName;
	int workingHour;
	int wagePerHour;
	int maxWorkingDay;
	int maxWorkingHour;

	int totalEmpWage;

	public Company(String companyName, int workingHour, int wagePerHour, int maxWorkingDay, int maxWorkingHour) {
		this.companyName = companyName;
		this.workingHour = workingHour;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDay = maxWorkingDay;
		this.maxWorkingHour = maxWorkingHour;
	}

	private int isEmpPresent() {
		return (int) (Math.floor(Math.random() * 10) % 3);
	}

	private int getWorkignHour(int attendanceCheck) {
		int empHr;
		switch (attendanceCheck) {
		case IS_PRESENT:
			empHr = workingHour;
			break;

		case IS_PART_TIME:
			empHr = (workingHour / 2);
			break;

		default:
			empHr = 0;
			break;
		}
		
		return empHr;
	}

	public void calculateEmpWage() {
		int day = 0;
		int totalWorkingHour = 0;
		while (day < maxWorkingDay && (totalWorkingHour + workingHour) <= maxWorkingHour) {
			day++;
			int workingHour = getWorkignHour(isEmpPresent());
			totalWorkingHour += workingHour;
		}
		totalEmpWage = totalWorkingHour * wagePerHour; //
	}
	

	@Override
	public String toString() {
		calculateEmpWage();
		return "Company name : " + companyName + "\nEmployee Wages : " + totalEmpWage;
	}

}
