public class Enum {
	public static void main(String[] args) {
		Day hari = Day.SENIN;
		Season musim = Season.FALL;

		switch(musim) {
			case WINTER:
				System.out.println("Sekarang Musim Winter");
			break;

			case SUMMER:
				System.out.println("Sekarang Musim SUMMER");
			break;

			case SPRING:
				System.out.println("Sekarang Musim SPRING");
			break;

			case FALL:
				System.out.println("Sekarang Musim FALL");
			break;
		}

		for (Season musims :  Season.values()) {
			System.out.println(musims);
		}

		if (musim == Season.FALL) {
			System.out.println("Iya Fall");
		}
		else {
			System.out.println("Bukan Fall");
		}

		System.out.println(hari);

		hari = Day.MINGGU;

		System.out.println(hari);

	}
}