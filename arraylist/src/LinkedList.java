import java.util.List;

public class LinkedList<T> {
    int  taille = 0;
    Node<T> head = null;


    public void add(int index, T contenue) {
        Node Perm = head;
        Node Tempo = new Node(contenue);

        if (Perm != null) {
            for (int i = 0; Perm.getNext() != null && i < index; i++) {
                Perm = Perm.getNext();
            }
        }
        Tempo.setNext(Perm.getNext());
        Perm.setNext(Tempo);
        taille++;
    }

    public T get(int index) {

        if (index < 0){
            return null;
        }
        Node Perm = null;
        if (head != null) {
           Perm = head.getNext();
            for (int i = 0; i < index; i++) {
                if (Perm.getNext() == null)
                    return null;

                Perm = Perm.getNext();
            }
            return (T)Perm.getContenue();
        }
        return (T)Perm;
    }

    public boolean remove(int index) {

        if (index < 1 || index > taille){
            return false;
        }
        Node Perm = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (Perm.getNext() == null){
                    return false;
                }
                Perm = Perm.getNext();
            }
            Perm.setNext(Perm.getNext().getNext());
            taille--;
            return true;
        }
        return false;
    }

    public void clear(){
        taille = 0;
    }
    public int getTaille(){
        return (taille);
    }

    public void set(int index, T contenue){
        remove(index);
        add(index ,contenue);
        taille--;
    }

    public void add(T contenue) {

        if (head == null) {
            head = new Node(contenue);
        }

        Node Tempo = new Node(contenue);
        Node Perm = head;

        if (Perm != null) {
            while (Perm.getNext() != null) {
                Perm = Perm.getNext();
            }
            Perm.setNext(Tempo);
        }
        taille++;
    }














}
