public class Manager extends Employee {
	private String department;

	public Manager(String nama, double salary, String dep) {
		super(nama, salary);
		department = dep;
	}

	public String getDepartment() {
		return department;
	}

	public String getDetails() {
		return super.getDetails()+"\nDepartment : "+getDepartment();
	}

	public void cetak() {
		System.out.println("Coba di Manager");
	}
}