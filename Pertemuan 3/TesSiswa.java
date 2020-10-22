public class TesSiswa
{
 public static void main(String[] ar)
 {
 Siswa s = new Siswa(12345);

 System.out.println(s.getNrp());

 s.setNrp(8030001);
 System.out.println(s.getNrp());
 }
}
/*
Jika kita ingin menggunakan class Siswa di dalam class X dan class X tersebutlah yang akan dijalankan.
Maka class X tersebut perlu memiliki method main. diatas contoh aplikasi yang menciptakan dan
menggunakan objek dari class Siswa.
*/
