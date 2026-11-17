package inheritance;

class MahasiswaAkuntansi extends Mahasiswa {
    private String Keahlian;

    public MahasiswaAkuntansi(String nama, String nim, String program_studi, String keahlian) {
        super(nama, nim, program_studi);
        this.Keahlian = keahlian;
    }

    public void akuntansi() {
        System.out.println("Keahlian    : " + Keahlian);
        System.out.println("Aktivitas   : Membuat Laporan Keuangan");
    }
}

