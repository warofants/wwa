import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.worldwarofants.game.logic.Queen;

public class QueenTest {
    Queen myTestEntity = new Queen(-2147483647, 2147483647);

    @Test
    public void testX() {
        assertEquals(-2147483647, myTestEntity.getX());
    }

    @Test
    public void testY() {
        System.out.println(myTestEntity.getX());
        assertEquals(2147483647, myTestEntity.getY());
    }

    @Test
    public void testChangeX() {
        myTestEntity.setX(100);
        assertEquals(100, myTestEntity.getX());
    }

    @Test
    public void testChangeY() {
        myTestEntity.setY(99);
        assertEquals(99, myTestEntity.getY());
    }
}