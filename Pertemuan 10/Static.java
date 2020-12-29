public class Static {
	public static void main(String[] args) {
		Hewan ikan = new Hewan("Pelete");
		Hewan kambing = new Hewan("Rumput");
		Hewan sapi = new Hewan("Rumput");

		System.out.println(ikan);
		Hewan.setJenis("tumbuhan");
		System.out.println(ikan);

		System.out.println(kambing);
		System.out.println(sapi);

		System.out.println(Hewan.jenis);
		Hewan.lari();
		System.out.println(Hewan.ordo());
	}
}