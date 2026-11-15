package nivel1.exercise2;

import nivel1.exercise2.CalculoDni;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {

    @ParameterizedTest(name = "DNI number {0} should have letter {1}")
    @CsvSource({
            "0, T",
            "1, R",
            "12345678, Z",
            "87654321, X",
            "99999999, R",
            "11111111, H",
            "50000000, K",
            "33333333, Q",
            "66666666, J",
            "77777777, B"
    })
    void shouldCalculateCorrectLetterForDniNumbers(int dniNumber, char expectedLetter) {
        CalculoDni calculator = new CalculoDni();
        assertEquals(expectedLetter, calculator.calcularLletra(dniNumber));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -50, -123456})
    void shouldThrowExceptionForNegativeDniNumbers(int negativeDni) {
        CalculoDni calculator = new CalculoDni();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calcularLletra(negativeDni);
        }, "Expected IllegalArgumentException for negative DNI numbers");
    }
}