package Level2.exercise2;

import Level2.Figura3D;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class Figura3DTest2 {

    @Test
    void testSameReference() {

        Figura3D original = new Figura3D("Cubo", "Rojo", 6);
        Figura3D sameReference = original;

        assertThat(original).as("Las variables 'original' y 'sameReference' apuntan al mismo objeto en memoria")
                .isSameAs(sameReference);
    }

    @Test
    void testDiferentReference() {

        Figura3D f1 = new Figura3D("Cubo", "Rojo", 6);
        Figura3D f2 = new Figura3D("Cubo", "Rojo", 6);

        assertThat(f1).as("'f1' y 'f2' son objetos DIFERENTES en memoria aunque tengan los mismos valores")
                .isNotSameAs(f2);

    }

}