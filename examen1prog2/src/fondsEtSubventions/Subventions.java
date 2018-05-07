package fondsEtSubventions;

public class Subventions {
    String code;
    String nomDeLinstance;
    double montant = 0;
    String dateLimite;

    public Subventions(String code, String nomDeLinstance, double montant, String dateLimite) {
        this.code = code;
        this.nomDeLinstance = nomDeLinstance;
        this.montant = montant;
        this.dateLimite = dateLimite;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNomDeLinstance() {
        return nomDeLinstance;
    }

    public void setNomDeLinstance(String nomDeLinstance) {
        this.nomDeLinstance = nomDeLinstance;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(String dateLimite) {
        this.dateLimite = dateLimite;
    }
}
