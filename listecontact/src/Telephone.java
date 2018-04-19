import java.io.Serializable;

public class Telephone implements Serializable {
    String numerotelephone;
    String typedenumero;
    java.lang.String noir = (char)27 + "[30m";
    java.lang.String rouge = (char)27 + "[31m";
    java.lang.String bleu = (char)27 + "[34m";

    public Telephone(String typedenumero, String numerotelephone) {
        this.numerotelephone = numerotelephone;
        this.typedenumero = typedenumero;
    }

    int régional = numerotelephone.charAt(0)+numerotelephone.charAt(1)+numerotelephone.charAt(2);

    public String toString() {
        return  rouge+"Type de numéro: " +noir+ typedenumero +bleu+ " Numéro: " +noir+ '('+régional+')' + "\n";
    }
}
