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
        for(Book book : filteredBooksByAuthor) {
            System.out.println("\n Books by Author :  \n");
            System.out.println(book.toString());
            System.out.println();
        }

        //displaying filtered books by publisher
        for(Book book : filteredBooksByPublisher) {
            System.out.println("\n Books by Publisher :  \n");
            System.out.println();
            System.out.println(book.toString());
            System.out.println();
        }

        //displaying filtered books after specified year
        for(Book book : filteredBooksByAfterYear) {
            System.out.println("\n Books After specified Year :  \n");
            System.out.println(book.toString());
            System.out.println();
        }


    }


}
