import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;


public class Penjualan {
	private String kodeTransaksi;
	private Date waktuTransaksi;
	private BigDecimal jumlahPembayaran;
	private Kasir kasir;
	private List<PenjualanDetail> daftarPenjualanDetail = new ArrayList<PenjualanDetail>();
	
	public BigDecimal HitungTotal() {
		return null;
	}

	public BigDecimal HitungKembalian() {
		return null;
	}

	public String getKodeTransaksi() {
		return kodeTransaksi;
	}

	public void setKodeTransaksi(String kodeTransaksi) {
		this.kodeTransaksi = kodeTransaksi;
	}

	public Date getWaktuTransaksi() {
		return waktuTransaksi;
	}

	public void setWaktuTransaksi(Date waktuTransaksi) {
		this.waktuTransaksi = waktuTransaksi;
	}

	public BigDecimal getJumlahPembayaran() {
		return jumlahPembayaran;
	}

	public void setJumlahPembayaran(BigDecimal jumlahPembayaran) {
		this.jumlahPembayaran = jumlahPembayaran;
	}
	
	public List<PenjualanDetail> getDaftarPenjualanDetail() {
		return daftarPenjualanDetail;
	}

	public void setDaftarPenjualanDetail(List daftarPenjualanDetail) {
		this.daftarPenjualanDetail = daftarPenjualanDetail;
	}
	
}