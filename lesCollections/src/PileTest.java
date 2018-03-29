import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PileTest {
    Pile<String> asd = new Pile<>();




    @Test
    void push() {
        asd.push("123");
        asd.push("345");
        asd.push("456");
        assertEquals(asd.peek() , "456");
    }

    @Test
    void pop() {
        asd.push("123");
        asd.push("345");
        asd.push("456");
       assertEquals(asd.pop() , "456");
    }

    @Test
    void peek() {
        asd.push("mm");
        asd.push("cc");
        assertEquals(asd.peek() , "cc");
    }

    @Test
    void size() {
        asd.push("mm");
        asd.push("cc");
        assertEquals(asd.size() , 2);
    }

    @Test
    void clear() {
        asd.clear();
        assertEquals(asd.size() , 0);
    }

}