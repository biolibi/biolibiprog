package employés;

public class Employés {
   protected String nom , numeroDemployé;
   protected double annéesExpérience , SalaireAnnuel;
   protected String  projetAssigné;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroDemployé() {
        return numeroDemployé;
    }

    public void setNumeroDemployé(String numeroDemployé) {
        this.numeroDemployé = numeroDemployé;
    }

    public double getAnnéesExpérience() {
        return annéesExpérience;
    }

    public void setAnnéesExpérience(double annéesExpérience) {
        this.annéesExpérience = annéesExpérience;
    }

    public double getSalaireAnnuel() {
        return SalaireAnnuel;
    }

    public void setSalaireAnnuel(double salaireAnnuel) {
        SalaireAnnuel = salaireAnnuel;
    }

    public String getProjetAssigné() {
        return projetAssigné;
    }

    public void setProjetAssigné(String projetAssigné) {
        this.projetAssigné = projetAssigné;
    }
}
