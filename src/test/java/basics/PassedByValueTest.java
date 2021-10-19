package basics;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PassedByValueTest {

    @Test public void objectTest() {

        MyClass obj = new MyClass();

        int x = 3;
        obj.init(x);

        assertEquals(x, 3); 
            // pass
        assertFalse(x == 0); 
            // pass
    }

    @Test public void staticTest() {

        String y = "aaa";
        MyClass.set(y);

        assertEquals(MyClass.y, "zzz"); 
            // pass
        assertFalse(MyClass.y.equals("aaa")); 
            // pass
    }
}

class MyClass {

    int x;
    public void init(int x) {
        x = 0;
    }
    
    static String y;
    public static void set(String y) {
        MyClass.y = "zzz";
    }
}