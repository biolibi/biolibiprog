import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.scene.Group;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.QuadCurve;
import javafx.util.Duration;

import java.security.Key;
import java.util.ArrayList;


public class Oiseau extends Group {
    Group oiseau = new Group(oiseau());

    public static Group oiseau(){
        QuadCurve oiseau1 = new QuadCurve(100.0f,150.0f,125.0f,100.0f,150.0f,150.0f);
        QuadCurve oiseau2 = new QuadCurve(100.0f,150.0f,75.0f,100.0f,50.0f,150.0f);
        oiseau1.setStrokeWidth(1);
        oiseau1.setFill(Color.LIGHTGRAY);
        oiseau2.setStrokeWidth(1);
        oiseau2.setFill(Color.LIGHTGRAY);

        oiseau2.setStroke(Color.BLACK);
        oiseau1.setStroke(Color.BLACK);

        KeyValue oiseau1D1 = new KeyValue(oiseau1.startYProperty(),160.0f);
        KeyValue oiseau1D2 = new KeyValue(oiseau1.endYProperty(),130.0f);
        KeyValue oiseau2D1 = new KeyValue(oiseau2.startYProperty(),160.0f);
        KeyValue oiseau2D2 = new KeyValue(oiseau2.endYProperty(),130.0f);

        Timeline timeline = new Timeline();
        timeline.setCycleCount(-1);
        timeline.setAutoReverse(true);
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(1.0),oiseau1D1,oiseau1D2,oiseau2D2,oiseau2D1);
       timeline.getKeyFrames().add(keyFrame);
       timeline.play();
        return new Group(oiseau1,oiseau2);
    }

    public Group getGroupe() {
        return oiseau;
    }
}
