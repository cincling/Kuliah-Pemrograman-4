package main;

import service.CalculatorService;
import service.impl.CalculatorServiceImpl;

public class MainClass {
	public static void main(String[] args) {
		CalculatorService service = new
		CalculatorServiceImpl();
		Integer a = service.tambah(200, 4);
		Integer b = service.kurang(200, 4);
		Integer c = service.kali(200, 4);
		Integer d = service.bagi(200, 4);
		System.out.println("Output");
		System.out.println("Nilai a : " + a);
		System.out.println("Nilai b : " + b);
		System.out.println("Nilai c : " + c);
		System.out.println("Nilai d : " + d);
	}
}