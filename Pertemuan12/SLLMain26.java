package Pertemuan12;

public class SLLMain26 {
    public static void main(String[] args) {
        SingleLinkedList26 sll = new SingleLinkedList26();

        Mahasiswa26 mhs1 = new Mahasiswa26("22212203", "Dirga", "4D", 3.6);
        Mahasiswa26 mhs2 = new Mahasiswa26("22212202", "Cintia", "3C", 3.5);
        Mahasiswa26 mhs3 = new Mahasiswa26("23212201", "Bimon", "2B", 3.8);

        sll.addLast(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        System.out.println("Isi Linked List:");
        sll.removeFirst();
        sll.print();

        System.out.println();
        sll.removeAt(0);
        System.out.println("Isi Linked List:");
        sll.print();
    }
}
