import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import java.net.URL;
import java.util.*;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start (Stage primaryStage) {
        primaryStage.setTitle("ClickerHero");
        Label texte = new Label("Score: ");
        int nombreDeCookie = 1;
        List<Integer> boost = new ArrayList<>();
        boost.add(1);
        List<Integer> prix = new ArrayList<>();
        List<Bâtiment> listDeBatiment = new ArrayList<>();
        creerBatiment(listDeBatiment);
        PrixEnsemble(prix);



        Label clique = new Label(Integer.toString(0));
        Button button = new Button("clicker");
        Button doubleClick = new Button("x2 click : " + prix.get(0));
        Button templeCookie = new Button("TempleUpgrade : " + prix.get(1));
        Button clickAuto = new Button("Click auto " + prix.get(2));
        Button minerCookie = new Button("MinerUpgrade : " + prix.get(3));
        Button usineCookie = new Button("UsineUpgrade : "+ prix.get(4));
        Button reductionUpgrade = new Button("Reduction upgrade : " + prix.get(5));
        ToggleButton musique =  new ToggleButton("Motivation : FREE");

        List<Integer> liste = new ArrayList<>();

        musique.setTranslateX(610);
        musique.setTranslateY(300);
        button.setTranslateX(640);
        button.setTranslateY(360);
        texte.setTranslateX(500);
        clique.setTranslateX(680);
        doubleClick.setTranslateY(80);
        reductionUpgrade.setTranslateY(160);
        clickAuto.setTranslateY(240);
        minerCookie.setTranslateY(320);
        usineCookie.setTranslateY(400);
        templeCookie.setTranslateY(480);
        clique.setScaleY(2);
        texte.setScaleY(2);

        Group root = new Group(texte,clique, button,doubleClick,reductionUpgrade,clickAuto,minerCookie,usineCookie,templeCookie,musique);

        root.setStyle("-fx-background-color: #F0591E;");
        primaryStage.setWidth(1280);
        primaryStage.setHeight(720);
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));


        //TIMER
        timer(listDeBatiment,clique,boost);

        //Clic de souris
        button.setOnAction((event)->{

            liste.add(Augmenter(nombreDeCookie,boost.get(0)));
            Integer tempo = liste.stream().reduce((c, d) ->(c+d)).get();
            Integer resultat = (Integer.parseInt(clique.getText())+tempo);
            clique.setText(resultat.toString());
            liste.clear();
        });
        //DoubleClic
        doubleClick.setOnAction((event) -> {
            if (prix.get(0)<=Integer.parseInt(clique.getText())){
                String resultat = Diminuer(Integer.parseInt(clique.getText()),prix.get(0)).toString();
                clique.setText(resultat);
                prix.set(0,prix.get(0)*2);
               doubleClick.setText("x2 click : " + prix.get(0));
                boost.set(0,(boost.get(0)*2));
                update(doubleClick,reductionUpgrade,clickAuto,minerCookie,usineCookie,templeCookie, prix , clique);
            }
        });
        //reduction
        reductionUpgrade.setOnAction((event) -> {
            if (prix.get(5)<=Integer.parseInt(clique.getText())){
                Integer resultat = (Integer.parseInt(clique.getText())-prix.get(5));
                clique.setText(resultat.toString());
                reduction(prix);
                prix.set(5,Augmenter(prix.get(5),2));
                update(doubleClick,reductionUpgrade,clickAuto,minerCookie,usineCookie,templeCookie, prix , clique);
            }
        });
        //Miner
        minerCookie.setOnAction((event) -> {
            if (prix.get(3)<=Integer.parseInt(clique.getText())){
                clique.setText(Diminuer(Integer.parseInt(clique.getText()),prix.get(3)).toString());
                listDeBatiment.get(0).setNiveau(listDeBatiment.get(0).getNiveau()+1);
                prix.set(3,prix.get(3)*2);
                update(doubleClick,reductionUpgrade,clickAuto,minerCookie,usineCookie,templeCookie, prix , clique);
            }
        });
        //Usine
        usineCookie.setOnAction((event) -> {
            if (prix.get(4)<=Integer.parseInt(clique.getText())){
                clique.setText(Diminuer(Integer.parseInt(clique.getText()),prix.get(4)).toString());
                listDeBatiment.get(1).setNiveau(listDeBatiment.get(1).getNiveau()+1);
                prix.set(4,prix.get(4)*2);
                update(doubleClick,reductionUpgrade,clickAuto,minerCookie,usineCookie,templeCookie, prix , clique);
            }
        });
        //Temple
        templeCookie.setOnAction((event) -> {
            if (prix.get(1)<=Integer.parseInt(clique.getText())){
                clique.setText(Diminuer(Integer.parseInt(clique.getText()),prix.get(1)).toString());
                listDeBatiment.get(2).setNiveau(listDeBatiment.get(2).getNiveau()+1);
                prix.set(1,prix.get(1)*2);
                update(doubleClick,reductionUpgrade,clickAuto,minerCookie,usineCookie,templeCookie, prix , clique);
            }
        });
        //ClickAuto
        clickAuto.setOnAction((event) -> {
            if (prix.get(2)<=Integer.parseInt(clique.getText())){
                clique.setText(Diminuer(Integer.parseInt(clique.getText()),prix.get(2)).toString());
                listDeBatiment.get(3).setNiveau(listDeBatiment.get(3).getNiveau()+1);
                prix.set(2,prix.get(2)*2);
                update(doubleClick,reductionUpgrade,clickAuto,minerCookie,usineCookie,templeCookie, prix , clique);
            }
        });
        //musique
        musique.setOnAction((event) -> {
            musique();
        });


        primaryStage.show();
    };
    public void musique() {
        final URL resource = getClass().getResource("musicDeBiscuit.mp3");
        final javafx.scene.media.Media media = new javafx.scene.media.Media(resource.toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }



    public static Integer Augmenter(Integer nombre,Integer boost){
    nombre = nombre*boost;
    return nombre;}

    public static Integer Diminuer(Integer nombre, Integer diminuer){
        nombre = nombre-diminuer;
        return nombre;}

    public void timer (List<Bâtiment> listDeBatiment , Label clique , List boost){
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {

                    int somme = 0;
                    for (int i =0; i<listDeBatiment.size();i++ )
                        somme = somme+(listDeBatiment.get(i).getNiveau()*2);


                     somme = somme+Integer.parseInt(clique.getText());

                    clique.setText(Integer.toString(somme));
                });
            }
        }, 0, 1000);
    }
    public static void update (Button doubleClick,Button reduction , Button clickAuto, Button miner, Button usine , Button temple , List prix , Label clique) {
        doubleClick.setText("x2 click : " + prix.get(0));
        temple.setText("TempleUpgrade : " + prix.get(1));
        clickAuto.setText("Click auto : " + prix.get(2));
        miner.setText("MinerUpgrade : " + prix.get(3));
        usine.setText("UsineUpgrade : "+ prix.get(4));
        reduction.setText("Reduction upgrade : " + prix.get(5));
        clique.setText(clique.getText());

    }
    public static void creerBatiment (List batiment){
        batiment.add(new Bâtiment("Mine",0));
        batiment.add(new Bâtiment("Usine",0));
        batiment.add(new Bâtiment("Temple",0));
        batiment.add(new Bâtiment("ClickAuto",0));
    }
    public static void reduction (List liste)    {
        for (int i =0; i< (liste.size()-1);i++){
            int tempo = (int)liste.get(0);
            tempo = (int)Math.round(tempo*.95);
            liste.set(i,tempo);
        }
    }
    public static List PrixEnsemble(List liste){
        liste.add(20);
        liste.add(120);
        liste.add(60);
        liste.add(80);
        liste.add(100);
        liste.add(40);

    return liste;}

    }


