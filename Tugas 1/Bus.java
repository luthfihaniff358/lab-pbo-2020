/**
 * Nama : Luthfi Hanif
 * NIM  : 1908107010042
 */

import java.util.ArrayList;
import java.util.*;

public class Bus{
    ArrayList<Penumpang> penumpangBiasa;
    ArrayList<Penumpang> penumpangPrioritas;
    ArrayList<Penumpang> semuaPenumpang;    
    Scanner input = new Scanner(System.in);
   
    public Bus(){
       penumpangBiasa = new ArrayList<Penumpang>();
       penumpangPrioritas = new ArrayList<Penumpang>();
       semuaPenumpang = new ArrayList<Penumpang>();
    }
      
    public ArrayList<Penumpang> getPenumpangBiasa(){         
        for(Penumpang penumpang:penumpangBiasa){
            penumpang.getNama();
        }
        return penumpangBiasa;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas(){    
        for(Penumpang penumpang : penumpangPrioritas){
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }
    
    public int getJumlahPenumpangBiasa(){
        int jumlahB = penumpangBiasa.size();
        System.out.println("\ntotal penumpang di kursi biasa : " +jumlahB);
        return jumlahB;
    }
    
    public int getJumlahPenumpangPrioritas(){
        int jumlahP = penumpangPrioritas.size();
        System.out.println("total penumpang di kursi prioritas : " +jumlahP);
        return jumlahP;
    }
    
    public int getJumlahSemuaPenumpang(){
        int semua = penumpangBiasa.size() + penumpangPrioritas.size();
        System.out.println("total semua penumpang : "+semua);
        return semua;
    }

    public boolean naikPenumpang (Penumpang penumpang){
        int b=4, p=2;

        if((penumpangPrioritas.size() < p ) && ((penumpang.getUmur()<10) || (penumpang.getUmur() > 60) || (penumpang.getHamil()==true))){
            System.out.println("Penumpang prioritas sukses ditambahkan");
            return penumpangPrioritas.add(penumpang);
        }else if((penumpangBiasa.size() < b ) && ((penumpang.getUmur()<10) || (penumpang.getUmur() > 60) || (penumpang.getHamil()==true))){
            System.out.println("Penumpang prioritas sukses ditambahkan");
            return penumpangBiasa.add(penumpang);
        }
        else if(penumpangBiasa.size() < b ){
            System.out.println("Penumpang biasa sukses ditambahkan");
            return penumpangBiasa.add(penumpang); 
        } else{
            System.out.print("Penumpang gagal ditambahkan");
            System.out.println("Kursi tidak tersedia\n");
            return false;
        } 
    }
    
    public boolean turunkanPenumpang(String nama){
       
        for (int i = 0; i < penumpangBiasa.size(); i ++) {  
           if(nama.equals(penumpangBiasa.get(i).getNama())){
              penumpangBiasa.remove(i);
              System.out.println("penumpang yang beranama "+nama+" telah turun");
             return penumpangBiasa.equals(nama);
           }else{
              System.out.println("Tidak ada penumpang");
               return false;
           }
        }
           
        for (int i = 0; i < penumpangPrioritas.size(); i ++) { 
            if(nama.equals(penumpangPrioritas.get(i).getNama())){
              penumpangPrioritas.remove(i);
              System.out.println("penumpang bernama "+nama+" telah diturunkan!!");
             return penumpangPrioritas.equals(nama);
            }else{
              System.out.println("Tidak Ada penumpang di Bus!"); 
               return false;
            }
        }return penumpangPrioritas.equals(nama);
    }

    public String toString(){
           String hasil1 = " ";
           String hasil2 = " ";
           
           for(Penumpang penumpang : penumpangBiasa) {
               hasil1 += penumpang.getNama().toString()+ " ";
            }
           for(Penumpang penumpang : penumpangPrioritas) {
               hasil2 += penumpang.getNama().toString()+ " ";
            }
            
          if(penumpangBiasa.isEmpty() == true ){  
              System.out.println("\ndaftar nama penumpang Biasa = <kosong>") ;
          }else{
              System.out.println("\ndaftar nama penumpang biasa = " +hasil1);
          }
            
          if(penumpangPrioritas.isEmpty() == true ){  
              System.out.println("daftar nama penumpang prioritas = <kosong>") ;
          }else{
              System.out.println("daftar nama penumpang prioritas = " +hasil2);
          }          
        return " Nama penumpang biasa = "+hasil1+"Nama penumpang prioritas = "+hasil2+"\n";
    }
}