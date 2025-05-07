public class AntrianKRS {
    MahasiswaKRS[] data;
    int front, rear, size, max, totalProses;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new MahasiswaKRS[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalProses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }

    public void tambahAntrian(MahasiswaKRS mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " masuk antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa diperlukan untuk proses KRS.");
            return;
        }
        System.out.println("Memproses KRS untuk 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            MahasiswaKRS mhs = data[front];
            front = (front + 1) % max;
            size--;
            totalProses++;
            mhs.tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Data Antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }

    public void tampilkanDepan() {
        if (size < 2) {
            System.out.println("Kurang dari 2 mahasiswa dalam antrian.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan:");
        for (int i = 0; i < 2; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void tampilkanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa Paling Belakang:");
        data[rear].tampilkanData();
    }

    public int jumlahAntrian() {
        return size;
    }

    public int jumlahProses() {
        return totalProses;
    }

    public int sisaMahasiswa() {
        return 30 - totalProses;
    }
}
