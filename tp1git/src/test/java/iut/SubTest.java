package iut;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubTest {
    @Test 
    public void test1(){
        assertEquals(0, Sub.sub(1, 1));// vérifie que 1-1 = 0
    }
}
