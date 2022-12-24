package PBO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mesin mesin = new VendingMachine();
        User user = new User(mesin);

        Scanner input = new Scanner(System.in);
        String aksi;

        while(true) {
            System.out.println("\n==================================================================");
            System.out.println("                        TIME TRAVEL RENTAL                      ");
            System.out.println("                      Solusi Perjalanan Anda                    ");
            System.out.println("==================================================================");
            user.masukUang();
            user.pililhBarang();
            user.uangKembali();
            System.out.println("Lanjut atau keluar ([y]/[n])");
            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("n")) {
                user.cetakStruk();
                System.exit(0);
            } else {
                System.out.println(" ");
            }
        }
    }
}