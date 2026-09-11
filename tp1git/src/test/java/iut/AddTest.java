package iut;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    public void testAdd() {
        // On crée une instance de la classe Add
        Add addition = new Add();
        
        // On teste la méthode avec 2 et 3
        int resultat = addition.add(2, 3);
        
        // On vérifie que le résultat est bien égal à 5
        assertEquals(5, resultat, "Le résultat de 2 + 3 doit être 5");
    }
}