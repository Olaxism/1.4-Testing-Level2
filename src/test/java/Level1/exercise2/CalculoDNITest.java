package Level1.exercise2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDNITest {

    private CalculoDNI calculoDNI;

    private void testDNI(int DNInumber, char expectedLetter) {
        char resultLetter = calculoDNI.getLetter(DNInumber);
        assertEquals(expectedLetter, resultLetter,
                String.format("DNI %d - Esperado: %s, Calculado: %s",
                        DNInumber, expectedLetter, resultLetter));
    }

    @BeforeEach
    void setup() {
        calculoDNI = new CalculoDNI();
    }

    @Test
    void getLetterWithKnownDNIs() {

        testDNI(12345678, 'Z');
        testDNI(98765432, 'M');
        testDNI(11111111, 'H');
        testDNI(22222222, 'J');
        testDNI(33333333, 'P');
        testDNI(44444444, 'A');
        testDNI(55555555, 'K');
        testDNI(66666666, 'Q');
        testDNI(77777777, 'B');
        testDNI(88888888, 'Y');
    }

    @Test
    void sameResidualSameLetter() {

        char letter23 = calculoDNI.getLetter(23);
        char letter46 = calculoDNI.getLetter(46);
        char letter69 = calculoDNI.getLetter(69);

        assertEquals(letter23, letter46);
        assertEquals(letter46, letter69);
        assertEquals(letter23, letter69);

        char letter24 = calculoDNI.getLetter(24);
        char letter47 = calculoDNI.getLetter(47);
        char letter70 = calculoDNI.getLetter(70);

        assertEquals(letter24, letter47);
        assertEquals(letter47, letter70);
        assertEquals(letter24, letter70);
    }
}