package nivel1.exercise3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayExceptionDemoTest {

    @Test
    void shouldThrowArrayIndexOutOfBoundsException() {
        ArrayExceptionDemo demo = new ArrayExceptionDemo();

        // Verify that calling the method throws ArrayIndexOutOfBoundsException
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            demo.accessInvalidIndex();
        }, "Expected ArrayIndexOutOfBoundsException when accessing an invalid array index");
    }
}