class Main {
	public static void main(String[] args) {
		Kelas kelas = new Kelas(1, 10);

		kelas.addSiswa("Ridha", "123");
		kelas.addSiswa("Otong", "321");

		System.out.println(kelas.getSiswa(0));
		System.out.println(kelas.getSiswa(1));
	}
}