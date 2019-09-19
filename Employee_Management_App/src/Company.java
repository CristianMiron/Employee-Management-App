import java.util.*;

class Company {

	private List<Employee> employeeList = new ArrayList<Employee>(1024);

	public boolean addEmployee(Employee e) {
		if (employeeList.size() > 1024) {
			return false;
		}
		for (Employee x : employeeList) {
			if (x.getName().equals(e.getName())) {
				return false;
			}
		}
		return employeeList.add(e);
	}

	public double avarageSalary() {
		double sum = 0;
		for (Employee e : employeeList) {
			sum += e.salary();
		}
		return sum / employeeList.size();
	}

}