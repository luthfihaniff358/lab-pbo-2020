import java.util.HashMap;

public class HM {
	public static void main(String[] args) {
		HashMap<String, String[]> ibukota = new HashMap<>();

		Integer num = new Integer(10);
		int num2 = 20;

		// put() -> Menambahkan daaa ke HashMap
		
		String[] temp = new String[3];
		temp[0] = "Indonesia";
		temp[1] = "256 Juta";
		temp[2] = "Republik";

 		ibukota.put("Indonesia", temp);

 		temp = new String[3];
		temp[0] = "Inggris";
		temp[1] = "55 Juta";
		temp[2] = "Monarki";

 		ibukota.put("Inggris", temp);

		System.out.println("Size Awal : " + ibukota.size());



		// // get() -> Mengambil data berdasarkan Key
		// System.out.println(ibukota.get("Inggris"));
		// System.out.println(ibukota.get("Indonesia"));

		// // remove() -> Menghapus Data berdasarkan Key
		// ibukota.remove("Inggris");

		// System.out.println("Size Akhir : " + ibukota.size());

		for (String[] namaIbukota : ibukota.values()) {
			System.out.println("Nama ibukota :  " + namaIbukota[0]);
			System.out.println("Jumlah Penduduk:  " + namaIbukota[1]);
			System.out.println("Pemerintahan:  " + namaIbukota[2]);
		}

		for (String namaNegara : ibukota.keySet()) {
			System.out.println(namaNegara);
		}
	}
}