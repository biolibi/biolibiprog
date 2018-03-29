import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileTest {
    File<String> asd =  new File<>();
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
    void add() {
        asd.add("asd");
        asd.add("123");
        assertEquals(asd.peek() , "Banane");
    }

    @Test
    void remove() {
        asd.remove();
        assertEquals(asd.peek(),"QQQ");

    }

    @Test
    void peek() {
        assertEquals(asd.peek(), "Banane");
    }

    @Test
    void clear() {
        asd.clear();
        assertEquals(asd.taille() , 0);


    }

    @Test
    void taille() {
        asd.add("asd");
        asd.add("123");
        assertEquals(asd.taille() , 8);
    }

}