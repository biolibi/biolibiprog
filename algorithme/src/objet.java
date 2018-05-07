import java.util.Collection;
import java.util.Collections;

public class objet implements Comparable<objet> {
    int année;
    int ISBN;
    String titre = "";
    String sousTitre = "";
    String auteur = "";
    String maisonEdition = "";
    java.lang.String noir = (char)27 + "[30m";
    java.lang.String rouge = (char)27 + "[31m";
    java.lang.String bleu = (char)27 + "[34m";
    java.lang.String brillant = (char)27 + "[1m";
    java.lang.String teal = (char)27 + "[36m";

    public objet(int année, int ISBN, String titre, String sousTitre, String auteur, String maisonEdition) {
       this.année = année;
       this.ISBN = ISBN;
       this.titre = titre;
       this.sousTitre = sousTitre;
       this.auteur = auteur;
       this.maisonEdition = maisonEdition;
    }
    public String toString() {
        return brillant+année + " " +teal+ " Maison d'édition: "+bleu+maisonEdition + " " +teal +" Titre: "+rouge+ titre + " " +teal+" Sous-titre : "+bleu +sousTitre + " " +teal+" Auteur: "+rouge+ auteur + " " +teal+" ISBN: "+bleu +ISBN + noir+"\n";

    }

    public int getAnnée() {
        return année;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }


    public String getMaisonEdition() {
        return maisonEdition;
    }


    public int compareTo(objet o) {
        int c = (this.getMaisonEdition().compareTo(o.getMaisonEdition()));
        if (c == 0){
            c = getAuteur().compareTo(o.getAuteur());
            if (c == 0){
                c = getTitre().compareTo(o.getTitre());

            }
        }
        return c;
    }
}
