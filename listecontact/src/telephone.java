public class telephone {
    String numerotelephone;
    String typedenumero;
    java.lang.String noir = (char)27 + "[30m";
    java.lang.String rouge = (char)27 + "[31m";
    java.lang.String bleu = (char)27 + "[34m";

    public telephone(String typedenumero, String numerotelephone) {
        this.numerotelephone = numerotelephone;
        this.typedenumero = typedenumero;
    }

    @Override
    public String toString() {
        return  rouge+"Type de numéro: " +noir+ typedenumero +bleu+ " Numéro: " +noir+ numerotelephone + "\n";
    }
}
