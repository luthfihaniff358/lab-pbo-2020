public class Hewan {
	static String jenis = "Hewan";
	private String makanan;

	public Hewan (String makanan) {
		this.makanan = makanan;
	}

	public static void setJenis(String jenis) {
		Hewan.jenis = jenis;
	}

	public static String ordo() {
		return "Animalia";
	}

	public static void lari() {
		System.out.println("Saya hewan berlari");
	}

	public String toString() {
		return this.jenis + ", makan : " + makanan;
	}
}