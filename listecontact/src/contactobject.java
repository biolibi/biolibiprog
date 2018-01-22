public class contactobject {


    String nom = "";
    String prénom = "";


public static class adresse {
int portenumero = 0  ;
String rue = "";
String appartement = "";
String ville = "";
String Province = "";
String pays = "";

    public adresse(int portenumero, String rue, String appartement, String ville, String province, String pays) {
        this.portenumero = portenumero;
        this.rue = rue;
        this.appartement = appartement;
        this.ville = ville;
        Province = province;
        this.pays = pays;
    }

    public int getPortenumero() {
        return portenumero;
    }

    public void setPortenumero(int portenumero) {
        this.portenumero = portenumero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getAppartement() {
        return appartement;
    }

    public void setAppartement(String appartement) {
        this.appartement = appartement;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
public static class occupation {
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
public static class numero {

}












}
