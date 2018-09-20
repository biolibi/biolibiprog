import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class test extends Application {
    @Override
    public void start(Stage stage) {
        //Drawing Rectangle1
        Rectangle rectangle1 = new Rectangle(150, 75, 200, 150);
        rectangle1.setFill(Color.BLUE);
        rectangle1.setStroke(Color.BLACK);

        //Drawing Rectangle2
        Rectangle rectangle2 = new Rectangle(150, 75, 200, 150);

        //Setting the color of the rectangle
        rectangle2.setFill(Color.BURLYWOOD);

        //Setting the stroke color of the rectangle
        rectangle2.setStroke(Color.BLACK);

        //creating the rotation transformation
        Rotate rotate = new Rotate();

        //Setting the angle for the rotation
        rotate.setAngle(90);

        //Setting pivot points for the rotation
        rotate.setPivotX(150);
        rotate.setPivotY(225);
        Timeline timeline = new Timeline();
        timeline.setCycleCount(-1);
        timeline.setAutoReverse(true);
        KeyValue rotate2 = new KeyValue(rotate.pivotXProperty(),10);
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(1.0),rotate2);
        timeline.getKeyFrames().add(keyFrame);
        timeline.play();

        //Adding the transformation to rectangle2
        rectangle2.getTransforms().addAll(rotate);

        //Creating a Group object
        Group root = new Group(rectangle1, rectangle2);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        //Setting title to the Stage
        stage.setTitle("Rotation transformation example");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}