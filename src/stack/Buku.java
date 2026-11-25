package stack;

public class Buku extends Tumpukan {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("PROGRAM TUMPUKAN BUKU (LIFO)");
        System.out.println("--------------------------------------------");

        Buku buku = new Buku();
        buku.push("Java");
        buku.push("Visual Studio");
        buku.push("CodeIgniter");
        buku.push("Algorithm");
        buku.push("Kalkulus");
        buku.push("Sistem Operasi");
        
        System.out.println("Kapasitas : " + buku.MAKSADATA);
        System.out.println("--------------------------------------------");
        System.out.println("Urutasan buku yang di keluarkan :");
        while (!buku.empty()) {
            String data = buku.pop();
            System.out.println(data);
        }
        System.out.println("--------------------------------------------");
    }    
}
