package inheritance;

class Main {
    public static void main (String[] args) {
        MahasiswaIF mhsIF = new MahasiswaIF(
            "Nafiz", "2026001", "Informatika", "Pemrograman");
        MahasiswaSI mhsSI = new MahasiswaSI(
            "ALfiz", "2026002", "Sistem Informasi", "Analisis Sistem");
        MahasiswaManajemen mhsManajemen = new MahasiswaManajemen(
            "Budi", "2026003", "Manajemen", "Strategi Bisnis");
        MahasiswaAkuntansi mhsAkuntansi = new MahasiswaAkuntansi(
            "Citra", "2026004", "Akuntansi", "Laporan Keuangan");

        System.out.println("=== Mahasiswa INFORMATIKA ===");
        mhsIF.tampilkanInfo();
        mhsIF.coding();
        System.out.println();

        System.out.println("=== Mahasiswa SISTEM INFORMASI ===");
        mhsSI.tampilkanInfo();
        mhsSI.analisisSistem();
        System.out.println();

        System.out.println("=== Mahasiswa MANAJEMEN ===");
        mhsManajemen.tampilkanInfo();
        mhsManajemen.manajemen();
        System.out.println();

        System.out.println("=== Mahasiswa AKUNTANSI ===");
        mhsAkuntansi.tampilkanInfo();
        mhsAkuntansi.akuntansi();
    }
}
