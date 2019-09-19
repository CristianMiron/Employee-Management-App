
abstract class Employee {

	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public abstract double salary();

	public boolean equals(Object o) {
		if (o instanceof Employee) {
			return (((Employee) o).name.equals(name));

		}
		return false;
	}

	public String getName() {
		return name;
	}

}
