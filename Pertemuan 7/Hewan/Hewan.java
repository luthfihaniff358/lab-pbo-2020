public class Hewan {
	private String nama;

	public Hewan(String nama) {
		this.nama  = nama;
	}

	public String getNama() {
		return this.nama;
	}

	public void suara() {
		System.out.println("Suara Hewan default");
	}
}