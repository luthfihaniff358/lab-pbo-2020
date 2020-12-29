public class Outer {
	int x = 5;
	Inner myInnerClass = new Inner();

	public void sum() {
		System.out.println("hasil tambah : "+ (this.x + myInnerClass.y));
	} 

	static class Inner {
		int y = 3;
	}

}