import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Vaisseau {

    int  Carburant = 500;
    int PointDeVie = 100;
    String PlaneteActuel = "Terre";
    String RevenirEnArrière;
    ArrayList<Vaisseau> retour = new ArrayList<>();
    ArrayList trajet = new ArrayList<>();
    public Vaisseau (){
       this.Carburant = getCarburant();
       this.PointDeVie = getPointDeVie();
       this.Inventaire = getInventaire();
       this.PlaneteActuel = getPlaneteActuel();
       this.trajet = getTrajet();
    }

    public ArrayList<Planete> getTrajet() {
        return trajet;
    }

    public void setTrajet(ArrayList<Planete> trajet) {
        this.trajet = trajet;
    }

    public ArrayList getInventaire() {
        return Inventaire;
    }

    public String getPlaneteActuel() {
        return PlaneteActuel;
    }

    public void setPlaneteActuel(String planeteActuel) {
        PlaneteActuel = planeteActuel;
    }

    public String getRevenirEnArrière() {
        return RevenirEnArrière;
    }

    public void setRevenirEnArrière(String revenirEnArrière) {
        RevenirEnArrière = revenirEnArrière;
    }

    public int getCarburant() {
        return Carburant;
    }

    public void setCarburant(int carburant) {
        Carburant = carburant;
    }

    public int getPointDeVie() {
        return PointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        PointDeVie = pointDeVie;
    }

    ArrayList Inventaire = new ArrayList();

}
