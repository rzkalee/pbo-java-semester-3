package inheritance;

class MahasiswaManajemen extends Mahasiswa {
    private String Keahlian;

    public MahasiswaManajemen(String nama, String nim, String program_studi, String keahlian) {
        super(nama, nim, program_studi);
        this.Keahlian = keahlian;
    }

    public void manajemen() {
        System.out.println("Keahlian    : " + Keahlian);
        System.out.println("Aktivitas   : Membuat Strategi Bisnis");
    }
}
