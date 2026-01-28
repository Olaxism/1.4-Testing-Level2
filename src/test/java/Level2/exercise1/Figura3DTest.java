package Level2.exercise1;

import Level2.Figura3D;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Figura3DTest {


    @Test
    void testTwoObjectsWithSameValueAreEquals() {

        Figura3D cubo1 = new Figura3D("Cubo", "Azul", 6);
        Figura3D cubo2 = new Figura3D("Cubo", "Azul", 6);

        assertThat(cubo1).as("Dos objetos de una Figura3D con los mismos valores deben ser iguales")
                .isEqualTo(cubo2);
    }

    @Test
    void testTwoObjectsWithDiferentValueAreNotEquals() {

        Figura3D f1 = new Figura3D("Cubo", "Azul", 6);
        Figura3D f2 = new Figura3D("Esfera", "Rojo", 0);

        assertThat(f1).as("Dos objetos de una Figura3D con valores diferentes no deben ser iguales")
                .isNotEqualTo(f2);
    }
}