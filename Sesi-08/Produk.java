import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class Produk {
	private String kode;
	private String nama;
	private BigDecimal harga;
	private List<PenjualanDetail> daftarPenjualanDetail = new ArrayList<PenjualanDetail>();
	
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

	public BigDecimal getHarga() {
		return harga;
	}

	public void setHarga(BigDecimal harga) {
		this.harga = harga;
	}
	
	public Integer hitungJumlahTerjual() {
		Integer hasil = 0;
		
        for(PenjualanDetail d : daftarPenjualanDetail){
            hasil += d.getQuantity();
        }
        return hasil;    
	}

    public List<PenjualanDetail> getDaftarPenjualanDetail(){
        return this.daftarPenjualanDetail;
    }
}