public class File<T> {
    LinkedList file = new LinkedList();

    public void add(T contenue){
        file.add(contenue);
    }

    public T remove (T contenue){
        T tempo = (T) file.get(file.getTaille());
        file.remove(0);
        return tempo;
    }

    public T peek (){
        return (T)file.get(0);
    }

    public void clear(){
        file.taille = 0;
    }

    public int taille (){
        return file.getTaille();
    }



}
