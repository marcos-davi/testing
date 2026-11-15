package nivel1.exercise1;

import org.junit.jupiter.api.Test;

import java.util.List;

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
    @Test
    void shouldGetBookByPosition() {
        Library library = new Library();
        library.addBook("Clean Code");
        library.addBook("Effective Java");

        assertEquals("Clean Code", library.getBookByPosition(0));
        assertEquals("Effective Java", library.getBookByPosition(1));
    }

    @Test
    void shouldAddBookAtSpecificPosition() {
        Library library = new Library();
        library.addBook("Clean Code");
        library.addBook("Design Patterns");

        // Insert "Effective Java" at index 1
        library.addBookAtPosition(1, "Effective Java");

        assertEquals("Effective Java", library.getBookByPosition(1));
        assertEquals(3, library.getBooks().size(), "Collection size should be 3 after insertion");
    }

    @Test
    void shouldRemoveBookByTitle() {
        Library library = new Library();
        library.addBook("Clean Code");
        library.addBook("Effective Java");

        library.removeBook("Clean Code");

        assertEquals(1, library.getBooks().size(), "Collection size should reduce to 1 after removal");
        assertFalse(library.getBooks().contains("Clean Code"));
    }
    @Test
    void shouldReturnAlphabeticallySortedCopyWithoutModifyingOriginal() {
        Library library = new Library();
        library.addBook("Effective Java");
        library.addBook("Clean Code");
        library.addBook("Algorithms");

        List<String> sortedCopy = library.getSortedBooksAlphabetically();

        // 1. Verify the copy is sorted alphabetically
        assertEquals("Algorithms", sortedCopy.get(0));
        assertEquals("Clean Code", sortedCopy.get(1));
        assertEquals("Effective Java", sortedCopy.get(2));

        // 2. Verify the original insertion order remains unchanged
        assertEquals("Effective Java", library.getBookByPosition(0));
        assertEquals("Clean Code", library.getBookByPosition(1));
        assertEquals("Algorithms", library.getBookByPosition(2));
    }
}