package br.com.codehouseJEE.beans;

import br.com.codehouseJEE.daos.BookDAO;
import br.com.codehouseJEE.models.Book;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Model
public class adminBooksListBean {

    @Inject
    private BookDAO bookDAO;

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return bookDAO.list();
    }
}
