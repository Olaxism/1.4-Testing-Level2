package Level2.exercise7;

import Level2.Figura3D;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.assertj.core.api.Assertions.*;


public class TestOptional {

    @Test
    void testOptionalEmpty() {

        Optional<Figura3D> optionalFiguraEmpty = Optional.empty();

        assertThat(optionalFiguraEmpty).as("Optional debe estar vacío")
                .isEmpty();

    }
}
