package de.telekom.sea4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MiddleTest {
    @Mock
    Bottom bottom; //= new Bottom();

    @Test
    public void getMessageTest() {
        //arrange
        Middle middle = new Middle(bottom);
        //act
        String  actualMessage = middle.getMessage();
        //assert
        assertEquals("Hello from bottom", actualMessage);
    }

}
