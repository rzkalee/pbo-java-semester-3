package polymorphism;

class BangunDatar {
    protected BangunDatar() {
        System.out.println("____________________________________________");
        System.out.println("Hasil Perhitungan Bangun Datar :");
        System.out.println("____________________________________________");
    }

    protected int luasPersegi(int sisi) {
        return sisi * sisi;
    }

    protected int luasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    protected int luasSegitiga(int alas, int tinggi) {
        return (int)(0.5 * alas * tinggi);
    }
}

public class HitungLuas extends BangunDatar {
    public HitungLuas() {
        super();
    }

    public static void main(String[] args) {
    HitungLuas hitung = new HitungLuas();
        int Persegi = hitung.luasPersegi(5);
        int PersegiPanjang = hitung.luasPersegiPanjang(5, 10);
        int Segitiga = hitung.luasSegitiga(5, 10);

        System.out.println("Luas Persegi dengan sisi 5: " + Persegi);
        System.out.println("Luas Persegi Panjang dengan panjang 5 dan lebar 10: " + PersegiPanjang);
        System.out.println("Luas Segitiga dengan alas 5 dan tinggi 10: " + Segitiga);
        System.out.println("____________________________________________");
    }
}
