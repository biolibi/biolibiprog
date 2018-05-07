import java.io.*;
import java.util.*;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc1 = new Scanner(System.in);
        int choix = 0;
        int choix2 = 0;
        String  fichier;
        boolean erreurFichier = false;


        try {
            while (erreurFichier == false){
            System.out.println("Quel est le nom du fichier?");
            fichier = sc1.next();
            File f = new File(fichier);
            if (f.exists()){
                erreurFichier = true;
            Scanner sc = new Scanner(f);

            List<DonneObjet> personne = new ArrayList<>();

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] details = line.split(":");
                String nom = details[0];
                String password = details[1];
                String identifiant = details[2];
                String identifiantgroupe = details[3];
                String informationSUp = details[4];
                String cheminDossier = details[5];
                String cheminprogramme = details[6];

                DonneObjet p = new DonneObjet(nom, password, identifiant , identifiantgroupe , informationSUp , cheminDossier , cheminprogramme);
                personne.add(p);
            }
           Collections.sort(personne);

            while (choix2 != 2){

           System.out.println("Menu");
            System.out.println("1) afficher les contacts");
           System.out.println("Autres nombres pour quitter");
           choix2 = unNombre(sc1);
           if (choix2 == 1){
            System.out.println("Quel utlisateur voulez-vous regarder?");
               for (int i = 0; i < personne.size();i++ ) {
                   System.out.println(i+") " + personne.get(i).getUtilisateurIdentifiant());
               }
            try {
           System.out.println( personne.get(unNombre(sc1)).toString()); }catch (IndexOutOfBoundsException e)
            {
                System.out.println("Le fichier n'a pas le bon format (7 éléments séparé de : entre chaque élément");
                System.out.println("Le programme va quitter (redémarrer pour essayer un fichier valide");
                System.exit(0);
            } }}

            if (choix != 1){

                System.out.println("Voulez-vous sauvegarder? (Vous allez écrasez la dernière sauvegarde)");
                System.out.println("1) oui");
                System.out.println("2) non");
                choix = unNombre(sc1);
                if (choix == 1);{
                    try{
                        PrintWriter writer = new PrintWriter(fichier);
                        writer.close();
                    }   catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
            }

        } } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static int unNombre(Scanner sc){
        while (!sc.hasNextInt()){
            System.out.println(sc.next() + " n'est pas un nombre valide. Réessayer");
        }
        return sc.nextInt();
    }
    }


