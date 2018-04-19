import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




public class ContactObject implements Serializable{
    java.lang.String noir = (char)27 + "[30m";
    java.lang.String rouge = (char)27 + "[31m";
    java.lang.String bleu = (char)27 + "[34m";


    private String nom = "";
    private String prénom = "";
    Adresse ad1= new Adresse(0,"","","","","") ;
    Occupation oc1 = new Occupation("","","","") ;
    List<Telephone>  li1 = new ArrayList<>();

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

    public Adresse getAd1() {
        return ad1;
    }

    public void setAd1(Adresse ad1) {
            this.ad1 = ad1;

    }

    public Occupation getOc1() {
        return oc1;
    }

    public void setOc1(Occupation oc1) {
        this.oc1 = oc1;
    }

    public List<Telephone> getLi1() {
        return li1;
    }

    public void setLi1(List<Telephone> li1) {
        this.li1 = li1;
    }

    public String toString() {
        return  rouge+"Nom: " +noir+ nom +bleu+ " Prénom: " +noir+ prénom + rouge +li1 + noir + "\n";
    }
}
