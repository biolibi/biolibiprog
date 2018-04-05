import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class algo {
    public static void main(java.lang.String a[]){
        creationlivre();
        compareto();
    }



    public static void triparannée( int[] objet )
        {
            int N = objet.length;
            if (N == 0)
                return;
            int max = objet[0], min = objet[0];
            for (int i = 1; i < N; i++)
            {
                if (objet[i] > max){
                    max = objet[i];
                }
                if (objet[i] < min){
                    min = objet[i];
                }

            }
            int écart = max - min + 1;

            int[] count = new int[écart];

            for (int i = 0; i < N; i++){
                count[objet[i] - min]++;
            }


            for (int i = 1; i < écart; i++){
                count[i] += count[i - 1];
            }

            int j = 0;

            for (int i = 0; i < écart; i++){
                while (j < count[i])
                    objet[j++] = i + min;
            }

        }
    public static void creationlivre () {
        java.lang.String noir = (char)27 + "[30m";
        java.lang.String brillant = (char)27 + "[1m";
        List<objet> asd = new ArrayList<>();
        asd.add(new objet(1923 , 288321 , "La mort" , "Part 2" , "Olivier Girard" , "Édition Jeunesse"));
        asd.add(new objet(1913 , 291459 , "La vie" , "Part 3" , "Martin Petit" , "Édition de l'Homme "));
        asd.add(new objet(2009 , 311557 , "L'homme qui voulait être heureux" , "18+" , "Auteur inconnu" , "Édition de Mortagne "));
        asd.add(new objet(2001 , 318975 , "Je te salue" , "conversation sur le racisme" , "Natacha Fontaine" , "Édition de Canada jeunesse "));
        asd.add(new objet(1933 , 279673, "Écosociété" , "économiser l'énergie" , "Barack Obama" , "Édition de Je te Salue Marie "));
        asd.add(new objet(2017 , 639064 , "StarCraft" , "Wings of Liberty" , "Denis Béchard" , "Édition de l'Homme "));
        asd.add(new objet(1945 , 537890, "La conquête de l'amérique" , "histoire et religion" , "Donald A. Rey" , "Édition de L'Homme "));
        asd.add(new objet(1988 , 859829, "Dans une galaxie" , "Manier une canne à pêche" , "Dominique M. Alvarado" , "Édition de Mortagne "));
        asd.add(new objet(2001 , 214658, "Sifflement des oiseaux" , "le colibri" , "John T. Brothers" , "Édition de Mortagne "));
        asd.add(new objet(2003 , 211890, "Petite Marguerite" , "La vie durant la guerre au Vietnam" , "Auteur inconnu" , "Édition Je te Salue Marie "));
        int tableauÀtrié[] = new int[10];
        boolean tableauISBN[] = new boolean[10];


        for (int i = 0; i < asd.size();i++){
            tableauÀtrié[i] = asd.get(i).getAnnée();
            tableauISBN[i] = true;
        }
        triparannée(tableauÀtrié);
        System.out.println(brillant+"Classé en fonction de l'année"+ noir);
        for (int i = 0; i < asd.size(); i++){
            for (int n =0 ; n < asd.size();n++){
               if (tableauÀtrié[i] == asd.get(n).getAnnée() && tableauISBN[n] == true  ){
                           System.out.println(asd.get(n));
                           tableauISBN[n] = false;
                           n = asd.size();
                   }
            }
        }
    }

    public static void compareto (){
        java.lang.String noir = (char)27 + "[30m";
        java.lang.String rouge = (char)27 + "[31m";
        java.lang.String bleu = (char)27 + "[34m";
        java.lang.String brillant = (char)27 + "[1m";
        objet[] asd = {new objet(1923 , 288321 , "La mort" , "Part 2" , "Olivier Girard" ,"Édition Jeunesse" ) ,
                new objet(1913 , 291459 , "La vie" , "Part 3" , "Martin Petit" , "Édition de L'Homme") ,
                new objet(2009 , 311557 , "L'homme qui voulait être heureux" , "18+" , "Auteur inconnu" , "Édition de Mortagne") ,
                new objet(2010 , 318975 , "Je te salue" , "conversation sur le racisme" , "Natacha Fontaine" , "Édition de Canada jeunesse"),
                new objet(1933 , 279673 , "Écosociété" , "économiser l'énergie" , "Barack Obama" , "Édition Je te Salue Marie"),
                new objet(2017 , 639064 , "StarCraft" , "Wings of Liberty" , "Denis Béchard" , "Édition de L'Homme"),
                new objet(1945 , 537890 , "La conquête de l'amérique" , "histoire et religion" , "Donald A. Rey" , "Édition de L'Homme"),
                new objet(1988 , 859829 , "Dans une galaxie" , "Manier une canne à pêche" , "Dominique M. Alvarado" , "Édition de Mortagne"),
                new objet(2001 , 214658 , "Sifflement des oiseaux" , "le colibri" , "John T. Brothers" , "Édition de Mortagne"),
                new objet(2003 , 211890 , "Petite Marguerite" , "La vie durant la guerre au Vietnam" , "Auteur inconnu" , "Édition Je te Salue Marie")
        };
        Arrays.sort(asd);
        System.out.println(brillant+"Classé de l'autre facon" + noir);
       System.out.println(Arrays.toString(asd));

    }


    }
