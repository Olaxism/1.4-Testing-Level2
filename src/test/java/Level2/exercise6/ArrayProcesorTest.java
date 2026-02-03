package Level2.exercise6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArrayProcesorTest {

    private ArrayProcessor processor;
    private int[] arrayTest;

    @BeforeEach
    void setUp() {
        processor = new ArrayProcessor();
        arrayTest = new int[] {10, 20, 30, 40};
    }

    @Test
    void testArrayIndexOutOfBoundsExceptionWorks() {

        assertThatThrownBy(() -> {
            processor.getElementInPosition(arrayTest, 10);
        })
                .as("Debe lanzar ArrayIndexOutOfBoundsException con indice fuera de rango")
                .isInstanceOf(ArrayIndexOutOfBoundsException.class);

    }
}