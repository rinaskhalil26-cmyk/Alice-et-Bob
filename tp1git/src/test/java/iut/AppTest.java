package iut;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTest {
    
    @Test
    public void testAdd() {
        Add addition = new Add();
        int resultat = addition.add(2, 3);
        assertEquals(5, resultat, "2 + 3 doit être égal à 5");
    }
}