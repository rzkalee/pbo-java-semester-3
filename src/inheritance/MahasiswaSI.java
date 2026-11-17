package inheritance;

class MahasiswaSI extends Mahasiswa {
    private String Keahlian;

    public MahasiswaSI(String nama, String nim, String program_studi, String keahlian) {
        super(nama, nim, program_studi);
        this.Keahlian = keahlian;
    }

    public void analisisSistem() {
        System.out.println("Keahlian    : " + Keahlian);
        System.out.println("Aktivitas   : Menganalisis sistem");
    }
}