public class Siswa
{
 private int nrp;
 private String nama;

 public Siswa()
 {
 this.nrp = 12345;
 this.nama = "nama default";
 }

 public Siswa(int nrp, String nama)
 {
 this.nrp = nrp;
 this.nama = nama;
 }

 public void setNrp(int nrp)
 {
 this.nrp = nrp;
 }

 public int getNrp()
 {
 return this.nrp;
 }

 public void setNama(String nama)
 {
 this.nama = nama;
 }

 public String getNama()
 {
 return this.nama;
 }
}