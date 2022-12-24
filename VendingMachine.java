package PBO;

import java.util.Scanner;

public class VendingMachine implements Mesin {
    protected int uang;
    protected int kembali;

    @Override
    public void Uang() {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan Uang Anda (Kelipatan 5000) : ");
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

    @Override
    public void struk() {
        System.out.println("\n================================================================");
        System.out.println("                           VENDING MACHINE                        ");
        System.out.println("==================================================================");
        System.out.println("Uang anda   : " + uang);
        System.out.println(" ");
        System.out.println("JENIS BARANG    HARGA   KEMBALIAN");
        System.out.println("------------------------------------------------------------------");
        System.out.println("\t" + Barang.namaBarang + "\t\t" + Barang.harga + "\t\t" + kembali);
        System.out.println("==================================================================");
    }
}
