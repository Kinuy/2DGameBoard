import org.example.PlayerCharacter;
import org.junit.jupiter.api.DisplayName;
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
    @Test
    public void getYTest_whenValue0_thenReturnPositionYIsMiddle() {
        //GIVEN
        //WHEN
        int actual = PlayerCharacter.getY();
        //THEN
        assertEquals(0,actual);
    }
    @Test
    @DisplayName("Up")
    public void moveTest_givenStringValue_W_thenSetYto1andReturnTrue(){
        //GIVEN
        String value = "W";
        //WHEN
        boolean actual = PlayerCharacter.move(value);
        //THEN
        assertEquals(true,actual);
    }
    public void moveTest_givenStringValue_W_thenSetYto1andReturnTrue(){
        //GIVEN
        String value = "W";
        //WHEN
        boolean actual = PlayerCharacter.move(value);
        //THEN
        assertEquals(true,actual);
    }
}

