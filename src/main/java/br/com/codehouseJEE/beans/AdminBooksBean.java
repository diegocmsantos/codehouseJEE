package br.com.codehouseJEE.beans;

import br.com.codehouseJEE.daos.AuthorDAO;
import br.com.codehouseJEE.daos.BookDAO;
import br.com.codehouseJEE.models.Author;
import br.com.codehouseJEE.models.Book;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class AdminBooksBean {

    private Book book = new Book();
    private List<Integer> authorsId = new ArrayList<>();

    @Inject
    private BookDAO bookDAO;

    @Inject
    private AuthorDAO authorDAO;

    @Transactional
    public void save() {

        for(Integer authorId : authorsId){
            book.getAuthors().add(new Author(authorId));
        }

        bookDAO.save(book);

        System.out.println("book saved: " + book);

        this.book = new Book();
        this.authorsId = new ArrayList<>();
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Author> getAuthors(){
        return authorDAO.findAll();
    }

    public List<Integer> getAuthorsId() {
        return authorsId;
    }

    public void setAuthorsId(List<Integer> authorsId) {
        this.authorsId = authorsId;
    }
}
