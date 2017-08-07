package br.com.codehouseJEE.daos;

import br.com.codehouseJEE.models.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BookDAO {

    @PersistenceContext
    private EntityManager manager;

    public void save(Book book) {
        manager.persist(book);
    }

}
