import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {


    @Test
    public void sayHi() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("SomkiaT");
        assertEquals("Hello SomkiaT", result);
    }
    @Test
    public  void  sayHiPui(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("pui");
        assertEquals("Hello Pui",result);
    }
}
