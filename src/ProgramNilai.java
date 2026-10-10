import java.util.Scanner;

public class ProgramNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa yang ingin dinilai: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine();
        System.out.println("\n--- MULAI PROSES PENILAIAN ---");

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("\nMahasiswa ke-" + i);
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = input.nextLine();
            System.out.print("Masukkan nilai mahasiswa (0-100): ");
            int nilaiUjian = input.nextInt();
            input.nextLine();

            String statusKelulusan;
            if (nilaiUjian >= 60) {
                statusKelulusan = "Lulus";
            } else {
                statusKelulusan = "Tidak Lulus";
            }

            System.out.println("Keterangan:");
            System.out.println("Nama Mahasiswa: " + nama + " dengan nilai " + nilaiUjian + " dinyatakan " + statusKelulusan);
        }

        input.close();
    }
}
