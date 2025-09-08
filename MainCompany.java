package company;

import java.util.Scanner;

public class MainCompany {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

        System.out.println("\n====INPUT DATA PEGAWAI====");
        System.out.print("Masukkan Nama Pegawai\t: ");
        String nama = input.nextLine();
        System.out.print("Masukkan ID Pegawai\t: ");
        String idPegawai = input.nextLine();
        System.out.print("Masukkan Gaji Pokok\t: ");
        double gajiPokok = input.nextDouble();
        System.out.println("\n=============================================");

        input.nextLine();
        
        System.out.print("Apakah pegawai ini seorang Manajer? (y/n): ");
        String isManajer = input.nextLine();

        pegawai p;

        if (isManajer.equalsIgnoreCase("y")) {
            System.out.print("Masukkan Divisi\t\t: ");
            String divisi = input.nextLine();
            p = new manajer(nama, idPegawai, gajiPokok, divisi); 
        } else {
            p = new pegawai(nama, idPegawai, gajiPokok);
        }

        System.out.println("\n====DATA PEGAWAI====");
        p.tampilkanData();
        
        input.close();
        }
    }
}
