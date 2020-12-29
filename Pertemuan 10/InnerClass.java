class InnerClass {
	public static void main(String[] args) {
		Outer outerClass = new Outer();
		outerClass.sum();

		Outer.Inner innerClass = new Outer.Inner();

		System.out.println("Hasil kurang : " + (outerClass.x - innerClass.y));
	}
}

bit.ly/pbo-b

token : STTC



/*
	MINGGU 1 (11 - 14 Des)
	1. Deskripsi Produk
	2. List Fitur & System Requirement
	3. Buat Diagram Proses
	4. Prototype Produk
	
	MINGGU 2 (15 - 21 Des)
	5. Class Diagram
	6. Coding BackEnd (Tanpa GUI)
	
	MINGGU 3 (22 - 27 Des)
	7. Implementasi dengn GUI
	8. Testing
	
*/