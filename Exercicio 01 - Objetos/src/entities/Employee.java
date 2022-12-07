package entities;

public class Employee {
	
	public String name;
	public double glossSalary;
	public double tax;
	public double salary;
	
	public double netSalary() {
		salary = glossSalary - tax;
		return salary;
	}
	
	public double increaseSalary(double percentage) {
		salary = salary + (glossSalary * (percentage / 100));
		return salary;
	}

	@Override
	public String toString() {
		return name + ", $" + String.format("%.2f", salary);
	}
	
}
