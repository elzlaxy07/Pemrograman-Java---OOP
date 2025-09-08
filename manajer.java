package company;

public class manajer extends pegawai {
    String divisi;

    public manajer(String nama, String idPegawai, double gajiPokok, String divisi) {
        super(nama, idPegawai, gajiPokok);
        this.divisi = divisi;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("ID Pegawai\t: " + idPegawai);
        System.out.println("Divisi\t\t: " + divisi);
    }
}

