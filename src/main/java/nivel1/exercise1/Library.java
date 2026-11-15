package nivel1.exercise1;

import java.util.ArrayList;
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
}