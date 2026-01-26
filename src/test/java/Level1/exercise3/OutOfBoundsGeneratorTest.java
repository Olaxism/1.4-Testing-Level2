package Level1.exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OutOfBoundsGeneratorTest {

    private OutOfBoundsGenerator generator;

    @BeforeEach
    void setUp() {
        generator = new OutOfBoundsGenerator();
    }

    @Test
    void getElementAtIndexTooLarge() {
        IndexOutOfBoundsException exception = assertThrows(
                IndexOutOfBoundsException.class,
                () -> generator.getElementAtIndex(8));
    }

    @Test
    void emptyListThrowException() {
        OutOfBoundsGenerator emptyList = new  OutOfBoundsGenerator(new ArrayList<>());

        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class,
                () -> emptyList.getElementAtIndex(0));

    }

}