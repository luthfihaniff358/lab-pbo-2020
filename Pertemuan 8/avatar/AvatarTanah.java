public class AvatarTanah extends Avatar implements Tanah{
	
	public AvatarTanah(String nama) {
		super(nama);
	}

	@Override
	public void serangTanah() {
		System.out.println("Serangan Tanah !! Grrrrr!");
	}
}