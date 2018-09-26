package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.*;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Examen {
    public List<Boolean> question1() {
        /*
        Pondération: 10/70 (~15%) (~25 minutes)
        Pour réussir cette question, vous devez retourner le résultat d'un appel à Collider.getColliderList().
        Collider.getColliderList() prend un seul paramètre, une expression lambda, qui prend elle même deux paramètres:
        un Point et un Cercle. Référez-vous à ces classes pour connaître leur structure.
        Votre expression lambda doit déterminer s'il y a collision entre le point et le cercle qui lui sont passés
        en paramètres.


        Pour trouver s'il y a collision, utilisez pythagore pour calculer la distance entre le centre du cercle et
        le point, et comparez-la avec le rayon du cercle.
         */
        /*

        //comprend pas comment appeler la méthode getcollider

        List<Boolean> resultat = Collider.getColliderList(Collider.ICollider) {

            if (PointsDuCercle.Intersects(PointsDuRectangle))
            {
            //return true si il entre en collision

            }
            else return false;


        }

        */



        return null;

    }

    public String question2(List<String> contenu) {
        List<String> tempo = contenu.stream().filter(((n)->n.contains("password:")) )
                .collect(Collectors.toList());



            String stringconverter = tempo.get(0);
            String stringconverter2 = tempo.get(1);
            String stringconverter3 = tempo.get(2);
            String finale = stringconverter + "\n" +stringconverter2 +"\n" + stringconverter3;

        /*
        Pondération: 10/70 (~15%) (~25 minutes)
        Pour réussir cette question, vous devez utiliser les streams sur la liste passée en paramètre
        pour réaliser les actions suivantes:
         - Ne garder que les String commençant par "password:"
         - Extraire ce qui suit "password:"
         - Retourner une chaîne avec un mot de passe par ligne
         */
        return finale ;
    }

    public List<Integer> question3() {

        /*
        Pondération: 10/70 (~15%) (~25 minutes)
        Pour réussir cette question, vous devez utiliser un Infinite Stream pour trouver les 10 premiers carrés
        parfaits pairs.
        Pour rappel, un carré parfait est un entier dont la racine carrée est aussi un entier.
        Exemple: sqrt(25) == 5, 25 est donc un carré parfait

         */
        List<Integer> liste = IntStream.iterate(1, (n)->n+1).filter((n)->(n == (int)Math.sqrt(n)*Math.sqrt(n))).limit(10).boxed().collect(Collectors.toList());

        return liste;
    }

    public void question4(Stage stage) {
        /*
        Pondération: 15/70 (~20%) (~30 minutes)
        Pour réussir cette question, vous devez simuler le lancer d'un dé à 20 faces.
        Le Stage vous est fourni en paramètre. Vous devez afficher un Label et un Button.
        Lors du clic sur le bouton, le label doit afficher un nombre au hasard entre 1 et 20.
        Le Stage vous est passé tel quel et aucune modification n'a été apportée.
         */
        Label nombreRandom = new Label();
        Button button = new Button("roulez les dés");
        nombreRandom.setTranslateX(200);
        nombreRandom.setTranslateY(200);
        button.setTranslateX(200);
        button.setTranslateY(50);
        Random random = new Random();

        Group root = new Group(nombreRandom,button);
        stage.setScene(new Scene(root));
        button.setOnAction((event)->{
            Integer nombre;
            nombre = (random.nextInt(20)+1);
          nombreRandom.setText(nombre.toString());

        });
        stage.show();
    }

    public void question5(Stage stage) {
        Group root = new Group(cercle(),rectangle(),rectangle2(),rectangle3(),triangle(),rayon(),fenetre(),tube(),chemine(),groupe());
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setScene(new Scene(root));
        stage.show();

        /*
        Pondération: 25/70 (~35%) (~60 minutes)
        Pour réussir cette question, vous devez recréer le dessin que vous trouverez dans le fichier
        "question5_resultat.gif" dans le Stage qui vous est fourni en paramètre.
        Voici une liste des couleurs utilisées:
         - BLACK
         - GREY
         - DARKRED
         - DARKCYAN
         - DARKBLUE
         - DARKGREEN
         - DARKORANGE
         - DARKMAGENTA
         - DARKOLIVEGREEN
         */


    }
    private static Rectangle rectangle(){
        Rectangle rectangle = new Rectangle(180,120,100,50);
        DropShadow ds = new DropShadow(20,-10,10, Color.BLACK);
        rectangle.setEffect(ds);
        rectangle.setFill(Color.BLUE);
        return rectangle;

    }
    private static Rectangle rectangle2(){
        Rectangle rectangle = new Rectangle(130,70,50,100);
        DropShadow ds = new DropShadow(20,-10,10, Color.BLACK);
        rectangle.setEffect(ds);
        rectangle.setFill(Color.DARKRED);
        return rectangle;

    }
    private static Rectangle rectangle3(){
        Rectangle rectangle = new Rectangle(130,170,150,30);
        DropShadow ds = new DropShadow(20,-10,10, Color.BLACK);
        rectangle.setEffect(ds);
        rectangle.setFill(Color.BLACK);
        return rectangle;

    }
    private static Polygon triangle(){
        Double[] points = {280.0,170.0,280.0,200.0,340.0,200.0};
        Polygon triangle = new Polygon();

            triangle.getPoints().addAll(points);
            triangle.setFill(Color.PURPLE);

        return triangle;
    }
    private static Circle cercle(){
        Circle cercle = new Circle(280,150,25);
        cercle.setFill(Color.GREEN);
        return cercle;
    }
    public static Group rayon (){
        ArrayList<Line> liste = new ArrayList();
        liste.add(new Line(10,130,60,130));
        liste.add(new Line(10,150,60,150));
        liste.add(new Line(10,170,55,170));
        for (int i =0 ; i< liste.size();i++)
            liste.get(i).setStroke(Color.BLACK);
        Group effect = new Group(liste.get(0),liste.get(1),liste.get(2));
        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(1),effect);
        rotateTransition.setByAngle(10);
        rotateTransition.setCycleCount(-1);
        rotateTransition.setAutoReverse(true);
        rotateTransition.play();
        Group finale = new Group(effect);
        return new Group(finale);

    }
    private static Rectangle fenetre(){
        Rectangle rectangle = new Rectangle(140,90,30,20);
        Stop[] stops = new Stop[]{
                new Stop(0, Color.WHITE),
                new Stop(1, Color.TEAL),};
        LinearGradient gradient = new LinearGradient(

                0,0,
                1,1,
                true,
                CycleMethod.NO_CYCLE,stops
        );
        rectangle.setFill(gradient);

        return rectangle;
    }

    private static Rectangle chemine (){
        Rectangle rectangle = new Rectangle(230,70,30,50);
        rectangle.setFill(Color.GREEN);
        return rectangle;

    }
    private static Polygon tube(){
        Double[] points = {215.0,60.0,275.0,60.0,230.0,90.0,260.0,90.0};
        Polygon tube = new Polygon();

        tube.getPoints().addAll(points);
        tube.setFill(Color.ORANGE);

        return tube;
    }

    private static Group groupe(){
        Circle cercle = new Circle(160,210,20);
        Circle cercle2 = new Circle(190,210,20);
        Circle cercle3 = new Circle(230,210,20);
        Circle cercle4 = new Circle(250,210,20);
        cercle.setFill(Color.BLACK);
        cercle.setStroke(Color.GREY);
        cercle2.setFill(Color.BLACK);
        cercle2.setStroke(Color.GREY);
        cercle3.setFill(Color.BLACK);
        cercle3.setStroke(Color.GREY);
        cercle4.setFill(Color.BLACK);
        cercle4.setStroke(Color.GREY);
        cercle.setStrokeWidth(4);
        cercle2.setStrokeWidth(4);
        cercle3.setStrokeWidth(4);
        cercle4.setStrokeWidth(4);

        KeyValue a4 = new KeyValue(cercle.centerYProperty(),220.0f);
        KeyValue a2 = new KeyValue(cercle2.centerYProperty(),220.0f);
        KeyValue a1 = new KeyValue(cercle3.centerYProperty(),220.0f);
        KeyValue a3 = new KeyValue(cercle4.centerYProperty(),220.0f);
        Timeline timeline = new Timeline();
        timeline.setCycleCount(-1);
        timeline.setAutoReverse(true);
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(1.0),a4,a2,a1,a3);
        timeline.getKeyFrames().add(keyFrame);
        Translate translate = new Translate();
        translate.setX(-100);
        translate.setY(-40);
        timeline.play();
        return new Group(cercle,cercle2,cercle3,cercle4);
    }










}