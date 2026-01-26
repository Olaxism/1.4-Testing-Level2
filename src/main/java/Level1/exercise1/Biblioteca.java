package Level1.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {

    private String name;
    private ArrayList<Libro> coleccion;

    public Biblioteca(String name) {
        this.name = name;
        this.coleccion = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Libro> getColeccion() {
        return List.copyOf(coleccion);
    }

    public void addLibro(Libro book) {
        if(bookAlreadyExist(book.getTitle())){
            throw new IllegalArgumentException("Ya existe un libro con este titulo");
        }
        coleccion.add(book);
        Collections.sort(coleccion, Comparator.comparing(Libro::getTitle));
    }

    public Libro getLibro(int p) {
        System.out.println(coleccion.get(p));
        return (coleccion.get(p));
    }

    public void addLibro (int p, Libro book) {
        if (bookAlreadyExist(book.getTitle())) {
            throw new IllegalArgumentException("Ya existe un libro con este titulo ");

        }
        coleccion.add(p, book);
        Collections.sort(coleccion, Comparator.comparing(Libro::getTitle));

    }

    public void removeLibro (Libro book) {
        coleccion.remove(book);
    }

    private boolean bookAlreadyExist(String title) {
        for (Libro libro : coleccion) {
            if (libro.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "name='" + name + '\'' +
                '}';
    }

}
