class Main {
	public static void main(String[] args) {
		Hewan hewan1 = new Kucing();
		Hewan hewan2 = new Anjing();
		Hewan hewan3 = new Hewan("burung");
		
		hewan1.suara();
		hewan2.suara();
		hewan3.suara();

	}
}