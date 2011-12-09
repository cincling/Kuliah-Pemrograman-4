import java.util.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class TransaksiKasir {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);

			System.out.println("Pilih menu yang tersedia (1-3)");
			System.out.println("     1) Transaksi");
			System.out.println("     2) Rekap Penjualan Harian");
			System.out.println("     3) Keluar");
			System.out.print("Masukan Pilihan Anda : ");
		
			int x = input.nextInt();
			switch(x) {
				case 1:
					skenarioTransaksi();
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
	
	public static void skenarioTransaksi() {
		//Produk initialization
		Produk prod1 = new Produk();
		Produk prod2 = new Produk();
		Produk prod3 = new Produk();
		Produk prod4 = new Produk();
		Produk prod5 = new Produk();
		//Produk A
		prod1.setKode("P-001");
		prod1.setNama("Antangin Sachet");
		prod1.setHarga(new BigDecimal(1500.00));
		//Produk B
		prod2.setKode("P-002");
		prod2.setNama("Bayclin Pemutih Botol 250ml");
		prod2.setHarga(new BigDecimal(2000.00));
		//Produk C
		prod3.setKode("P-003");
		prod3.setNama("Clear Shampoo Botol 250ml");
		prod3.setHarga(new BigDecimal(3500.00));
		//Produk D
		prod4.setKode("P-004");
		prod4.setNama("Dancow Susu Sachet 100mg");
		prod4.setHarga(new BigDecimal(4000.00));
		//Produk E
		prod5.setKode("P-005");
		prod5.setNama("Energizer Battery 2pcs");
		prod5.setHarga(new BigDecimal(5000.00));
		//Tambah semua produk ke list
        List<Produk> daftarProduk = new ArrayList<Produk>();
        daftarProduk.add(prod1);
        daftarProduk.add(prod2);
        daftarProduk.add(prod3);
        daftarProduk.add(prod4);
        daftarProduk.add(prod5);

		//Kasir initialization
		Kasir kasir1 = new Kasir();
		Kasir kasir2 = new Kasir();
		//Kasir 1
		kasir1.setKode("K-001");
		kasir1.setNama("Rani");
		kasir1.setSaldoAwal(new BigDecimal(0.00));
		//Kasir 2
		kasir2.setKode("K-001");
		kasir2.setNama("Indah");
		kasir2.setSaldoAwal(new BigDecimal(0.00));

		//Penjualan kasir 1 initialization
		Penjualan k1p1 = new Penjualan();
        PenjualanDetail k1p1d1 = new PenjualanDetail();
        PenjualanDetail k1p1d2 = new PenjualanDetail();
		k1p1.setKodeTransaksi("TRX001");
		k1p1d1.setProduk(prod1);
		k1p1d1.setQuantity(1);
        prod1.getDaftarPenjualanDetail().add(k1p1d1);
        k1p1.getDaftarPenjualanDetail().add(k1p1d1);
		k1p1d2.setProduk(prod2);
		k1p1d2.setQuantity(5);
        prod2.getDaftarPenjualanDetail().add(k1p1d2);
        k1p1.getDaftarPenjualanDetail().add(k1p1d2);

		Penjualan k1p2 = new Penjualan();
        PenjualanDetail k1p2d1 = new PenjualanDetail();
        PenjualanDetail k1p2d2 = new PenjualanDetail();
		k1p2.setKodeTransaksi("TRX002");
		k1p2d1.setProduk(prod2);
		k1p2d1.setQuantity(2);
        prod2.getDaftarPenjualanDetail().add(k1p2d1);
        k1p2.getDaftarPenjualanDetail().add(k1p2d1);
		k1p2d2.setProduk(prod5);
		k1p2d2.setQuantity(3);
        prod5.getDaftarPenjualanDetail().add(k1p2d2);
        k1p2.getDaftarPenjualanDetail().add(k1p2d2);

		//Penjualan kasir 2 initialization
		Penjualan k2p1 = new Penjualan();
        PenjualanDetail k2p1d1 = new PenjualanDetail();
        PenjualanDetail k2p1d2 = new PenjualanDetail();
		k2p1.setKodeTransaksi("TRX003");
		k2p1d1.setProduk(prod4);
		k2p1d1.setQuantity(10);
        prod4.getDaftarPenjualanDetail().add(k2p1d1);
        k2p1.getDaftarPenjualanDetail().add(k2p1d1);
		k2p1d2.setProduk(prod5);
		k2p1d2.setQuantity(2);
        prod5.getDaftarPenjualanDetail().add(k2p1d2);
        k1p1.getDaftarPenjualanDetail().add(k2p1d2);

		Penjualan k2p2 = new Penjualan();
        PenjualanDetail k2p2d1 = new PenjualanDetail();
        PenjualanDetail k2p2d2 = new PenjualanDetail();
		k2p2.setKodeTransaksi("TRX004");
		k2p2d1.setProduk(prod1);
		k2p2d1.setQuantity(3);
        prod1.getDaftarPenjualanDetail().add(k2p2d1);
        k2p2.getDaftarPenjualanDetail().add(k2p2d1);
		k2p2d2.setProduk(prod5);
		k2p2d2.setQuantity(1);
        prod5.getDaftarPenjualanDetail().add(k2p2d2);
        k2p2.getDaftarPenjualanDetail().add(k2p2d2);

		Penjualan k2p3 = new Penjualan();
        PenjualanDetail k2p3d1 = new PenjualanDetail();
		k2p3.setKodeTransaksi("TRX005");
		k2p3d1.setProduk(prod2);
		k2p3d1.setQuantity(2);
        prod2.getDaftarPenjualanDetail().add(k2p3d1);
        k2p3.getDaftarPenjualanDetail().add(k2p3d1);

        for(Produk x : daftarProduk){
            System.out.print("Produk "+x.getKode());
            System.out.println(", penjualan : " + x.hitungJumlahTerjual());
        }
	}
}