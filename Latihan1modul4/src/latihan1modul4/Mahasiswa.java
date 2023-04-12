package latihan1modul4;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulpraktikum;
    int nim;
    
    public Mahasiswa(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulpraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;
        
        mhs.put("1", new Mahasiswa("Calvin", "3H", "Struktur Data", 2021363));
        mhs.put("2", new Mahasiswa("Afidz", "3A", "Matematika", 2021362));
        mhs.put("3", new Mahasiswa( "Andika", "3D", "Pemrograman", 2021384));
        
        System.out.println("Masukin ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : " +
                    data.kelas + ", mata kuliah praktikum : " + data.matkulpraktikum +
                    ", nim : " + data.nim);
        }
    }
    
}