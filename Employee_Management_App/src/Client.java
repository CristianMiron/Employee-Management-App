
class Client {

	public static void main(String[] args) {

		Employee e1 = new EmployeeWithFixedSalary("Mark", 2200);

		EmployeePayPerHour e2 = new EmployeePayPerHour("John", 10);
		System.out.println(e2.addWorkedHours(8));
		System.out.println(e2.addWorkedHours(8));
		System.out.println(e2.addWorkedHours(8));
		System.out.println(e2.addWorkedHours(8));
		System.out.println(e2.addWorkedHours(8.5));
		System.out.println(e2.totalHoursWorked());

		EmployeePayPerHour e3 = new EmployeePayPerHour("Liana", 20);
		System.out.println(e3.addWorkedHours(10));
		System.out.println(e3.addWorkedHours(10));
		System.out.println(e3.addWorkedHours(10));
		System.out.println(e3.addWorkedHours(10));
		System.out.println(e3.addWorkedHours(10));
		System.out.println(e3.totalHoursWorked());

		Company myCompany = new Company();

		System.out.println(myCompany.addEmployee(e1));
		System.out.println(myCompany.addEmployee(e2));
		System.out.println(myCompany.addEmployee(e3));

		System.out.println(myCompany.avarageSalary());

	}
}
