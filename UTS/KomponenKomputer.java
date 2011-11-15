import java.util.*;

public class KomponenKomputer {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);

			System.out.println("Komponen komputer yang tersedia (1-3)");
			System.out.println("     1) Harddisk");
			System.out.println("     2) RAM");
			System.out.println("     3) Motherboard");
			System.out.print("Masukan Pilihan Anda : ");
		
			int x = input.nextInt();
			switch(x) {
				case 1:
					System.out.println("Anda memilih Harddisk");
					break;
				case 2:
					System.out.println("Anda memilih RAM");
					break;
				case 3:
					System.out.println("Anda memilih Motherboard");
					break;
				default:
					System.out.println("Pilihan anda tidak ada !");
			}
		} catch (InputMismatchException ex) {
			System.out.println("Silahkan masukkan angka 1 sampai 3");
		}
	}
}