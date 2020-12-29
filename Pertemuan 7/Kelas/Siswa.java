public class Siswa {
	private String nama;
	private String nis;

	public Siswa(String nama, String nis) {
		this.nama = nama;
		this.nis = nis;
	}

	public String getNama() {
		return this.nama;
	}

	public String getNis() {
		return this.nis;
	} 

	public String toString() {
		return "Nama : "+this.nama + " NIS : "+ this.nis;
	}
}