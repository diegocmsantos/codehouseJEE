package br.com.codehouseJEE.beans;

import br.com.codehouseJEE.models.Book;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class AdminBooksBean {

    private Book book = new Book();

    public void save() {
        System.out.println("teste");
        System.out.println("book: " + book);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
