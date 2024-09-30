import org.example.PlayerCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlayerCharacterTest {
    @Test
    public void getXTest_whenValue0_thenReturnPositionXIsMiddle() {
        //GIVEN
        //WHEN
        int actual = PlayerCharacter.getX();
        //THEN
        assertEquals(0,actual);
    }
}
