package nivel1.exercise3;

public class ArrayExceptionDemo {

    // Method that intentionally triggers an ArrayIndexOutOfBoundsException
    public void accessInvalidIndex() {
        int[] numbers = {1, 2, 3, 4, 5};
        // Trying to access an index outside the array bounds (size is 5, index 10 is invalid)
        int invalidElement = numbers[10];
    }
}