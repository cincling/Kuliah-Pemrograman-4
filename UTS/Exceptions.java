import java.util.*;

public class Exceptions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 1;
		
		do {
			try {
				System.out.println("Input nomor pertama : ");
				int n1 = input.nextInt();
				System.out.println("Input nomor kedua : ");
				int n2 = input.nextInt();
				int sum = n1/n2;
				System.out.println(sum);
				x = 2;
			} catch (Exception e) {
				System.out.println("Anda tidak bisa melakukan itu!");
			}
		} while (x == 1);
	}
}