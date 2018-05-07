package employés;

public class Superviseurs extends Employés {
    Chercheurs[] listeDeChercheur = new Chercheurs[100];
    int position = 0;

    public void ajouterChercheur (Chercheurs _listeDeChercheur) {
        this.listeDeChercheur [this.position] = _listeDeChercheur;
        this.position++;
    }
    public Superviseurs(String nom, String numeroDemployé, double annéesExpérience, double salaireAnnuel, String projetAssigné ) {
        this.nom = nom;
        this.numeroDemployé = numeroDemployé;
        this.annéesExpérience = annéesExpérience;
        SalaireAnnuel = salaireAnnuel;
        this.projetAssigné = projetAssigné;
    }
}
