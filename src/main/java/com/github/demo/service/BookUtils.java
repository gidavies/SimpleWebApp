package com.github.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.github.demo.model.Book;

public class BookUtils {

    public static List<Book> getSampleBooks() {
        List<Book> books = new ArrayList<Book>(6);

        books.add(new Book("Jeff Sutherland","Scrum: The Art of Doing Twice the Work in Half the Time", "scrum.jpg"));
        books.add(new Book("Eric Ries","The Lean Startup: How Constant Innovation Creates Radically Successful Businesses", "lean.jpg"));
        books.add(new Book("Geoffrey A. Moore","Crossing the Chasm", "chasm.jpg"));
        books.add(new Book("David Thomas","The Pragmatic Programmer: From Journeyman to Master", "pragmatic.jpg"));
        books.add(new Book("Frederick P. Brooks Jr.", "The Mythical Man-Month: Essays on Software Engineering", "month.jpg"));
        books.add(new Book("Steve Krug","Don't Make Me Think, Revisited: A Common Sense Approach to Web Usability", "think.jpg"));

        return books;
    }

    // filter by Author
    public static List<Book> filterByAuthor(List<Book> books, String author) {
        List<Book> filteredBooks = new ArrayList<Book>();

        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }

    // filter by Title
    public static List<Book> filterByTitle(List<Book> books, String title) {
        List<Book> filteredBooks = new ArrayList<Book>();

        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }

    // filter by Author and Title
    public static List<Book> filterByAuthorAndTitle(List<Book> books, String author, String title) {
        List<Book> filteredBooks = new ArrayList<Book>();

        for (Book book : books) {
            if (book.getAuthor().equals(author) && book.getTitle().equals(title)) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }

    public static void addBook(List<Book> books, Book book) {
        books.add(book);
    }

    public static void removeBook(List<Book> books, Book book) {
        books.remove(book);
    }

    public static void updateBook(List<Book> books, Book book) {
        for (Book b : books) {
            if (b.getId() == book.getId()) {
                b.setAuthor(book.getAuthor());
                b.setTitle(book.getTitle());
                b.setImage(book.getImage());
            }
        }
    }

    
}
