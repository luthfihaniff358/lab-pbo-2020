public class AvatarAngin extends Avatar implements Angin{
	
	public AvatarAngin(String nama) {
		super(nama);
	}

	@Override
	public void serangAngin() {
		System.out.println("Serangan Angin ");
	}
}