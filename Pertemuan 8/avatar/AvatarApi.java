public class AvatarApi extends Avatar implements Api{
	
	public AvatarApi(String nama) {
		super(nama);
	}

	@Override
	public void serangApi() {
		System.out.println("Serangan Api !!");
	}

	@Override
	public void tembakBolaApi() {
		System.out.println("Menembakkan Bola Api !!");
	}
}