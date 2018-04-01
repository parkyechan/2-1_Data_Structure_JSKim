package DLinkedList;
public class DLinkedList<T> {

    private Node<T> header;
    private Node<T> trailer;
    private int size = 0;

    public DLinkedList() {
    	header = new Node<>(null, null, null);
    	trailer = new Node<>(null, header, null);
    	header.setNext(trailer);
    }

    public void setHeaderInfo(T info) {
        header.setItem(info);
    }

    public void setTrailerInfo(T info) {
        trailer.setItem(info);
    }
 
    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() { return size; }

    public Node<T> getFirst() {
        return header.getNext();
    }

    public Node<T> getLast() {
        return trailer.getPrev();
    }

    public void addFirst(Node<T> n) {
    	Node<T> newnode = new Node<T>(item, header, trailer);
		header = newnode;
		size++;
    }

    public void addLast(Node<T> n) {
        /**/
    }

    public T removeFirst() {
        /**/
    }

    public T removeLast() {
        /**/
    }

    public void addAfter(Node<T> p, Node<T> n) {
       /**/
    }

    public void addBefore(Node<T> p, Node<T> n) {
        /**/
    }

    public T remove(Node<T> n) {
        /**/
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(
            "List: size = " + size + " [");
        Node<T> current = header.getNext();

        while (current != trailer) {
            builder.append(current.getItem().toString());
            current = current.getNext();
        }
        builder.append("]");

        return builder.toString();
    }
}
