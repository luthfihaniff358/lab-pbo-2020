public class AkunBank {
	// Attribute
	private int saldo;

	// Method
	// Constructor
	public AkunBank(int saldo) {
		this.saldo = saldo;
	}

	// Accessor
	public int getSaldo(){
		return this.saldo;
	}

	// Muttator
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void setor(int jumlahSetoran) {
		setSaldo(getSaldo() + jumlahSetoran);
		System.out.println("Berhasil Melakukan Setoran Sebanyak : "+jumlahSetoran);
	}

	public void tarik(int jumlahPenarikan) {
		if(getSaldo() < jumlahPenarikan) {
			System.out.println("Gagal melakuakn penarikan! Sisa saldo : "+getSaldo());
		}else{
			setSaldo(getSaldo() - jumlahPenarikan);
			System.out.println("Berhasl melakukan penarikan Sebanyak : "+jumlahPenarikan);
		}
	}

	public String toString() {
		return "Jumlah Saldo : "+getSaldo();
	}
}