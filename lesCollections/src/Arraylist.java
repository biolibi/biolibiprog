

public class Arraylist<T>{

    int index = 0 ,  taille = 0 , objectDansLeTableau = 0;

         T[] tableauArraylist =(T[]) new Object[100];

         public void add(T obj){
             if (tableauArraylist.length <= objectDansLeTableau ){
                 taille = taille*2;
                T[] tableau = (T[]) new Object[(taille)];
                for (int i =0; i <= tableauArraylist.length;i++){
                    tableau[i] = tableauArraylist[i];
                }
                tableauArraylist = tableau;
             }
             tableauArraylist[objectDansLeTableau] = obj;
             objectDansLeTableau++;
         }

         public void clear() {
             objectDansLeTableau = 0;
             taille = 0;
         }

         public void remove(int index){
             tableauArraylist[index] = null;
             for (int i = index ; i < tableauArraylist.length-1; i++){
                 tableauArraylist[i] = tableauArraylist[i+1];
             }
             objectDansLeTableau = objectDansLeTableau-1;
         }

         public T get(int index){
             return tableauArraylist[index];
         }

         public void set(int index,T obj){
             tableauArraylist[index] = obj;
         }

         public void add(int index , T obj){
             if (tableauArraylist.length <= objectDansLeTableau ){
                 taille = taille*2;
                 T[] tableau = (T[]) new Object[taille];
                 for (int i =0; i <= tableauArraylist.length;i++){
                     tableau[i] = tableauArraylist[i];
                 }
                 tableauArraylist = tableau;
             }
             tableauArraylist[objectDansLeTableau] = obj;
             objectDansLeTableau++;
         }

         public int size(){
             return objectDansLeTableau;
         }
















}
