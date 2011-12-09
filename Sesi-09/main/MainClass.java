package main;

import java.util.*;
import service.CalculatorService;
import service.impl.CalculatorServiceImpl;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CalculatorService service = new	CalculatorServiceImpl();

		System.out.print("Masukan Bilangan 1 : ");
		int bil1 = input.nextInt();
		System.out.print("Masukan Bilangan 2 : ");
		int bil2 = input.nextInt();
		System.out.print("Masukan Operator (+,-,*,/) : ");
		String oper = input.next();
		
		if (oper.equals("+")) {
			System.out.println("Hasil perhitungan dari " + bil1 + " " + oper + " " + bil2 + " = " + service.tambah(bil1, bil2));
		} else if (oper.equals("-")) {
			System.out.println("Hasil perhitungan dari " + bil1 + " " + oper + " " + bil2 + " = " + service.kurang(bil1, bil2));
		} else if (oper.equals("*")) {
			System.out.println("Hasil perhitungan dari " + bil1 + " " + oper + " " + bil2 + " = " + service.kali(bil1, bil2));
		} else if (oper.equals("/")) {
			System.out.println("Hasil perhitungan dari " + bil1 + " " + oper + " " + bil2 + " = " + service.bagi(bil1, bil2));
		} else {
			System.out.println("Operator yang berlaku hanya +,-,*,/ !");
		}
	}
}