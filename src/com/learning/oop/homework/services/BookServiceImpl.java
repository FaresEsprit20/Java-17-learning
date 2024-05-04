package com.learning.oop.homework.services;

import com.learning.oop.homework.entities.Author;
import com.learning.oop.homework.entities.Book;
import com.learning.oop.homework.entities.Publisher;

import java.util.Arrays;

public class BookServiceImpl implements BookService {


    @Override
    public Book[] filterBooksByAuthor(Author author, Book[] books) {
     Book[] filteredBooks = new Book[books.length];
            for(Book book: books) {
                for(Author j : book.getAuthors()) {
                   if(j.equals(author)) {
                       Arrays.fill(filteredBooks,book);
                   }
                }
            }
            return filteredBooks;
    }

    @Override
    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
        Book[] filteredBooks = new Book[books.length];
        for(Book book: books) {
                if(book.getPublisher().equals(publisher)) {
                    Arrays.fill(filteredBooks,book);
                }
        }
        return filteredBooks;
    }

    @Override
    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        Book[] filteredBooks = new Book[books.length];
        for(Book book: books) {
            if(book.getPublishingYear() > yearFromInclusively) {
                Arrays.fill(filteredBooks,book);
            }
        }
        return filteredBooks;
    }



}
