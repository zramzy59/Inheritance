import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah,
                   double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    // Getter dan Setter
    public String getDepartemen() { return departemen; }
    public void setDepartemen(String departemen) { this.departemen = departemen; }

    // Tambahan tunjangan untuk manajer 10% dari gaji
    public double getTunjanganManager() {
        return getGaji() * 0.10;
    }

    // Total pendapatan = pendapatan pekerja + tunjangan manajer
    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getTunjanganManager();
    }

    public String toString() {
        return super.toString() +
               "Departemen     : " + departemen + "\n" +
               "Tunjangan Manager: Rp" + String.format("%,.0f", getTunjanganManager()) + "\n" +
               "Total Pendapatan (Final): Rp" + String.format("%,.0f", getPendapatan()) + "\n";
    }
}
