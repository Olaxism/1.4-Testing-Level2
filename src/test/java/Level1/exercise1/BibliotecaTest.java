package Level1.exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    private Biblioteca biblioteca;
    private Libro libro;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca ("Conocimiento");
        libro = new Libro ("La Metamorfosis", "Ficción del Absurdo");

    }

    @Test
    void coleccionNoEmpty() {

        biblioteca.addLibro(libro);

        assertFalse(biblioteca.getColeccion().isEmpty(),
                "La colección no está vacia");
    }

    @Test
    void addLibroSizeColleccion() {

        biblioteca.addLibro(libro);
        assertEquals(1, biblioteca.getColeccion().size(),
                "El tamaño deberia ser 1 despues de agregar un libro");

    }

    @Test
    void getBookAtAccuratePosition() {

        Libro libro1 = new Libro("Libro 1", "Género 1");
        Libro libro2 = new Libro("Libro 2", "Género 2");
        Libro libro3 = new Libro("Libro 3", "Género 3");

        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro3);

        assertEquals(libro1, biblioteca.getLibro(0),
                "El primer libro deberia estar en la posicion 0");
        assertEquals(libro2, biblioteca.getLibro(1),
                "El segundo libro deberia estar en la posicion 1");
        assertEquals(libro3, biblioteca.getLibro(2),
                "El tercer libro deberia estar en la posicion 2");
    }

    @Test
    void noDuplicates() {

        Libro book1 = new Libro ("Born a Crime", "Biografia");
        Libro duplicatedBook = new Libro("Born a Crime", "Biografia");

        biblioteca.addLibro(book1);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> biblioteca.addLibro(duplicatedBook),
                "Deberia lanzar IllegalArgumentException al intentar agregar titulo duplicado");

        assertTrue(exception.getMessage().contains("Ya existe un libro con este titulo"),
                "El mensaje de error deberia indicar que ya existe un libro con ese titulo");
    }

    @Test
    void getLibroPosition() {
        Libro book1 = new Libro("Born a Crime", "Biografia");
        Libro book2 = new Libro("La Odisea de Homero", "Poesía Epica");
        Libro book3 = new Libro("Alicia en el Pais de las Maravillas", "Fantasia");

        biblioteca.addLibro(book1);
        biblioteca.addLibro(book2);
        biblioteca.addLibro(book3);

        assertEquals("Alicia en el Pais de las Maravillas", biblioteca.getLibro(0).getTitle(),
                "El titulo en la posicion 0 debe ser 'Alicia en el Pais de las Maravillas'");

        assertEquals("Born a Crime", biblioteca.getLibro(1).getTitle(),
                "El titulo en la posicion 1 debe ser 'Born a Crime'");

        assertEquals("La Odisea de Homero", biblioteca.getLibro(2).getTitle(),
                "El titulo en la posicion 2 debe ser 'La Odisea de Homero'");
    }

    @Test
    void addLibroModifiesColeccionAccurately() {

        assertTrue(biblioteca.getColeccion().isEmpty());
        assertEquals(0, biblioteca.getColeccion().size());

        Libro book1 = new Libro ("Born a Crime", "Biografia");
        biblioteca.addLibro(book1);

        assertFalse(biblioteca.getColeccion().isEmpty());
        assertEquals(1, biblioteca.getColeccion().size());
        assertTrue(biblioteca.getColeccion().contains(book1));
        assertEquals(book1, biblioteca.getLibro(0));
    }

    @Test
    void removeLibroReducesColeccion() {

        Libro book1 = new Libro ("Born a Crime", "Biografia");
        Libro book2 = new Libro ("La Odisea de Homero", "Poesía Epica");
        Libro book3 = new Libro ("Alicia en el Pais de las Maravillas", "Fantasia");

        biblioteca.addLibro(book1);
        biblioteca.addLibro(book2);
        biblioteca.addLibro(book3);

        assertEquals(3, biblioteca.getColeccion().size());

        biblioteca.removeLibro(book2);
        assertEquals(2, biblioteca.getColeccion().size(),
                "Deberia haber 2 libros despues de remover uno");

        biblioteca.removeLibro(book1);
        assertEquals(1, biblioteca.getColeccion().size(),
                "Deberia haber 1 libro despues de remover dos libros");

    }

    @Test
    void alphabeticOrderRemainsAfterAdd() {

        Libro book1 = new Libro ("Born a Crime", "Biografia");
        Libro book2 = new Libro ("La Odisea de Homero", "Poesía Epica");
        Libro book3 = new Libro ("Alicia en el Pais de las Maravillas", "Fantasia");

        biblioteca.addLibro(book1);
        biblioteca.addLibro(book2);
        biblioteca.addLibro(book3);

        assertEquals("Alicia en el Pais de las Maravillas", biblioteca.getLibro(0).getTitle());
        assertEquals("Born a Crime", biblioteca.getLibro(1).getTitle());
        assertEquals("La Odisea de Homero", biblioteca.getLibro(2).getTitle());
    }

    @Test
    void alphabeticOrderRemainsAfterAddInPosition() {

        biblioteca.addLibro(0, new Libro ("Born a Crime", "Biografia"));
        biblioteca.addLibro(1, new Libro ("La Odisea de Homero", "Poesía Epica"));
        biblioteca.addLibro(2, new Libro ("Alicia en el Pais de las Maravillas", "Fantasia"));

        assertEquals("Alicia en el Pais de las Maravillas", biblioteca.getLibro(0).getTitle());
        assertEquals("Born a Crime", biblioteca.getLibro(1).getTitle());
        assertEquals("La Odisea de Homero", biblioteca.getLibro(2).getTitle());
    }

    @Test
    void alphabeticOrderRemainsAfterRemoving() {

        Libro book1 = new Libro ("Born a Crime", "Biografia");
        Libro book2 = new Libro ("La Odisea de Homero", "Poesía Epica");
        Libro book3 = new Libro ("Alicia en el Pais de las Maravillas", "Fantasia");
        Libro book4 = new Libro ("El Coronel no tiene quien le escriba", "Realismo Literario");

        biblioteca.addLibro(book1);
        biblioteca.addLibro(book2);
        biblioteca.addLibro(book3);
        biblioteca.addLibro(book4);

        biblioteca.removeLibro(book1);

        assertEquals("Alicia en el Pais de las Maravillas", biblioteca.getLibro(0).getTitle());
        assertEquals("El Coronel no tiene quien le escriba", biblioteca.getLibro(1).getTitle());
        assertEquals("La Odisea de Homero", biblioteca.getLibro(2).getTitle());
    }
}