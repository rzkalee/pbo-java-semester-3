package inheritance;

class Main {
    public static void main (String[] args) {
        MahasiswaIF mhsIF = new MahasiswaIF(
            "Nafiz", "2026001", "Informatika", "Pemrograman");
        MahasiswaSI mhsSI = new MahasiswaSI(
            "ALfiz", "2026002", "Sistem Informasi", "Analisis Sistem");

        System.out.println("=== Mahasiswa INFORMATIKA ===");
        mhsIF.tampilkanInfo();
        mhsIF.coding();
        System.out.println();

        System.out.println("=== Mahasiswa SISTEM INFORMASI ===");
        mhsSI.tampilkanInfo();
        mhsSI.analisisSistem();
    }
}
