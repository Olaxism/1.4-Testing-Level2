package Level2.exercise5;

import Level2.Figura3D;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.assertj.core.api.Assertions.*;


public class MapTest {

    private Map<String, Figura3D> mapaFiguras;
    private Figura3D cube;
    private Figura3D sphere;
    private Figura3D piramid;


    @BeforeEach
    void setUp() {

        cube = new Figura3D("Cubo", "Rojo", 6);
        sphere = new Figura3D("Esfera", "Azul", 0);
        piramid = new Figura3D("Piramide", "Amarillo", 5);

        mapaFiguras = new HashMap<>();
        mapaFiguras.put("figura 1", cube);
        mapaFiguras.put("figura 2", sphere);
        mapaFiguras.put("figura 3", piramid);

    }

    @Test
    void testMapContainsKey() {

        assertThat(mapaFiguras).as("El mapa debe contener la clave 'figura1'")
                .containsKey("figura 1");

        assertThat(mapaFiguras).containsKey("figura 2");

        assertThat(mapaFiguras).containsKey("figura 3");
    }
}