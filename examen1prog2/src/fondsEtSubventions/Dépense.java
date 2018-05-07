package fondsEtSubventions;

public class Dépense {
    String description;
    String projetDépense;
    double montantPdépense;


    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String  getProjetDépense() {
        return projetDépense;
    }

    public void setProjetDépense(String projetDépense) {
        this.projetDépense = projetDépense;
    }

    public double getMontantPdépense() {
        return montantPdépense;
    }

    public void setMontantPdépense(double montantPdépense) {
        this.montantPdépense = montantPdépense;
    }

    public Dépense(String description, String projetDépense, double montantPdépense) {
        this.description = description;
        this.projetDépense = projetDépense;
        this.montantPdépense = montantPdépense;
    }
}
