import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ArraylistTest {

    Arraylist<String> asd = new Arraylist<>();

    @BeforeEach
    public void setUp(){
        asd.add("Banane");
        asd.add("QQQ");
        asd.add("UYYU");
        asd.add("hjk");
        asd.add("0000");
        asd.add("mm");
    }

    @org.junit.jupiter.api.Test
    void add() {
        asd.add("12345");
        assertEquals(asd.get(6) , "12345");
    }

    @org.junit.jupiter.api.Test
    void clear() {
        asd.clear();
    }

    @org.junit.jupiter.api.Test
    void remove() {
        asd.remove(6);
        assertEquals(asd.get(6) , null);

    }

    @org.junit.jupiter.api.Test
    void get() {
        assertEquals(asd.get(6) , "12345");
    }

    @org.junit.jupiter.api.Test
    void set() {
        asd.set(6,"123");
        assertEquals(asd.get(6) , "123");
    }

    @org.junit.jupiter.api.Test
    void add1() {
        asd.add(6, "123");
        assertEquals(asd.get(6) , "123");
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(asd.size() , 6);
    }

}