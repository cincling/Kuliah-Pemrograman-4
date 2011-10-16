public class Mahasiswa {
	private String npm;
	private String nama;
	private String alamat;
	private static int jumlahMahasiswa;
	
	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNpm() {
		return npm;
	}

	public void setNpm(String npm) {
		this.npm = npm;
	}
	public int getJumlahMahasiswa() {
		return jumlahMahasiswa;
	}

	public void setJumlahMahasiswa(int jumlahMahasiswa) {
		this.jumlahMahasiswa = jumlahMahasiswa;
	}
}