package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //given
        Book book1 = new Book("qaz", "wsx", LocalDate.of(2020, 12, 12));
        Book book2 = new Book("edc", "rfv", LocalDate.of(1234, 12, 12));
        Book book3 = new Book("tgb", "yhn", LocalDate.of(1456, 12, 23));

        Library library = new Library("library1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow copy
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library Clone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library DeepClone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //then
        System.out.println(library);
        System.out.println(cloneLibrary);
        assertEquals(3, cloneLibrary.getBooks().size());
        System.out.println(deepCloneLibrary);
        assertEquals(3, deepCloneLibrary.getBooks().size());


    }
}

