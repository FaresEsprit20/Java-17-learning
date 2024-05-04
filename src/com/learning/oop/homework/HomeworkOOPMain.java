package com.learning.oop.homework;

import com.learning.oop.homework.entities.Author;
import com.learning.oop.homework.entities.Book;
import com.learning.oop.homework.entities.CoverType;
import com.learning.oop.homework.entities.Publisher;
import com.learning.oop.homework.services.BookService;
import com.learning.oop.homework.services.BookServiceImpl;

import java.math.BigDecimal;

public class HomeworkOOPMain {


    public static void main(String... args) {


        Book[] books = new Book[] {
                new Book(1, "Book_1", new Author[] { new Author(1, "Jon", "Johnson") }, new Publisher(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),

                new Book(2, "Book_2", new Author[] { new Author(1, "Jon", "Johnson"), new Author(2, "William", "Wilson") }, new Publisher(2, "Publisher_2"), 2000, 120, BigDecimal.valueOf(14.99), CoverType.PAPERBACK),

                new Book(3, "Book_3", new Author[] { new Author(3, "Walter", "Peterson") }, new Publisher(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverType.HARDCOVER),


                new Book(4, "Book_4", new Author[] { new Author(4, "Craig", "Gregory") }, new Publisher(3, "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverType.PAPERBACK) };

        BookService bookService = new BookServiceImpl();


        Book[] filteredBooksByAuthor = bookService.filterBooksByAuthor(new Author(1, "Jon", "Johnson"),books);

        Book[] filteredBooksByPublisher = bookService.filterBooksByPublisher(new Publisher(1, "Publisher_1"),books);

        Book[] filteredBooksByAfterYear = bookService.filterBooksAfterSpecifiedYear(1998,books);

        //displaying filtered books by author
        System.out.println("\n Books by Author :  \n");
        for (Book value : filteredBooksByAuthor) {
            if(value != null)
            System.out.println(value.toString());
            System.out.println();
        }

        //displaying filtered books by publisher
        System.out.println("\n Books by Publisher :  \n");
        for (Book book : filteredBooksByPublisher) {
            if (book != null)
                System.out.println(book.toString());
            System.out.println();
        }

        //displaying filtered books after specified year
        System.out.println("\n Books After specified Year :  \n");
        for (Book book : filteredBooksByAfterYear) {
            if(book!= null)
            System.out.println(book.toString());
            System.out.println();
        }


    }


}
