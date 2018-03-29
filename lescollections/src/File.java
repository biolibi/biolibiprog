public class File<T> {
    LinkedList file = new LinkedList();

    public void add(T contenue){
        file.add(contenue);
    }

    public T remove (){
        T tempo = (T) file.get(file.getTaille());
        file.remove(0);
        return tempo;
    }

    public T peek (){
        return (T)file.get(0);
    }

    public int clear(){
        return file.clear();
    }

    public int taille (){
        return file.getTaille();
    }



}
