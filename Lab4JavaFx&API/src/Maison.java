import javafx.scene.Group;
import javafx.scene.effect.DropShadow;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;

public class Maison extends Group {



    Group groupe=new Group(rectangle(),polygon(),porte(),window(),barreauH(),poigner(),barreauV(),barreauV2(),barreauV3(),barreauH2(),barreauH3());


        public static Polygon polygon () {

            Double[] points = {200.0,140.0,140.0,200.0,260.0,200.0};
            Polygon toit = new Polygon();
            toit.getPoints().addAll(points);
            toit.setFill(Color.BROWN);
           return toit;
        }
        public static Rectangle rectangle(){
            Rectangle rectangle = new Rectangle(150,200,100,50);
            DropShadow ds = new DropShadow(20,-10,10, Color.GRAY);
            rectangle.setEffect(ds);
            rectangle.setFill(Color.BEIGE);
            return rectangle;
        }
        public static Rectangle porte(){
            Rectangle porte = new Rectangle(180, 220,20,30);
        porte.setFill(Color.SADDLEBROWN);
        return porte;
    }
        public static Circle poigner (){
            Circle poigner = new Circle(195,235,3.0);
            poigner.setFill(Color.LIGHTGREEN);
            return poigner;
        }
        public static Rectangle window (){
            Rectangle window = new Rectangle(210,210,30,25);
            window.setFill(Color.CYAN);
            return window;
        }
        public static Rectangle barreauH(){
            Rectangle barreauH = new Rectangle(210,210,2,24);
            barreauH.setFill(Color.GRAY);
            return barreauH;
        }
        public static Rectangle barreauV()
     {
       Rectangle barreauV = new Rectangle(210,210,30,2);
       barreauV.setFill(Color.GRAY);

       return barreauV;
     }
    public static Rectangle barreauH2()
    {
        Rectangle barreauV = new Rectangle(210,222,30,2);
        barreauV.setFill(Color.GRAY);
        return barreauV;
    }
    public static Rectangle barreauH3()
    {
        Rectangle barreauV = new Rectangle(210,233,30,2);
        barreauV.setFill(Color.GRAY);
        return barreauV;
    }
    public static Rectangle barreauV2()
    {
        Rectangle barreauH = new Rectangle(225,210,2,24);
        barreauH.setFill(Color.GRAY);
        return barreauH;
    }
    public static Rectangle barreauV3()
    {
        Rectangle barreauH = new Rectangle(239,210,2,24);
        barreauH.setFill(Color.GRAY);
        return barreauH;
    }



    public Group getGroupe() {
        return groupe;
    }

}
