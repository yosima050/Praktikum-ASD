import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa sekaligus)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Belakang");
            System.out.println("6. Jumlah Antrian Sekarang");
            System.out.println("7. Jumlah Mahasiswa Sudah Proses KRS");
            System.out.println("8. Sisa Kuota Mahasiswa untuk DPA");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    MahasiswaKRS mhs = new MahasiswaKRS(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanDepan();
                    break;
                case 5:
                    antrian.tampilkanBelakang();
                    break;
                case 6:
                    System.out.println("Jumlah Antrian Sekarang: " + antrian.jumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah Mahasiswa Telah Proses KRS: " + antrian.jumlahProses());
                    break;
                case 8:
                    System.out.println("Sisa Kuota Mahasiswa untuk DPA: " + antrian.sisaMahasiswa());
                    break;
                case 9:
                    antrian.clear();
                    System.out.println("Antrian dikosongkan.");
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}
