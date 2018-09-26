import javafx.animation.FillTransition;
import javafx.animation.RotateTransition;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

import java.util.ArrayList;

public class Soleil extends Group {

    public static Group groupe() {
        Group soleil = new Group(rayon());
        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(2),soleil);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(-1);
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();
        Circle soleil2 = new Circle(320,60,48);
        soleil2.setFill(Color.LIGHTGRAY);
        Group finale = new Group(soleil,soleil2,soleil());
        return new Group(finale);
    }

    public static Group soleil(){
        Circle soleil = new Circle(320,60,40);
        soleil.setFill(Color.YELLOW);
        FillTransition fillTransition = new FillTransition(Duration.seconds(3),soleil);
        fillTransition.setCycleCount(-1);
        fillTransition.setToValue(Color.DARKORANGE);
        fillTransition.setAutoReverse(true);

        fillTransition.play();
        return new Group(soleil);
    }

    public static Group rayon (){
        ArrayList<Line> liste = new ArrayList();
        liste.add(new Line(260,60,380,60));
        liste.add(new Line(320,0,320,120));
        liste.add(new Line(270,10,370,110));
        liste.add(new Line(270,110,370,10));
        for (int i =0 ; i< liste.size();i++)
        liste.get(i).setStroke(Color.YELLOW);

        return new Group(liste.get(0),liste.get(1),liste.get(2),liste.get(3));
    }
    public Group getGroupe() {
        return groupe();
    }

}
