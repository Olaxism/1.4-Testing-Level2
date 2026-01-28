package Level2.exercise3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class ArrayEnterosTest {

    @Test
    void testTwoIntegerArrayAreTheSame() {

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};

        assertThat(array1).as("Los dos arrays de enteros deben ser idénticos").isEqualTo(array2);

    }
}