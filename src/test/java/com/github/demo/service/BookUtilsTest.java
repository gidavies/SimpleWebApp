package com.github.demo.service;

import com.github.demo.model.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class BookUtilsTest {
    // Test filter bu Author
    @Test
    public void testFilterByAuthor() {
        List<Book> books = BookUtils.getSampleBooks();
        List<Book> filteredBooks = BookUtils.filterByAuthor(books, "Jeff Sutherland");
        assertEquals(1, filteredBooks.size());
        assertEquals("Jeff Sutherland", filteredBooks.get(0).getAuthor());
    }
    
}