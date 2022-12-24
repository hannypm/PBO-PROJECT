package PBO;

import java.util.Scanner;

public class Makanan extends Barang {
    protected int harga;
    protected String namaBarang;

    @Override
    void display() {
        System.out.println("================================================================");
        System.out.println("                       DAFTAR MAKANAN ");
        System.out.println("================================================================");
        System.out.println("NAMA MAKANAN        HARGA");
        System.out.println("1. Cheetos          Rp. 10.000");
        System.out.println("2. Qtela            Rp. 12.000");
        System.out.println("3. Lays             Rp. 9.000");
        System.out.println("4. Chitato          Rp. 11.000");
        pilihBarang();
    }

    @Override
    void pilihBarang() {
        System.out.println("Pilih Makanan");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        switch (pilih){
            case 1 :
                System.out.println("Anda Memilih Cheetos");
                Barang.namaBarang = "Cheetos";
                Barang.harga = 10000;
                break;
            case 2 :
                System.out.println("Anda Memilih Qtela");
                Barang.namaBarang = "Qtela";
                Barang.harga = 12000;
                break;
            case 3 :
                System.out.println("Anda Memilih Lays");
                Barang.namaBarang = "lays";
                Barang.harga = 9000;
                break;
            case 4 :
                System.out.println("Anda Memilih Chitato");
                Barang.namaBarang = "Chitato";
                Barang.harga = 11000;
                break;
        }
    }
}
