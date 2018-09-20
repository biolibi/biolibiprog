import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.util.Duration;


public class Main extends Application {
    public static void main(String[] args) {

        launch(args);
    }



    public void start (Stage primaryStage) {
        primaryStage.setTitle("Dessins");
        primaryStage.setWidth(800);
        primaryStage.setHeight(400);
        primaryStage.setResizable(false);
        Circle lune = new Circle(720,60,40);
        Rectangle rectangleJour = new Rectangle(0,0,200,400);
        rectangleJour.setStrokeWidth(400);
        rectangleJour.setStroke(Color.LIGHTGRAY);
        Rectangle rectangleNuit = new Rectangle(400,0,400,400);
        Text jour = new Text(170,300,"Jour");
        Text nuit = new Text(570,300,"Nuit");
        jour.setFont(new Font("Times New Roman",40));
        nuit.setFont(new Font("Times New Roman",40));
        nuit.setFill(Color.WHITE);
        lune(lune);

        Maison maison = new Maison();
        Maison maisonNuit = new Maison();
        Étoile étoile = new Étoile();
        Neigle oiseau = new Neigle();
        Oiseau2 oiseau2 = new Oiseau2();
        oiseau2.getTransforms();
        oiseau2.setTranslateX(200);
        Soleil soleil = new Soleil();


        maisonNuit.getGroupe().setTranslateX(410);


        Group root = new Group(rectangleJour,rectangleNuit,jour,nuit,soleil.getGroupe(),lune,soleil,maison.getGroupe(), maisonNuit.getGroupe(),oiseau.getGroupe(),oiseau2.getGroupe(),étoile.getGroupe());
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public static Shape lune (Shape lune){
        Stop[] stops = new Stop[]{
                new Stop(0, Color.WHITE),
            new Stop(1, Color.BLACK),};
        LinearGradient gradient = new LinearGradient(

                0,0,
                1,1,
                true,
                CycleMethod.NO_CYCLE,stops
        );
        lune.setFill(gradient);


    return lune;}




}
