package Level1.exercise2;

import java.util.ArrayList;

public class CalculoDNI {

    private final ArrayList<Integer> numbers;
    private final ArrayList<Character> letters;

    public CalculoDNI() {
        this.numbers = new ArrayList<>();
        for (int i = 0; i <= 22; i++) {
            this.numbers.add(i);
        }
        this.letters =new ArrayList<>();
        char[] allLetters = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();
        for (char letter : allLetters) {
            this.letters.add(letter);
        }
    }

    public char getLetter(int n) {
        int residualNumber = n - ((n / 23) * 23);

        for (int i = 0; i < numbers.size(); i++) {
            if (residualNumber == numbers.get(i)) {
                return letters.get(i);
            }
        }
        return '?';
    }
}
