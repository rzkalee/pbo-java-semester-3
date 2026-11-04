import java.util.Scanner;
import data.Mahasiswa;

public class Proses {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        System.out.println("DATA MAHASISWA");
        System.out.print("Masukkan Nama: ");
        String namaInput = input.nextLine();
        mhs.setNama(namaInput);

        System.out.print("Masukkan NIM: ");
        String nimInput = input.nextLine();
        mhs.setNim(nimInput);

        System.out.print("Masukkan Mata Kuliah: ");
        String mataKuliahInput = input.nextLine();
        mhs.setMataKuliah(mataKuliahInput); //TANTANGAN

        System.out.print("Masukkan Nilai: ");
        double nilaiInput = input.nextDouble();
        mhs.setNilai(nilaiInput);
        mhs.tampilkanInfo();

        System.out.println("\nMasukan Nilai Perbaikan: ");
        double nilaiBaru = input.nextDouble();
        mhs.setNilai(nilaiBaru);

        System.out.println("\n+++++++++++++++++++++++++++++++++++");
        System.out.println("DATA SETELAH PERUBAHAN NILAI");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        mhs.tampilkanInfo();
        input.close();
    } 
}
