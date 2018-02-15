package Personnage;
import Armes.Baguette;
import Armes.Contondant;
import Armes.Masse;


import java.util.Scanner;

public class Barbare extends Guerrier  {

    public Barbare(){
        this.force = 10;
        this.defense = 3;
        this.pointdevie = 100;
        this.nom = "Barbare";
        this.attaque = true;
    }

    public  void attaque (character personnageAttaque){
        personnageAttaque.setPointdevie(personnageAttaque.getPointdevie()-((2*(force+weapon))-personnageAttaque.getDefense()));
        System.out.println("Le barbare attaque");
        System.out.println("Il reste " + personnageAttaque.getPointdevie() + " point de vie"+ " à " + personnageAttaque.getNom());
        if (personnageAttaque.getPointdevie() < 1){
            personnageAttaque.attaque = true;
        }
    }



}
