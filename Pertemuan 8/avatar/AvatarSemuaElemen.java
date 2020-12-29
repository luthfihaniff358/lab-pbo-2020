public class AvatarSemuaElemen extends Avatar implements Api, Air, Angin, Tanah {

	public AvatarSemuaElemen(String nama) {
		super(nama);
	}

	@Override
	public void serangAngin() {
		System.out.println("Serangan Angin ");
	}

	@Override
	public void serangApi() {
		System.out.println("Serangan Api !!");
	}

	@Override
	public void serangAir() {
		System.out.println("Serangan Airi !! Bloop Bloop");
	}

	@Override
	public void serangTanah() {
		System.out.println("Serangan Tanah !! Grrrrr!");
	}

	@Override
	public void tembakBolaApi() {
		System.out.println("Menembakkan Bola Api !!");
	}
}