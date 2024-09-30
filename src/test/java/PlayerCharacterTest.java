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
        assertEquals(0, actual);
    }

    @Test
    public void getYTest_whenValue0_thenReturnPositionYIsMiddle() {
        //GIVEN
        //WHEN
        int actual = PlayerCharacter.getY();
        //THEN
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Up")
    public void moveTest_givenStringValue_W_thenSetYto1andReturnTrue() {
        //GIVEN
        String value = "W";
        //WHEN
        boolean actual = PlayerCharacter.move(value);
        //THEN
        assertEquals(true, actual);
    }
    @Test
    @DisplayName("Down")
    public void moveTest_givenStringValue_S_thenSetYtoMinus1andReturnTrue() {
        //GIVEN
        String value = "S";
        //WHEN
        boolean actual = PlayerCharacter.move(value);
        //THEN
        assertEquals(true, actual);
    }
    @Test
    @DisplayName("left")
    public void moveTest_givenStringValue_A_thenSetXtoMinus1andReturnTrue() {
        //GIVEN
        String value = "A";
        //WHEN
        boolean actual = PlayerCharacter.move(value);
        //THEN
        assertEquals(true, actual);
    }
    @Test
    @DisplayName("Right")
    public void moveTest_givenStringValue_D_thenSetXto1andReturnTrue() {
        //GIVEN
        String value = "D";
        //WHEN
        boolean actual = PlayerCharacter.move(value);
        //THEN
        assertEquals(true, actual);
    }
}

