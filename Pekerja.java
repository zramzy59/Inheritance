import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pekerja extends Manusia {
    private double gaji; // Gaji per bulan
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah,
                   double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    // Getter dan Setter
    public double getGaji() { return gaji; }
    public LocalDate getTahunMasuk() { return tahunMasuk; }
    public int getJumlahAnak() { return jumlahAnak; }

    public void setGaji(double gaji) { this.gaji = gaji; }
    public void setTahunMasuk(LocalDate tahunMasuk) { this.tahunMasuk = tahunMasuk; }
    public void setJumlahAnak(int jumlahAnak) { this.jumlahAnak = jumlahAnak; }

    // Menghitung lama bekerja dalam tahun
    public int getLamaBekerja() {
        return (int) ChronoUnit.YEARS.between(tahunMasuk, LocalDate.now());
    }

    // Menghitung bonus berdasarkan masa kerja
    public double getBonus() {
        int lama = getLamaBekerja();
        if (lama <= 5) return gaji * 0.05;
        else if (lama <= 10) return gaji * 0.10;
        else return gaji * 0.15;
    }

    // Menghitung tunjangan anak (Rp300.000 per anak)
    public double getTunjanganAnak() {
        return jumlahAnak * 300_000;
    }

    // Total pendapatan = tunjangan + bonus + tunjangan anak + gaji
    public double getPendapatan() {
        return super.getTunjangan() + getBonus() + getTunjanganAnak() + gaji;
    }

    public String toString() {
        return super.toString() +
               "Tahun Masuk    : " + tahunMasuk.getYear() + "\n" +
               "Lama Bekerja   : " + getLamaBekerja() + " tahun\n" +
               "Jumlah Anak    : " + jumlahAnak + "\n" +
               "Gaji Pokok     : Rp" + String.format("%,.0f", gaji) + "\n" +
               "Bonus          : Rp" + String.format("%,.0f", getBonus()) + "\n" +
               "Tunjangan Anak : Rp" + String.format("%,.0f", getTunjanganAnak()) + "\n" +
               "Total Pendapatan: Rp" + String.format("%,.0f", getPendapatan()) + "\n";
    }
}
