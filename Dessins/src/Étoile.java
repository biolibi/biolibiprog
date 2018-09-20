import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;

import java.util.ArrayList;

public class Étoile extends Group {

    Group étoile = new Group(étoile().get(0),étoile().get(1),étoile().get(2),étoile().get(3));

    public static ArrayList<Polygon> étoile(){
        ArrayList<Polygon> liste = new ArrayList<>();
        Double[] points = {205.0,150.0, 217.0,186.0,
                259.0,186.0, 223.0,204.0,
                233.0,245.0, 205.0,212.0,
                177.0,245.0, 187.0,204.0,
                151.0,186.0, 193.0,186.0};
        Polygon étoile = new Polygon();
        Polygon étoile2 = new Polygon() ;
        Polygon étoile3 = new Polygon() ;
        Polygon étoile4 =  new Polygon();
        liste.add(étoile);liste.add(étoile2);liste.add(étoile3);liste.add(étoile4);
        for (int i =0;i<liste.size();i++){
            liste.get(i).getPoints().addAll(points);
            liste.get(i).setFill(Color.YELLOW);
            liste.get(i).setScaleY(0.3);
            liste.get(i).setScaleX(0.3);
        }
        liste.get(0).setTranslateX(240);
        liste.get(0).setTranslateY(-140);
        liste.get(1).setTranslateX(300);
        liste.get(1).setTranslateY(-140);
        liste.get(2).setTranslateX(260);
        liste.get(2).setTranslateY(-80);
        liste.get(3).setTranslateX(380);
        liste.get(3).setTranslateY(-170);

        for (int i =0;i<liste.size();i++){
           FadeTransition fade = new FadeTransition(Duration.seconds(i+3)
                    , liste.get(i));
            fade.setFromValue(1.0);
            fade.setToValue(0);
            fade.setCycleCount(Timeline.INDEFINITE);
            fade.setAutoReverse(true);
            fade.play();

        }
        return liste ;
    }
    public Group getGroupe() {
        return étoile;
    }

}
