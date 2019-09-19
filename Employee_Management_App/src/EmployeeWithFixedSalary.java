
class EmployeeWithFixedSalary extends Employee {

	private double fixSalary;

	public EmployeeWithFixedSalary(String name, double fixSalary) {
		super(name);
		this.fixSalary = fixSalary;
	}

	public double salary() {
		return fixSalary;
	}

	public void setSalary(double fixSalary) {
		this.fixSalary = fixSalary;
	}

}
