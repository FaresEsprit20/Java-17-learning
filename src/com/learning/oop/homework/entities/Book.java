package com.learning.oop.homework.entities;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {

    private int id;
    private String name;
    private int publishingYear;
    private int amountOfPages;
    private BigDecimal price;
    private Author[] authors;
    private Publisher publisher;
    private CoverType coverType;

    public Book() {
    }





    public Book(int id, String name, int publishingYear, int amountOfPages, BigDecimal price, Author[] authors, Publisher publisher, CoverType coverType) {
        this.id = id;
        this.name = name;
        this.publishingYear = publishingYear;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.authors = authors;
        this.publisher = publisher;
        this.coverType = coverType;
    }

    public Book(int id, String name, Author[] authors, Publisher publisher, int publishingYear, int amountOfPages, BigDecimal price, CoverType coverType) {
        this.id = id;
        this.name = name;
        this.publishingYear = publishingYear;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.authors = authors;
        this.publisher = publisher;
        this.coverType = coverType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && publishingYear == book.publishingYear && amountOfPages == book.amountOfPages && Objects.equals(name, book.name) && Objects.equals(price, book.price) && Arrays.equals(authors, book.authors) && Objects.equals(publisher, book.publisher) && coverType == book.coverType;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, publishingYear, amountOfPages, price, publisher, coverType);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishingYear=" + publishingYear +
                ", amountOfPages=" + amountOfPages +
                ", price=" + price +
                ", authors=" + Arrays.toString(authors) +
                ", publisher=" + publisher +
                ", coverType=" + coverType +
                '}';
    }



}
