import Centre.CentreDeTri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
{
 simulation();
}
    public static void simulation(){
        CentreDeTri[] centreDeTris = new CentreDeTri[2];
        int choix = 0;
        Scanner sc = new Scanner(System.in);

        while (choix != 1 && choix != 2 ){
            System.out.println("1) simulation");
            System.out.println("2) quitter");
            choix = unNombre(sc);
        }

       if (choix == 1){
           System.out.println("Il y aura " + centreDeTris.length + " centre de tri pendant la simulation" );




       }
    }

    public static int unNombre(Scanner sc){
        while (!sc.hasNextInt()){
            System.out.println(sc.next() + " n'est pas un nombre valide. Réessayer");
        }
        return sc.nextInt();
    }

  }

