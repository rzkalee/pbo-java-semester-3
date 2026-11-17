package inheritance;

class MahasiswaIF extends Mahasiswa {
    private String Keahlian;

    public MahasiswaIF(String nama, String nim, String program_studi, String keahlian) {
        super(nama, nim, program_studi);
        this.Keahlian = keahlian;
    }

    public void coding() {
        System.out.println("Keahlian    : " + Keahlian);
        System.out.println("Aktivitas   : Membuat Program");
    }
    
}
