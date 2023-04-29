/**
 * LinkedList.java
 * [Jelaskan kegunaan class ini]
 * 
 * @author [NIM] [Nama]
 */

public class DoubleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Konstruktor
     * buat Double linked list dengan size = 0 dan head = tail = null
     */
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Cari elemen yang terletak pada posisi position
     * 
     * @param position
     * @return elemen pada posisi position jika ada, null jika tidak ada
     */
    public Node<T> getNode(int position) {
        int i = 0;
        Node<T> cur = head;
        while (cur != null && i < position) {
            cur = cur.getNext();
            i++;
        }

        return cur;
    }

    /**
     * Tambah elemen dengan nilai item dengan menambahkan
     * node sebagai elemen paling belakang
     * 
     * @param item
     */
    public void add(T item) {
        Node<T> newNode = new Node<T>(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    /**
     * Cari nilai elemen pada posisi position
     * 
     * @param position
     * @return nilai elemen pada posisi position jika ada, null jika tidak ada
     */
    public T get(int position) {
        Node<T> cur = getNode(position);
        if (cur != null) {
            return cur.getValue();
        } else {
            return null;
        }
    }

    /**
     * Ubah nilai elemen pada posisi position menjadi nilai item jika ada
     * 
     * @param position
     * @param item
     */
    public void set(int position, T item) {
        Node<T> cur = getNode(position);
        if (cur != null) {
            cur.setValue(item);
        }
    }

    /**
     * Hapus elemen pada posisi position jika ada
     * 
     * @param position
     */
    public void remove(int position) {
        Node<T> cur = getNode(position);
        if (cur != null) {
            if (cur.getPrev() != null) {
                cur.getPrev().setNext(cur.getNext());
            } else {
                head = cur.getNext();
            }

            if (cur.getNext() != null) {
                cur.getNext().setPrev(cur.getPrev());
            } else {
                tail = cur.getPrev();
            }
            size--;
        }
    }

    /**
     * Hapus semua elemen dari Double Linked List
     */
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Getter size
     * 
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * Menampilkan keseluruhan isi Double Linked List
     * Format yang dikeluarkan adalah sebagai berikut, misal isi list adalah
     * [1,2,3,4]
     * Maka output yang dihasilkan adalah (dengan enter) :
     * 1 2 3 4
     */
    public void display() {
        Node<T> cur = head;
        while (cur != null) {
            System.out.print(cur.getValue() + " ");
            cur = cur.getNext();
        }
        System.out.println();
    }

    /**
     * Find element position
     * jika terdapat lebih dari 1 elemen dengan nilai yang sama, maka ambil posisi
     * yang ditemukan pertama kali dari head
     * Jika posisi elemen tidak ditemukan maka return -1
     * 
     * @return posisi dari sebuah item mulai dari head dengan zero indexing
     */
    public Integer find(T item) {
        Node<T> cur = head;
        int i = 0;
        while (cur != null) {
            if (cur.getValue().equals(item)) {
                return i;
            }
            cur = cur.getNext();
            i++;
        }
        return -1;
    }
}