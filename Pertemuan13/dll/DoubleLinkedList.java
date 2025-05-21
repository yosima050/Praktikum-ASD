public class DoubleLinkedList {
    Node01 head;
    Node01 tail;
    int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }

        Node01 hapus = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        

        System.out.print("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        hapus.data.tampil();
        size--;
    }


    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }

        Node01 hapus = tail;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        

        System.out.print("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        hapus.data.tampil();
        size--;
    }


    public void insertAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node01 newNode = new Node01(data);
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }
        Node01 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }


    public Node01 search(String nim) {
        Node01 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void add(int index, Mahasiswa01 data) {
        if (index < 0 || index > size) {
            System.out.println("Index di luar batas.");
            return;
        }

        if (index == 0) {
            addFirst(data);
        } else {
            Node01 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node01 newNode = new Node01(data);
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void removeAfter(String keyNim) {
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current != null && current.next != null) {
            Node01 toRemove = current.next;
            current.next = toRemove.next;
            if (toRemove.next != null) {
                toRemove.next.prev = current;
            } else {
                tail = current;
            }
            System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus: " + toRemove.data.nim);
        } else {
            System.out.println("Data setelah NIM " + keyNim + " tidak ditemukan atau tidak ada.");
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index di luar batas.");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else {
            Node01 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            System.out.println("Data yang dihapus: " + current.data.nim);
            if (current == tail) {
                removeLast();
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }

    public void getFirst() {
        if (!isEmpty()) {
            System.out.println("Data pertama:");
            head.data.tampil();
        } else {
            System.out.println("List kosong");
        }
    }

    public void getLast() {
        if (!isEmpty()) {
            System.out.println("Data terakhir:");
            tail.data.tampil();
        } else {
            System.out.println("List kosong");
        }
    }

    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index di luar batas.");
            return;
        }

        Node01 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        System.out.println("Data pada index " + index + ":");
        current.data.tampil();
    }

    public int size() {
        int count = 0;
        Node01 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
        
}