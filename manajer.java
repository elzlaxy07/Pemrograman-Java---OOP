package aksesModifier;

public class Manajer extends Pegawai {
    String divisi; // default access modifier

    // Constructor
    public Manajer(String nama, String idPegawai, double gajiPokok, String divisi) {
        super(nama, idPegawai, gajiPokok); // memanggil constructor parent
        this.divisi = divisi;
    }

    // Override method tampilkanData()
    @Override
    public void tampilkanData() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("ID Pegawai\t: " + idPegawai);
        System.out.println("Divisi\t\t: " + divisi);
        // Tidak menampilkan gaji pokok sesuai instruksi
    }
}