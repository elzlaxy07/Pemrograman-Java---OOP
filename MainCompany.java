package aksesModifier;

import java.util.Scanner;

public class MainCompany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Pegawai\t: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan ID Pegawai\t: ");
        String idPegawai = scanner.nextLine();

        System.out.print("Masukkan Gaji Pokok\t: ");
        double gajiPokok = scanner.nextDouble();

        System.out.print("Apakah pegawai ini seorang Manajer? (y/n): ");
        char isManajer = scanner.next().toLowerCase().charAt(0);

        Pegawai pegawai;

        if (isManajer == 'y') {
            scanner.nextLine();
            System.out.print("Masukkan Divisi\t\t: ");
            String divisi = scanner.nextLine();
            pegawai = new Manajer(nama, idPegawai, gajiPokok, divisi);
        } else {
            pegawai = new Pegawai(nama, idPegawai, gajiPokok);
        }

        System.out.println("\n====DATA PEGAWAI====");
        pegawai.tampilkanData();
    }

}
