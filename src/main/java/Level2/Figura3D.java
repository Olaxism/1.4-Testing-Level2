package Level2;

import java.util.Objects;

public class Figura3D {

    private String name;
    private String color;
    private int sides;

    public Figura3D (String name, String color, int sides){
        this.name = name;
        this.color = color;
        this.sides = sides;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSides() {
        return sides;
    }

    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figura3D f3D = (Figura3D) o;
        return Objects.equals(name, f3D.name) &&
                Objects.equals(color, f3D.color) &&
                Objects.equals(sides, f3D.sides);
    }

    public int hashCode() {
        return Objects.hash(name, color, sides);
    }

    @Override
    public String toString() {
        return "Figura3D{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", sides=" + sides +
                '}';
    }
}
