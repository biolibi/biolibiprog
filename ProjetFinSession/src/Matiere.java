

public abstract class Matiere {
    private  String nom;
    private String masseVolumique;
    private int pourcentage;

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMasseVolumique() {
        return masseVolumique;
    }

    public void setMasseVolumique(String masseVolumique) {
        this.masseVolumique = masseVolumique;
    }


}
