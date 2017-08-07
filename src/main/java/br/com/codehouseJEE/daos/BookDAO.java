package br.com.codehouseJEE.daos;

import br.com.codehouseJEE.models.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BookDAO {

    @PersistenceContext
    private EntityManager manager;

    public void save(Book book) {
        manager.persist(book);
    }

    public List<Book> list() {
        String jpql = "select distinct(b) from Book b join fetch b.authors";
        return manager.createQuery(jpql, Book.class).getResultList();
    }

}
