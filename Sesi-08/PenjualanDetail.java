import java.math.BigDecimal;

public class PenjualanDetail {
	private Integer quantity;
	private Produk produk;
	private Penjualan penjualan;
	
	public BigDecimal HitungSubTotal() {
		return null;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setProduk(Produk produk) {
		this.produk = produk;
	}
}