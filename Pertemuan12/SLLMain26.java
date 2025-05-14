package Pertemuan12;

public class SLLMain26 {
    public static void main(String[] args) {
        SingleLinkedList26 sll = new SingleLinkedList26();

        Mahasiswa26 mhs1 = new Mahasiswa26("22212203", "Dirga", "4D", 3.6);
        Mahasiswa26 mhs2 = new Mahasiswa26("22212202", "Cintia", "3C", 3.5);
        Mahasiswa26 mhs3 = new Mahasiswa26("23212201", "Bimon", "2B", 3.8);
        Mahasiswa26 mhs4 = new Mahasiswa26("24212200", "Alvaro", "1A", 4.0);

        sll.print();

        sll.addFirst(mhs1);
        System.out.println("Isi Linked List:");
        sll.print();

        sll.addLast(mhs4);
        System.out.println("Isi Linked List:");
        sll.print();

        sll.insertAfter("Dirga", mhs2);
        sll.insertAt(2, mhs3);

        System.out.println("Isi Linked List:");
        sll.print();
    }
}
