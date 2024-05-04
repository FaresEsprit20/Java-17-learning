package com.learning.oop.homework.services;

import com.learning.oop.homework.entities.Author;
import com.learning.oop.homework.entities.Book;
import com.learning.oop.homework.entities.Publisher;

public interface BookService {


    public Book[] filterBooksByAuthor(Author author, Book[] books);

    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books);

    // methods keeps books with publishing year inclusively.
    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books);




}
