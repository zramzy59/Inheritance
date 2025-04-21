public class Manusia {
    protected String nama;
    protected boolean jenisKelamin; // true: laki-laki, false: perempuan
    protected String nik;
    protected boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    // Getter dan Setter
    public String getNama() { return nama; }
    public boolean isJenisKelamin() { return jenisKelamin; }
    public String getNik() { return nik; }
    public boolean isMenikah() { return menikah; }

    public void setNama(String nama) { this.nama = nama; }
    public void setJenisKelamin(boolean jenisKelamin) { this.jenisKelamin = jenisKelamin; }
    public void setNik(String nik) { this.nik = nik; }
    public void setMenikah(boolean menikah) { this.menikah = menikah; }

    // Menghitung tunjangan dalam Rupiah
    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 375_000 : 300_000; // Laki-laki: Rp375.000, perempuan: Rp300.000
        } else {
            return 225_000; // Belum menikah: Rp225.000
        }
    }

    // Pendapatan hanya dari tunjangan
    public double getPendapatan() {
        return getTunjangan();
    }

    // Menampilkan data objek manusia
    public String toString() {
        return "Nama           : " + nama + "\n" +
               "NIK            : " + nik + "\n" +
               "Jenis Kelamin  : " + (jenisKelamin ? "Laki-laki" : "Perempuan") + "\n" +
               "Pendapatan     : Rp" + String.format("%,.0f", getPendapatan()) + "\n";
    }
}
