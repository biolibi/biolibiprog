
public class LinkedList<T> {
    protected int  taille = 0;
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
        Node perm = null;
        if (head != null) {
            perm = head.getNext();
            for (int i = 0; i < index; i++) {
                if (perm.getNext() == null)
                        return null;

                perm = perm.getNext();
            }
            return (T)perm.getContenue();
        }
        return (T)perm;


    }

    public boolean remove(int index) {


        if (index < 0 || index > getTaille()){
            return false;
        }

        Node perm = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (perm.getNext() == null) {
                    return false;
                }
                perm = perm.getNext();
            }
            perm.setNext(perm.getNext().getNext());

            taille--;
            return true;

        }
        return false;
    }

    public int clear(){
        taille = 0;
        return taille;
    }

    public int getTaille(){
        int asd = taille;
        return (asd);
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
