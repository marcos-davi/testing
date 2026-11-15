package nivel2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    // Exercici 4: ArrayList assertions (order, any order, containing only once, not containing)
    @Test
    void shouldPerformArrayListAssertions() {
        String item1 = "Laptop";
        String item2 = "Mouse";
        String item3 = "Keyboard";
        String unaddedItem = "Monitor";

        List<Object> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        // 1. Verify the order of objects as they were inserted
        assertThat(items).containsSequence(item1, item2, item3);

        // 2. Verify the list contains the objects in any order
        assertThat(items).containsExactlyInAnyOrder(item3, item1, item2);

        // 3. Verify that one of the objects was added only once, and verify an unadded item is absent
        assertThat(items).containsOnlyOnce(item1);
        assertThat(items).doesNotContain(unaddedItem);
    }

    // Exercici 5: Map assertions (verify it contains a specific key)
    @Test
    void shouldVerifyMapContainsKey() {
        Map<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("Spain", "Madrid");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Italy", "Rome");

        // Verify that the map contains one of the added keys
        assertThat(countryCapitals).containsKey("Spain");
    }
    // Exercici 6: Exception assertions (verify that a block of code throws a specific exception and message)
    @Test
    void shouldAssertExceptions() {
        assertThatThrownBy(() -> {
            throw new IllegalArgumentException("Invalid configuration provided");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Invalid configuration");
    }

    // Exercici 7: Optional assertions (verify that an Optional is present and contains the expected value)
    @Test
    void shouldAssertOptional() {
        Optional<String> presentOptional = Optional.of("Advanced Assertions");

        assertThat(presentOptional)
                .isPresent()
                .hasValue("Advanced Assertions");
    }
}