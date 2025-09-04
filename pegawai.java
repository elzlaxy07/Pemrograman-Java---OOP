package aksesModifier;

public class pegawai {
    public String nama;
    protected String idPegawai;
    private double gajiPokok;

    // Constructor
    public pegawai(String nama, String idPegawai, double gajiPokok) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menampilkan data pegawai
    public void tampilkanData() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("ID Pegawai\t: " + idPegawai);
        System.out.println("Gaji Pokok\t: Rp" + gajiPokok);
    }

    // Getter untuk gajiPokok agar bisa diakses subclass
    public double getGajiPokok() {
        return gajiPokok;
    }

    // Setter jika ingin mengubah gaji
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
}