package Pertemuan12;

public class SingleLinkedList26 {
    NodeMahasiswa26 head;
    NodeMahasiswa26 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa26 tmp = head;
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void addFirst(Mahasiswa26 input) {
        NodeMahasiswa26 ndInput = new NodeMahasiswa26(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa26 input) {
        NodeMahasiswa26 ndInput = new NodeMahasiswa26(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa26 input) {
        NodeMahasiswa26 ndInput = new NodeMahasiswa26(input, null);
        NodeMahasiswa26 temp = head;
        do { 
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    

    public void insertAt(int index, Mahasiswa26 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa26 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa26(input, temp.next);
            if (temp.next.next == null) 
            tail = temp.next;
        }
    }
}
