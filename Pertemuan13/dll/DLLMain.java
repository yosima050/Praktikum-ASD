import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah Mahasiswa Setelah NIM Tertentu");
            System.out.println("8. Tambah Mahasiswa pada Index Tertentu");
            System.out.println("9. Hapus Mahasiswa Setelah NIM Tertentu");
            System.out.println("10. Hapus Mahasiswa pada Index Tertentu");
            System.out.println("11. Tampilkan Data Pertama");
            System.out.println("12. Tampilkan Data Terakhir");
            System.out.println("13. Tampilkan Data pada Index Tertentu");
            System.out.println("14. Tampilkan Jumlah Data Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node01 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 7 -> {
                    System.out.println("=== Tambah Mahasiswa Setelah NIM Tertentu ===");
                    System.out.print("Masukkan NIM patokan: ");
                    String keyNim = scan.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa baru: ");
                    String nimInsert = scan.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa baru: ");
                    String namaInsert = scan.nextLine();
                    System.out.print("Masukkan Kelas Mahasiswa baru: ");
                    String kelasInsert = scan.nextLine();
                    System.out.print("Masukkan IPK Mahasiswa baru: ");
                    double ipkInsert = scan.nextDouble(); 
                    scan.nextLine();
                    Mahasiswa01 mhsInsert = new Mahasiswa01(nimInsert, namaInsert, kelasInsert, ipkInsert);
                    list.insertAfter(keyNim, mhsInsert);
                    break;
                }
                case 8 -> {
                    System.out.println("=== Tambah Mahasiswa di Index Tertentu ===");
                    System.out.print("Masukkan Index: ");
                    int indexAdd = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.add(indexAdd, mhs);
                }
                case 9 -> {
                    System.out.println("=== Hapus Mahasiswa Setelah NIM Tertentu ===");
                    System.out.print("Masukkan NIM patokan: ");
                    String keyNim = scan.nextLine();
                    list.removeAfter(keyNim);
                }
                case 10 -> {
                    System.out.println("=== Hapus Mahasiswa pada Index Tertentu ===");
                    System.out.print("Masukkan Index: ");
                    int indexRemove = scan.nextInt();
                    scan.nextLine();
                    list.remove(indexRemove);
                }
                case 11 -> list.getFirst();
                case 12 -> list.getLast();
                case 13 -> {
                    System.out.print("Masukkan Index yang ingin dilihat: ");
                    int idx = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(idx);
                }
                case 14 -> {
                    int jumlah = list.size();
                    System.out.println("Jumlah data mahasiswa dalam list: " + jumlah);
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        scan.close();
    }

    public static Mahasiswa01 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
}