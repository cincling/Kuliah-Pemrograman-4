import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class Kasir {
	private String kode;
	private String nama;
	private BigDecimal saldoAwal;
	private List<Penjualan> daftarPenjualan = new ArrayList<Penjualan>();
	
	public BigDecimal HitungSetoran() {
		return null;
	}
	
	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public BigDecimal getSaldoAwal() {
		return saldoAwal;
	}

	public void setSaldoAwal(BigDecimal saldoAwal) {
		this.saldoAwal = saldoAwal;
	}
}