package izaaa.hashmap;

import java.util.Scanner;
import java.util.HashMap;


public class mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;
    
    public mahasiswa(String nm, String kl , String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       HashMap<String ,mahasiswa> mhs = new HashMap<>();
       String input;
       mahasiswa data;
       
       mhs.put("1", new mahasiswa("Putri", "3H" ,"Struktur Data" ,2020000));
       mhs.put("2", new mahasiswa("Agus", "3A" ,"Maatematika" ,2020012));
       mhs.put("3", new mahasiswa("Arro", "3D" ,"Pemrogaman" ,2020000));
       
       System.out.println("Masukkan ID : ");
       input = in.nextLine();
       data = mhs.get(input);
       if (data != null){
           System.out.println("Data Mahasiswa : " + data.nama + ",kelas :" + data.kelas + ",mata kuliah praktikum : "+ data.matkulPraktikum + ",nim : " + data.nim);
           
       }
       
    }
}
