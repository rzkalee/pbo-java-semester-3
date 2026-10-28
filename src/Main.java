import java.util.Scanner;
import data.Produk;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produk produk = new Produk();

        System.out.println("\n=== MASUKAN DATA PRODUK ===");
        System.out.print("Masukkan nama produk: ");
        produk.setNamaProduk(input.nextLine());

        System.out.print("Masukkan harga dasar: ");
        produk.setHarga(input.nextDouble());

        System.out.print("Masukkan diskon (%): ");
        produk.setDiskon(input.nextDouble());
        produk.tampilkanInfo();

        System.out.print("Masukkan pembayaran: ");
        double uangBayar = input.nextDouble();
        produk.setJumlahUang(uangBayar);


        System.out.println("\n=== DATA AKHIR TRANSAKSI ===");
        produk.tampilkanInfo();
        produk.tampilkanKembalian();
        input.close();
    }
}
