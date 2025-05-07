public class Surat26 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat26() {
        this.idSurat = "";
        this.namaMahasiswa = "";
        this.kelas = "";
        this.jenisIzin = '-';
        this.durasi = 0;
    }

    public Surat26(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}
