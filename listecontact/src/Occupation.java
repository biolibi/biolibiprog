import java.io.Serializable;

public class Occupation implements Serializable {

    String poste = "";
    String entreprise = "";
    String lnameentreprise = "";
    String ladresseentreprise = "";
    String villeentreprise = "";
    String provinceentreprise = "";
    String paysentreprise = "" ;

    public String getVilleentreprise() {
        return villeentreprise;
    }

    public void setVilleentreprise(String villeentreprise) {
        this.villeentreprise = villeentreprise;
    }

    public String getProvinceentreprise() {
        return provinceentreprise;
    }

    public void setProvinceentreprise(String provinceentreprise) {
        this.provinceentreprise = provinceentreprise;
    }

    public String getPaysentreprise() {
        return paysentreprise;
    }

    public void setPaysentreprise(String paysentreprise) {
        this.paysentreprise = paysentreprise;
    }

    public Occupation(String villeentreprise, String provinceentreprise, String paysentreprise) {

        this.villeentreprise = villeentreprise;
        this.provinceentreprise = provinceentreprise;
        this.paysentreprise = paysentreprise;
    }

    public Occupation(String poste, String entreprise, String lnameentreprise, String ladresseentreprise) {
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

