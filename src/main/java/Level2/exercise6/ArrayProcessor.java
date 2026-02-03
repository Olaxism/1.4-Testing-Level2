package Level2.exercise6;

public class ArrayProcessor {

    public String getElementInPosition(int[] array, int position) {
        return "Elemento en posición" + position +": " + array[position];
    }

    public int addUntilPosition(int[] array, int position) {
        int addition = 0;
        for (int i = 0; i <= position; i++) {
            addition += array[i];
        }
        return addition;
    }

    public int getFifthElement(int[] array) {
        return array[4];
    }
}
