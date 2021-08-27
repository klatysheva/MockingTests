package de.telekom.sea4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BottomTest {
    @Test
    public void getMessageTest() {
        //arrange
        Bottom bottom = new Bottom();
        //act
        String  actualMessage = bottom.getMessage();
        //assert
        assertEquals("Hello from bottom", actualMessage);
    }

}
