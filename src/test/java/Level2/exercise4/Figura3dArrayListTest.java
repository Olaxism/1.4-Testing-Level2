package Level2.exercise4;

import Level2.Figura3D;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class Figura3dArrayListTest {

    private List<Figura3D> figurasList;
    private Figura3D cube;
    private Figura3D sphere;
    private Figura3D tetrahedron;
    private Figura3D piramid;
    private Figura3D dodecahedron;
    private Figura3D notAdded;

    @BeforeEach

    void setUp() {

        cube = new Figura3D("Cubo", "Rojo", 6);
        sphere = new Figura3D("Esfera", "Azul", 0);
        tetrahedron = new Figura3D("Tetraedro", "Verde", 4);
        piramid = new Figura3D("Piramide", "Amarillo", 5);
        dodecahedron = new Figura3D("Dodecaedro", "Naranja", 12);
        notAdded = new Figura3D("Icosaedro", "Morado", 20);

        figurasList = new ArrayList<>();
        figurasList.add(cube);
        figurasList.add(sphere);
        figurasList.add(tetrahedron);
        figurasList.add(piramid);
        figurasList.add(dodecahedron);

    }

        @Test
        void testOrderInsertion() {

        assertThat(figurasList).as("Verificar que los objetos estan en orden de inserción")
                .containsExactly(cube,sphere,tetrahedron,piramid,dodecahedron);
        }

        @Test
        void testContainsAnyOrder() {

        List<Figura3D> anyOrderList = new ArrayList<>();
        anyOrderList.add(piramid);
        anyOrderList.add(tetrahedron);
        anyOrderList.add(cube);
        anyOrderList.add(dodecahedron);
        anyOrderList.add(sphere);

        assertThat(figurasList).as("La lista contiene los mismos objetos en cualquier orden")
                .containsExactlyInAnyOrderElementsOf(anyOrderList);

        assertThat(figurasList).contains(sphere,cube,dodecahedron,piramid, tetrahedron);

        }

        @Test
        void  testAddedElementOnlyOnce() {


        assertThat(figurasList).as("Verificar que cada elemento aparece solo una vez")
                .containsOnlyOnce(sphere)
                .containsOnlyOnce(piramid);

        }

        @Test
        void testNotAddedElementIsReallyNotAdded() {

        assertThat(figurasList).as("La lista no deberia contener el elemento no agregado")
                .doesNotContain(notAdded);
        }
}
