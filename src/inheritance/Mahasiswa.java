package inheritance;

public class Mahasiswa {
    protected String nama;
    protected String nim;
    protected String program_studi;

    protected Mahasiswa(String nama, String nim, String program_studi) {
        this.nama = nama;
        this.nim = nim;
        this.program_studi = program_studi;
    }

    protected void tampilkanInfo() {
        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + nim);
        System.out.println("Program Studi   : " + program_studi);
    }
}
