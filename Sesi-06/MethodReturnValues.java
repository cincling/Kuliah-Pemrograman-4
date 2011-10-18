public class MethodReturnValues {
	public static void main(String[] args) {
		myMethod();
		int myInt = 0;
		System.out.println(myInt);
		myInt = myMethod();
		System.out.println(myInt);
	}

	static int myMethod() {
		System.out.println("This computer is lagging!");
		return 4;
	}
}