package Pertemuan12;

public class Mahasiswa26 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa26() {}

    public Mahasiswa26(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-10s %-5s %.1f\n", nama, nim, kelas, ipk);
    }
}