package data;

public class Mahasiswa {
    private String nama;
    private String nim;
    private double nilai;
    private String mataKuliah; //TANTANGAN
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public double getNilai() {
        return nilai;
    }
    public void setNilai(double nilai) {
        if (nilai >= 0.0 && nilai <= 100.0) {
            this.nilai = nilai;
        } else {
            System.out.println("[Peringatan] Nilai tidak valid! Harus antara 0.0 dan 100.0.");
        }
    }
    public String getMataKuliah() {
        return mataKuliah;
    } //TANTANGAN
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    } //TANTANGAN
    public String getStatusKelulusan() {
        if (nilai >= 60.0) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
    public void tampilkanInfo() {
        System.out.println("\n=== INFORMASI MAHASISWA ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai: " + nilai);
        System.out.println("Mata Kuliah: " + mataKuliah); //TANTANGAN
        System.out.println("Status: " + getStatusKelulusan());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }
}
