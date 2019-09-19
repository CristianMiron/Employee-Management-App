import java.util.*;

class EmployeePayPerHour extends Employee {

	private double hourlySalary;
	private ArrayList<Double> hoursWorked = new ArrayList(31);

	public EmployeePayPerHour(String name, double hourlySalary) {
		super(name);
		this.hourlySalary = hourlySalary;
	}

	public boolean addWorkedHours(double h) {
		if (hoursWorked.size() <= 31) {
			return hoursWorked.add(h);
		}
		return false;
	}

	public double totalHoursWorked() {
		double sum = 0;
		for (Double x : hoursWorked) {
			sum += x;
		}
		return sum;
	}

	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public double salary() {
		return hourlySalary * totalHoursWorked();
	}

}
