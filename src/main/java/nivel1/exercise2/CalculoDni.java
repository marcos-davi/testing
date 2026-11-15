package nivel1.exercise2;

public class CalculoDni {
    private static final char[] LETTERS = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    // Method to calculate the corresponding DNI letter from its numeric value
    public char calcularLletra(int dniNumber) {
        if (dniNumber < 0) {
            throw new IllegalArgumentException("DNI number cannot be negative.");
        }
        int index = dniNumber % 23;
        return LETTERS[index];
    }
}