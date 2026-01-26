package Level1.exercise3;

import java.util.ArrayList;
import java.util.Arrays;

public class OutOfBoundsGenerator {

    private ArrayList<Integer> numbers;

    public OutOfBoundsGenerator() {
        this.numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    }

    public OutOfBoundsGenerator (ArrayList<Integer>customList) {
        this.numbers = customList;
    }

    public int getElementAtIndex (int index) {
        return numbers.get(index);
    }

    public void removeElementAtIndex(int index) {
        numbers.remove(index);

    }
}
