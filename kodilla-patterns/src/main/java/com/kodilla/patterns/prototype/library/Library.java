package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype<Library> {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library deepCloneLibrary = super.clone();
        deepCloneLibrary.books = new HashSet<>();
        for (Book book : books) {
            Book cloneBook = new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate());
            deepCloneLibrary.getBooks().add(cloneBook);
        }
        return deepCloneLibrary;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
