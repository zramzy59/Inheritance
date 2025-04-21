public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah,
                           String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    // Getter dan Setter
    public String getNim() { return nim; }
    public double getIpk() { return ipk; }

    public void setNim(String nim) { this.nim = nim; }
    public void setIpk(double ipk) { this.ipk = ipk; }

    // Mengembalikan beasiswa berdasarkan IPK dalam Rupiah
    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) return 750_000;
        if (ipk > 3.5 && ipk <= 4.0) return 1_125_000;
        return 0;
    }

    // Status mahasiswa (prodi dan angkatan) berdasarkan NIM
    public String getStatus() {
        String angkatan = "20" + nim.substring(0, 2);
        char kodeProdi = nim.charAt(6);
        String prodi = switch (kodeProdi) {
            case '2' -> "Teknik Informatika";
            case '3' -> "Teknik Komputer";
            case '4' -> "Sistem Informasi";
            case '6' -> "Pendidikan Teknologi Informasi";
            case '7' -> "Teknologi Informasi";
            default -> "Prodi Tidak Diketahui";
        };
        return prodi + ", " + angkatan;
    }

    // Total pendapatan = tunjangan + beasiswa
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    // Menampilkan informasi lengkap mahasiswa
    public String toString() {
        return super.toString() +
               "NIM            : " + nim + "\n" +
               "IPK            : " + ipk + "\n" +
               "Status         : " + getStatus() + "\n" +
               "Beasiswa       : Rp" + String.format("%,.0f", getBeasiswa()) + "\n" +
               "Total Pendapatan: Rp" + String.format("%,.0f", getPendapatan()) + "\n";
    }
}
