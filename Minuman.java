package PBO;

import java.util.Scanner;

public class Minuman extends Barang {
        protected int harga;
        protected String namaBarang;

        @Override
        void display() {
            System.out.println("================================================================");
            System.out.println("                       DAFTAR MINUMAN ");
            System.out.println("================================================================");
            System.out.println("NAMA MINUMAN        HARGA");
            System.out.println("1. Coca-Cola        Rp. 13.000");
            System.out.println("2. Sprite           Rp. 12.000");
            System.out.println("3. Fanta            Rp. 15.000");
            System.out.println("4. Tebs             Rp. 10.000");
            pilihBarang();
        }

        @Override
        void pilihBarang() {
            System.out.println("Pilih Minuman");
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan pilihan : ");
            int pilih = input.nextInt();
            switch (pilih){
                case 1 :
                    System.out.println("Anda Memilih Coca-Cola");
                    Barang.namaBarang = "Coca-Cola";
                    Barang.harga = 13000;
                    break;
                case 2 :
                    System.out.println("Anda Memilih Sprite");
                    Barang.namaBarang = "Sprite";
                    Barang.harga = 12000;
                    break;
                case 3 :
                    System.out.println("Anda Memilih Fanta");
                    Barang.namaBarang = "Fanta";
                    Barang.harga = 15000;
                    break;
                case 4 :
                    System.out.println("Anda Memilih Tebs");
                    Barang.namaBarang = "Tebs";
                    Barang.harga = 10000;
                    break;
            }
        }
    }