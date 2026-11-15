package nivel1.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Retrieve the full list of books
    public List<String> getBooks() {
        return books;
    }

    // Add a book ensuring no duplicates and valid titles
    public void addBook(String title) {
        if (title != null && !title.trim().isEmpty()) {
            if (!books.contains(title)) {
                books.add(title);
            }
        }
    }

    // Get the title of a book based on its position (index)
    public String getBookByPosition(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        }
        throw new IndexOutOfBoundsException("Invalid position: " + index);
    }

    // Add a book at a specific position
    public void addBookAtPosition(int index, String title) {
        if (title != null && !title.trim().isEmpty() && !books.contains(title)) {
            if (index >= 0 && index <= books.size()) {
                books.add(index, title);
            }
        }
    }

    // Remove a book by its title
    public void removeBook(String title) {
        books.remove(title);
    }
    // Return a copy of the list sorted alphabetically without modifying the original collection
    public List<String> getSortedBooksAlphabetically() {
        List<String> sortedCopy = new ArrayList<>(this.books);
        Collections.sort(sortedCopy);
        return sortedCopy;
    }

}