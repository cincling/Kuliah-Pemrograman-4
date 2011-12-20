public class View {
	public static void main(String[] args) {
		Employee e = new Employee("Ali",1200000);
		Employee em = new Manager("Ali",1200000,"Informatika");
		System.out.println("Data employee :\n"+e.getDetails());
		System.out.println("Data manager :\n"+em.getDetails());
		em.cetak();
	}
}