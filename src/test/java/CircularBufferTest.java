import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {
    CircularBuffer cb =new CircularBuffer();
    @Test
    public void  create_new_buffer_should_size(){
        CircularBuffer cb =new CircularBuffer(5);

        boolean result = cb.isEmpty();
        assertTrue("Buffer ",result);
    }

    @Test
    public void  create_new_buffer_should_empty(){
            boolean result = cb.isEmpty();
            assertTrue("Buffer ",result);
    }
    @Test
    public void  create_new_buffer_should_10(){
        for(int i = 0 ;i < 10;i++){
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
    }

    @Test
    public void write_A_to_buffer_should_A(){
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A",cb.readData());
        assertEquals("B",cb.readData());

    }

}