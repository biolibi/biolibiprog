
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    LinkedList<String> asd = new LinkedList<>();

    @BeforeEach
    public void setUp(){
        asd.add("Banane");
        asd.add("QQQ");
        asd.add("UYYU");
        asd.add("hjk");
        asd.add("0000");
        asd.add("mm");
    }

    @Test
    void addIndex() {
        asd.add(3 , "INDEX3");
        asd.add(0, "INDEX0");
       assertEquals(asd.get(0) , "INDEX0");

    }

    @Test
    void get() {
        assertEquals(asd.get(0),"Banane");
        assertEquals(asd.get(2) ,"UYYU");


    }

    @Test
    void remove() {
        asd.remove(0);
        assertEquals(asd.get(0),"QQQ");




    }

    @Test
    void clear() {
        asd.clear();
        assertEquals(0 , asd.getTaille());
    }

    @Test
    void getTaille() {
        asd.getTaille();
        assertEquals(asd.getTaille() , 6);
    }

    @Test
    void set() {
        asd.set(0,"ALLO");
        assertEquals(asd.get(0) , "ALLO");

    }

    @Test
    void add() {
        asd.add("asd");
        assertEquals(asd.get(6) , "asd");
    }

}
