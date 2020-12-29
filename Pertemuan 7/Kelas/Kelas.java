public class Kelas {
	private int grade;
	private Siswa siswa[];
	private int index = 0;

	public Kelas (int grade, int jumlahSiswa) {
		this.grade = grade;
		this.siswa = new Siswa[jumlahSiswa];
	}

	public void addSiswa(String nama, String nis) {
		siswa[index++] = new Siswa(nama, nis);
	}

	public Siswa  getSiswa(int index) {
		return siswa[index];
	}
}