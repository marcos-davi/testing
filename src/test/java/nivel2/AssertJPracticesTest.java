package nivel2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class AssertJPracticesTest {

    // Exercici 1: Assertions for integer equality and inequality
    @Test
    void shouldDemonstrateIntegerEqualityAndInequality() {
        Integer valueA = 50;
        Integer valueB = 50;
        Integer valueC = 100;

        assertThat(valueA).isEqualTo(valueB);
        assertThat(valueA).isNotEqualTo(valueC);
    }

    // Exercici 2: Assertions for object reference equality and difference
    @Test
    void shouldDemonstrateObjectReferenceEquality() {
        String referenceA = "Java";
        String referenceB = referenceA; // Same reference in memory
        String referenceC = new String("Java"); // Different object reference

        assertThat(referenceA).isSameAs(referenceB);
        assertThat(referenceA).isNotSameAs(referenceC);
    }

    // Exercici 3: Assertion for identical integer arrays
    @Test
    void shouldDemonstrateIdenticalIntegerArrays() {
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] actualArray = {1, 2, 3, 4, 5};

        assertThat(actualArray).isEqualTo(expectedArray);
    }
}