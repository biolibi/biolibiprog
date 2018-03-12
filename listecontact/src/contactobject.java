import java.util.ArrayList;
import java.util.List;




public class contactobject{
    java.lang.String noir = (char)27 + "[30m";
    java.lang.String rouge = (char)27 + "[31m";
    java.lang.String bleu = (char)27 + "[34m";


    String nom = "";
    String prénom = "";
    adresse ad1= new adresse (0,"","","","","") ;
    occupation oc1 = new occupation("","","","") ;
    List<telephone>  li1 = new ArrayList<>();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom != ""){
            this.nom = nom;
        }
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        if (prénom != ""){
            this.prénom = prénom;
        }
    }

    public adresse getAd1() {
        return ad1;
    }

    public void setAd1(adresse ad1) {
            this.ad1 = ad1;

    }

    public occupation getOc1() {
        return oc1;
    }

    public void setOc1(occupation oc1) {
        this.oc1 = oc1;
    }

    public List<telephone> getLi1() {
        return li1;
    }

    public void setLi1(List<telephone> li1) {
        this.li1 = li1;
    }

    public String toString() {
        return  rouge+"Nom: " +noir+ nom +bleu+ " Prénom: " +noir+ prénom + rouge +li1 + noir + "\n";
    }
}
