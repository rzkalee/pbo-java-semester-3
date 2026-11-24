package polymorphism;

public class Main {
    public static void main(String[] args) {
        Binatang [] daftarBintang = {
            new Kucing(),
            new Burung()
        };
        System.out.println("Binatang diminta untuk bergerak :");
        System.out.println("____________________________________________");
        for (int i = 0; i < daftarBintang.length; i++) {
            daftarBintang[i].bergerak();
        }
        System.out.println("____________________________________________");
    }
}
