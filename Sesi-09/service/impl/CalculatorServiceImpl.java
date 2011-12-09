package service.impl;

import service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
	public Integer tambah(int bil1, int bil2) {
		return bil1 + bil2;
	}

	public Integer kurang(int bil1, int bil2) {
		return bil1 - bil2;
	}

	public Integer kali(int bil1, int bil2) {
		return bil1 * bil2;
	}

	public Integer bagi(int bil1, int bil2) {
		return bil1 / bil2;
	}

}