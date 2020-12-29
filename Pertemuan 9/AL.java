import java.util.ArrayList;

public class AL {
	public static void main(String[] args) {
		ArrayList<String> murid = new ArrayList<>();

		//  add() -> Menambah Elemen pada AL
		murid.add("Otong");
		murid.add("Ucup");
		murid.add("Memet");

		//  get() -> Mengambil Data pada Elemen
		System.out.println(murid.get(0));
		System.out.println(murid.get(1));
		System.out.println(murid.get(2));

		//  size() -> Mengambil panjang AL
		System.out.println("Panjang Array List : " + murid.size());

		// remove() -> Menghapus Elemen
		murid.remove(0);

		// set() -> Memodifikasi Elemen
		murid.set(1, "Budi");

		murid.forEach((m) -> System.out.println(m));

		for (String nama : murid) {
			System.out.println(nama);
		}

		for (int i = 0; i<murid.size(); i++) {
			System.out.println(murid.get(i));
		}

	}
}