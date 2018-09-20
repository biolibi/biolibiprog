import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class Oiseau2 extends Group {



        Group oiseau = new Group(oiseau());

        public static Group oiseau(){
            QuadCurve oiseau1 = new QuadCurve(300.0f,150.0f,325.0f,100.0f,350.0f,150.0f);
            QuadCurve oiseau2 = new QuadCurve(300.0f,150.0f,275.0f,100.0f,250.0f,150.0f);
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
            Translate translate = new Translate();
            translate.setX(-100);
            translate.setY(-40);
            oiseau1.getTransforms().addAll(translate);
            oiseau2.getTransforms().addAll(translate);

            timeline.play();
            return new Group(oiseau1,oiseau2);
        }

        public Group getGroupe() {
            return oiseau;
        }
    }


