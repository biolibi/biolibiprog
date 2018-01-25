public class occupation {

    String poste = "";
    String entreprise = "";
    String lnameentreprise = "";
    String ladresseentreprise = "";

    public occupation(String poste, String entreprise, String lnameentreprise, String ladresseentreprise) {
        this.poste = poste;
        this.entreprise = entreprise;
        this.lnameentreprise = lnameentreprise;
        this.ladresseentreprise = ladresseentreprise;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public String getLnameentreprise() {
        return lnameentreprise;
    }

    public void setLnameentreprise(String lnameentreprise) {
        this.lnameentreprise = lnameentreprise;
    }

    public String getLadresseentreprise() {
        return ladresseentreprise;
    }

    public void setLadresseentreprise(String ladresseentreprise) {
        this.ladresseentreprise = ladresseentreprise;
    }
}

