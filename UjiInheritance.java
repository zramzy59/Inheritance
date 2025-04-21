import java.time.LocalDate;

public class UjiInheritance {
    public static void main(String[] args) {
        // === TEST CASE MANUSIA ===
        Manusia zulfikar = new Manusia("Zulfikar", true, "123456789", true);
        Manusia ramzy = new Manusia("Ramzy", false, "987654321", true);
        Manusia sung = new Manusia("Sung", true, "192837465", false);

        System.out.println("==== DATA MANUSIA ====");
        System.out.println(zulfikar);
        System.out.println(ramzy);
        System.out.println(sung);

        // === TEST CASE MAHASISWA ===
        MahasiswaFILKOM jinwoo1 = new MahasiswaFILKOM("Jinwoo", true, "246813579", false, "215150700111001", 2.8);
        MahasiswaFILKOM jinwoo2 = new MahasiswaFILKOM("Jinwoo", true, "246813579", false, "215150600111002", 3.3);
        MahasiswaFILKOM jinwoo3 = new MahasiswaFILKOM("Jinwoo", true, "246813579", false, "215150400111003", 3.7);

        System.out.println("==== DATA MAHASISWA FILKOM ====");
        System.out.println(jinwoo1);
        System.out.println(jinwoo2);
        System.out.println(jinwoo3);

        // === TEST CASE PEKERJA ===
        Pekerja zulfikarWorker = new Pekerja("Zulfikar", true, "1100223344", true, 2_500_000, LocalDate.now().minusYears(2), 2);
        Pekerja ramzyWorker = new Pekerja("Ramzy", false, "9988776655", true, 3_500_000, LocalDate.now().minusYears(9), 0);
        Pekerja sungWorker = new Pekerja("Sung", true, "6677889900", true, 5_000_000, LocalDate.now().minusYears(20), 10);

        System.out.println("==== DATA PEKERJA ====");
        System.out.println(zulfikarWorker);
        System.out.println(ramzyWorker);
        System.out.println(sungWorker);

        // === TEST CASE MANAGER ===
        Manager jinwooManager = new Manager("Jinwoo", true, "123123123", true, 7_500_000, LocalDate.now().minusYears(15), 0, "IT Development");

        System.out.println("==== DATA MANAGER ====");
        System.out.println(jinwooManager);
    }
}
