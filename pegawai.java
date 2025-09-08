package aksesModifier;

public class pegawai {
    public String nama;
    protected String idPegawai;
    private double gajiPokok;

    public pegawai(String nama, String idPegawai, double gajiPokok) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.gajiPokok = gajiPokok;
    }

    public void tampilkanData() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("ID Pegawai\t: " + idPegawai);
        System.out.println("Gaji Pokok\t: Rp" + gajiPokok);
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
}
