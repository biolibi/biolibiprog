public class Pile<T> {
    LinkedList pile = new LinkedList();

    public void push(T contenue){
        pile.add(contenue);
    }

    public T pop(){
        T tempo = (T) pile.get(pile.getTaille());
        pile.remove((pile.getTaille()));
        return tempo;
    }

    public void peek (){
        pile.get((pile.getTaille()));
    }

    public void size (){
        pile.getTaille();
    }

    public void clear (){
        pile.taille = 0;
    }
}
