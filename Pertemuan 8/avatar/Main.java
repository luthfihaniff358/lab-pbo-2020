class Main {
	public static void main(String[] args) {
		AvatarAngin ang = new AvatarAngin("Ang");
		AvatarAir katara = new AvatarAir("Katara");
		AvatarApi zuko = new AvatarApi("Zuko");
		AvatarTanah tak = new AvatarTanah("Tak");
		AvatarSemuaElemen roku = new AvatarSemuaElemen("Roku");

		ang.serangAngin();
		katara.serangAir();
		zuko.serangApi();
		tak.serangTanah();

		System.out.println("======= Serangan Avatar Semua Elemen");
		roku.serangAngin();
		roku.serangAir();
		roku.serangApi();
		roku.serangTanah();
	}
}