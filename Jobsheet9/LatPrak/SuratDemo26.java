import java.util.Scanner;

public class SuratDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat26 stack = new StackSurat26(10);

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat26 surat = new Surat26(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.println("Surat izin berhasil diterima.");
                    break;

                case 2:
                    Surat26 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari: " + diproses.namaMahasiswa);
                        System.out.println("Jenis: " + (diproses.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi: " + diproses.durasi + " hari");
                    }
                    break;

                case 3:
                    Surat26 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari: " + terakhir.namaMahasiswa);
                        System.out.println("Jenis: " + (terakhir.jenisIzin == 'S' ? "Sakit" : "Izin"));
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    boolean ditemukan = stack.cariSurat(cari);
                    if (ditemukan) {
                        System.out.println("Surat izin dari " + cari + " ditemukan.");
                    } else {
                        System.out.println("Tidak ditemukan surat dari " + cari);
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
