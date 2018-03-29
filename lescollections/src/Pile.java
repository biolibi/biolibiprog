public class Pile<T> {
    LinkedList<T> pile = new LinkedList<>();


    public void push(T contenue){
        pile.add(contenue);

    }

    public T pop(){
        T tempo = (T) pile.get(pile.getTaille()-1);
        pile.remove((pile.getTaille()-1));
        return tempo;
    }

    public T peek (){
       return pile.get((pile.getTaille()-1));
    }

    public int size (){
      return  pile.getTaille();
    }

    public int clear (){
       return pile.clear();
    }
}
