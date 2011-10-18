import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Tuna tunaObject = new Tuna();
		System.out.println("Enter your name here : ");
		String name = input.nextLine();
		tunaObject.simpleMessage(name);
	}
}