public class Node01 {
    Mahasiswa01 data;
    Node01 prev;
    Node01 next;
    int size;

    public Node01(Mahasiswa01 data) {
        this.data = data;
        this.prev = null;
        this.next = null;
        this.size = 0;
    }
}