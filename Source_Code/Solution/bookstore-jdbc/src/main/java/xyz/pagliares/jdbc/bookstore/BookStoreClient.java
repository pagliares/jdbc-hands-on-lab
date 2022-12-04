package xyz.pagliares.jdbc.bookstore;

import xyz.pagliares.jdbc.bookstore.domain.Book;
import xyz.pagliares.jdbc.bookstore.domain.Chapter;
import xyz.pagliares.jdbc.bookstore.domain.Publisher;
import xyz.pagliares.jdbc.bookstore.controller.BookController;

import java.util.ArrayList;
import java.util.List;

public class BookStoreClient {
    public static void main(String[] args) {
        BookController bookController = new BookController();

        //persisting object graph
        Publisher publisher = new Publisher("Artech House");

        Book book = new Book("158053791X", "A Practitioner's Guide to Software Test Design ", publisher);

        List<Chapter> chapters = new ArrayList<Chapter>();
        Chapter chapter1 = new Chapter("The Testing Process", 1);
        Chapter chapter2 = new Chapter("Case Studies", 2);
        Chapter chapter3 = new Chapter("Equivalence Class Testing", 3);
        Chapter chapter4 = new Chapter("Boundary Value Testing", 4);
        Chapter chapter5 = new Chapter("Decision Table Testing", 5);
        Chapter chapter6 = new Chapter("Pairwise Testing", 6);
        Chapter chapter7 = new Chapter("State-Transition Testing", 7);
        Chapter chapter8 = new Chapter("Domain Analysis Testing", 8);
        Chapter chapter9 = new Chapter("Use Case Testing", 9);
        Chapter chapter10 = new Chapter("Control Flow Testing", 10);
        Chapter chapter11 = new Chapter("Data Flow Testing", 11);
        Chapter chapter12 = new Chapter("Scripted Testing", 12);
        Chapter chapter13 = new Chapter("Exploratory Testing", 13);
        Chapter chapter14 = new Chapter("Test Planning", 14);
        Chapter chapter15 = new Chapter("Defects Taxonomy", 15);
        Chapter chapter16 = new Chapter("When Stop Testing", 16);

        chapters.add(chapter1);
        chapters.add(chapter2);
        chapters.add(chapter3);
        chapters.add(chapter4);
        chapters.add(chapter5);
        chapters.add(chapter6);
        chapters.add(chapter7);
        chapters.add(chapter8);
        chapters.add(chapter9);
        chapters.add(chapter10);
        chapters.add(chapter11);
        chapters.add(chapter12);
        chapters.add(chapter13);
        chapters.add(chapter14);
        chapters.add(chapter15);
        chapters.add(chapter16);

        book.setChapters(chapters);

        bookController.persistBook(book);

        //retrieving object graph
        book = bookController.retrieveBook("158053791X");
		System.out.println(book);
    }
}
