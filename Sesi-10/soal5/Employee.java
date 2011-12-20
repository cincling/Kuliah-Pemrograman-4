public class Employee {
	private String name;
	private double salary;
	
	protected Employee(String n, double s) {
		name = n;
		salary = s;
	}

	protected String getDetails() {
		return "Name : "+name+ "\nSalary : "+salary;
	}

	public void cetak() {
		System.out.println("Coba di Employee");
	}
}