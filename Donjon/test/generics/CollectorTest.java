package generics;

import org.junit.Test;
import static org.junit.Assert.*;
import vegetable.Apple;
import vegetable.*;

/**
 * Test de la classe Collector 
 * @author Wissam Lefevre, Omar Al Yasini
 */
public class CollectorTest {

    Collector<Apple> cApple1 = new Collector<>("Collecteur de pomme 1");
    Collector<Apple> cApple2 = new Collector<>("Collecteur de pomme 2");
    Collector<Apple> cApple3 = new Collector<>("Collecteur de pomme 3");

    Collector<Apple> cApple4 = new Collector<>("Récupérateur de pomme 4");

    Collector<Apple> cApple5 = new Collector<>("Destructeur de pomme 5");

    Collector<Cauliflower> cCauliflower = new Collector<>("Récupérateur de choux fleur");

    Apple apple1 = new Apple(1);
    Apple apple2 = new Apple(2);
    Apple apple3 = new Apple(3);
    Apple apple4 = new Apple(4);
    Apple apple5 = new Apple(5);

    /**
     * Test of getCarriedObject method, of class Collector.
     */
    @Test
    public void testGetCarriedObject() throws AlreadyCarryingException {
        // Le test est le même que "take"

        // Vérifie si cApple2 est bien vide avant l'ajout
        assertNull(cApple1.getCarriedObject());
        cApple1.take(apple1);
        // Vérifie si cApple2 a bien la pomme maintenant
        assertEquals(cApple1.getCarriedObject(), apple1);
    }

    /**
     * Test of take method, of class Collector.
     */
    @Test
    public void testTake() throws AlreadyCarryingException {
        // Le test est le même que "getCarriedObject"

        // Vérifie si cApple2 est bien vide avant l'ajout
        assertNull(cApple2.getCarriedObject());
        cApple2.take(apple2);
        // Vérifie si cApple2 a bien la pomme maintenant
        assertEquals(cApple2.getCarriedObject(), apple2);

        // NON COMPILABLE
        // cCauliflower.take(apple4);
    }

    /**
     * Test of giveTo method, of class Collector.
     */
    @Test
    public void testGiveTo() throws AlreadyCarryingException, NotSameTypeException {
        assertNull(cApple3.getCarriedObject());
        cApple3.take(apple3);
        assertEquals(cApple3.getCarriedObject(), apple3);
        cApple3.giveTo(cApple4);
        // Vérifie que cApple3 n'a plus la pomme et que cApple4 a la pomme
        assertNull(cApple3.getCarriedObject());
        assertEquals(cApple4.getCarriedObject(), apple3);

        // Test avec le cCauliflower
        assertNull(cCauliflower.getCarriedObject());

        // NON COMPILABLE
        // cApple4.giveTo(cCauliflower);
        // Vérifie que cApple4 n'a pas donné la pomme et que cCauliflower reste bien vide
        assertEquals(cApple4.getCarriedObject(), apple3);
        assertNull(cCauliflower.getCarriedObject());

    }

    /**
     * Test of drop method, of class Collector.
     */
    @Test
    public void testDrop() throws AlreadyCarryingException {
        // On donne et on enlève la pomme du collector
        assertNull(cApple5.getCarriedObject());
        cApple5.take(apple5);
        assertEquals(cApple5.getCarriedObject(), apple5);
        cApple5.drop();
        assertNull(cApple5.getCarriedObject());

    }

}
