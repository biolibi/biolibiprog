
public class DonneObjet implements Comparable<DonneObjet> {
    private String nom;
    private String motDePasse;
    private String utilisateurIdentifiant;
    private String indentifiantDeGroupe;
    private String informationSupp;
    private String cheminDossier;
    private String cheminProgramme;
    java.lang.String noir = (char)27 + "[30m";
    java.lang.String rouge = (char)27 + "[31m";
    java.lang.String bleu = (char)27 + "[34m";


    public DonneObjet (String nom , String motDePasse , String indentifiantDeGroupe ,String utilisateurIdentifiant , String informationSupp , String cheminDossier , String  cheminProgramme){
        this.nom = nom;
        this.motDePasse = motDePasse;
        this.indentifiantDeGroupe = indentifiantDeGroupe;
        this.utilisateurIdentifiant = utilisateurIdentifiant;
        this.informationSupp = informationSupp;
        this.cheminDossier = cheminDossier;
        this.cheminProgramme = cheminProgramme;
    }


    public int compareTo(DonneObjet o) {
       return utilisateurIdentifiant.compareTo(o.utilisateurIdentifiant);
    }



    public String getUtilisateurIdentifiant() {
        return utilisateurIdentifiant;
    }


    @Override
    public String toString() {
        return rouge+"Nom de l'utilisateur: " +nom +bleu + " Mot de passe: " +motDePasse+ rouge+ " Identifiant de l'utilisateur: " +utilisateurIdentifiant+bleu + " Idenfiant du groupe: " +indentifiantDeGroupe+ rouge+ " Information Supplémentaire: "+informationSupp+ bleu+ " Chemin vers dossier personnel: " +cheminDossier+ rouge+" Chemin vers le programme de ligne de commande: "+cheminProgramme + noir;
    }
}

