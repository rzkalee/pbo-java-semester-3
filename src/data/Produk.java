package data;

public class Produk {
    private String namaProduk;
    private double harga;
    private double diskon;
    private double jumlahUang;

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("{Peringatan Harga tidak boleh negatif.}");
            System.exit(0);
        }
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        if (diskon >= 0.0 && diskon <= 100.0) {
            this.diskon = diskon;
        } else {
            System.out.println("{Peringatan} Diskon tidak valid! Harus antara 0% dan 100%.");
            System.exit(0);
        }
    }

    public double getJumlahUang() {
        return jumlahUang;
    }

    public void setJumlahUang(double jumlahUang) {
        if (jumlahUang >= getHargaSetelahDiskon()) {
            this.jumlahUang = jumlahUang;
        } else {
            System.out.println("[Peringatan] Uang kurang untuk membayar total belanjaan!");
            System.exit(0);
        }
    }
    public double getHargaSetelahDiskon() {
        double potongan = harga * (diskon / 100);
        return harga - potongan;
    }
    public double getKembalian() {
        return jumlahUang - getHargaSetelahDiskon();
    }
    public void tampilkanInfo() {
        System.out.println("\n=== RINCIAN BELANJA PRODUK ===");
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Awal: " + harga);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga Setelah Diskon: " + getHargaSetelahDiskon());
    }
    public void tampilkanKembalian() {
        System.out.println("Uang Dibayarkan: " + jumlahUang);
        System.out.println("Kembalian: " + getKembalian());
        System.out.println("===================================");
    }
}