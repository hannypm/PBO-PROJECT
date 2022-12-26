package PBO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class VendingMachine implements Mesin {
    protected int uang;
    protected int kembali;

    @Override
    public void Uang() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Uang Anda : ");
        uang = in.nextInt();
        this.uang = uang;
    }

    @Override
    public void pilih() {
        Scanner in = new Scanner(System.in);
        System.out.println("Silahkan pilih jenis Barang : ");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Masukan pilihan : ");
        int pilih = in.nextInt();
        switch(pilih){
            case 1 :
                Barang makan = new Makanan();
                makan.display();
                break;
            case 2 :
                Barang minum = new Minuman();
                minum.display();
                break;
        }
    }

    @Override
    public void kembalian() {
        System.out.print("Kembalian anda : ");
        System.out.println(hitungKembali(uang, Barang.harga));
    }

    public int hitungKembali(int uang, int harga ){
        kembali=uang-harga;
        return (int) kembali;
    }
            public void struk() {
                File file = new File("Struk.txt");
                PrintWriter output;
                {
                    try {
                        output = new PrintWriter(file);
        output.println("\n||==================================================================||");
        output.println("||                           VENDING MACHINE                        ||");
        output.println("||==================================================================||");
        Scanner in = new Scanner(System.in);

        output.println("Uang anda   : " + uang);
        output.println("======================================================================");
        output.println("JENIS BARANG    HARGA   KEMBALIAN");
        output.println("======================================================================");
        output.println("\t" + Barang.namaBarang + "\t\t" + Barang.harga + "\t\t" + kembali );
        output.println("======================================================================");
                        output.close();

                System.out.println("Struk telah tercetak di 'Struk.txt'");
            } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
            throw new RuntimeException(e);
            }
        }
    }
}

