package nivel1.exercise1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void libraryCollectionShouldNotBeNull() {
        Library library = new Library();
        assertNotNull(library.getBooks(), "The book collection should not be null after instantiation");
    }

    @Test
    void shouldAddBooksAndVerifySizeAndDuplicates() {
        Library library = new Library();
        library.addBook("Clean Code");
        library.addBook("Effective Java");
        library.addBook("Clean Code"); // Duplicate attempt

        assertEquals(2, library.getBooks().size(), "Collection size should be 2, ignoring duplicates");
    }
}