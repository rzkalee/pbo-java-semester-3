import java.util.Scanner;

public class ProgramNilaiOOP {
    String namaMahasiswa;
    int jumlahMahasiswa;
    double nilaiUjian;
    String statusKelulusan;

    int inputJumlahMahasiswa(Scanner input) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();
        input.nextLine();
        return jumlahMahasiswa;
    }

    void inputDataMahasiswa(Scanner input) {
        System.out.print("Masukkan nama mahasiswa: ");
        namaMahasiswa = input.nextLine();
        System.out.print("Masukkan nilai mahasiswa (0-100): ");
        nilaiUjian = input.nextDouble();
        input.nextLine();
    }

    String hitungStatusKelulusan() {
        if (nilaiUjian >= 60) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    void tampilkanHasil() {
        statusKelulusan = hitungStatusKelulusan();
        System.out.println("Keterangan:");
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Nilai: " + nilaiUjian);
        System.out.println("Status Kelulusan: " + statusKelulusan);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProgramNilaiOOP mahasiswa = new ProgramNilaiOOP();
        int jumlah = mahasiswa.inputJumlahMahasiswa(input);
        System.out.println("\n---PROSES PENILAIAN---");
        
        for (int i = 1; i <= jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + i);
            mahasiswa.inputDataMahasiswa(input);
            mahasiswa.tampilkanHasil();
        }
        input.close();
    }
}
