package projets;

public class Projets {
    String nomDeCode;
    String dateDéchéance;
    double budget;
    String statut;

    public String getNomDeCode() {
        return nomDeCode;
    }

    public void setNomDeCode(String nomDeCode) {
        this.nomDeCode = nomDeCode;
    }

    public String getDateDéchéance() {
        return dateDéchéance;
    }

    public void setDateDéchéance(String dateDéchéance) {
        this.dateDéchéance = dateDéchéance;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Projets(String nomDeCode, String dateDéchéance, double budget, String statut) {
        this.nomDeCode = nomDeCode;
        this.dateDéchéance = dateDéchéance;
        this.budget = budget;
        this.statut = statut;
    }
}
