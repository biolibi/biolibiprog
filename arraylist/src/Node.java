public class Node<T> {

    T contenue;
    Node<T> next;


    public Node(T contenue) {
        this.contenue = contenue;
    }

    public T getContenue() {
        return contenue;
    }

    public void setContenue(T contenue) {
        this.contenue = contenue;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
