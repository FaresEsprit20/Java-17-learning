package com.learning.oop.homework.services;

import com.learning.oop.homework.entities.Author;
import com.learning.oop.homework.entities.Book;
import com.learning.oop.homework.entities.Publisher;

import java.util.Arrays;

public class BookServiceImpl implements BookService {


    @Override
    public Book[] filterBooksByAuthor(Author author, Book[] books) {
        Book[] filteredBooks = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            boolean authorFound = false; // Flag to track if the author is found for the current book
            for (Author bookAuthor : books[i].getAuthors()) {
                if (author.getId() == bookAuthor.getId()) {
                    // If the author matches, set the flag to true and break out of the loop
                    authorFound = true;
                    break;
                }
            }
            // If the author is found, assign the book to the corresponding index, otherwise set it to null
            filteredBooks[i] = authorFound ? books[i] : null;
        }
        return filteredBooks;
    }


    @Override
    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
        Book[] filteredBooks = new Book[books.length];
        for(int i = 0;i<books.length;i++) {
                if(books[i].getPublisher().equals(publisher)) {
                    filteredBooks[i] = books[i];
                }else {
                    filteredBooks[i] = null;
                }
        }
        return filteredBooks;
    }

    @Override
    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        Book[] filteredBooks = new Book[books.length];
        for(int i = 0;i<books.length;i++) {
            if(books[i].getPublishingYear() > yearFromInclusively) {
                filteredBooks[i] = books[i];
            }else {
                filteredBooks[i] = null;
            }
        }
        return filteredBooks;
    }



}
