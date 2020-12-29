public class AvatarAir extends Avatar implements Air{
	
	public AvatarAir(String nama) {
		super(nama);
	}

	@Override
	public void serangAir() {
		System.out.println("Serangan Air !! Bloop Bloop");
	}
}