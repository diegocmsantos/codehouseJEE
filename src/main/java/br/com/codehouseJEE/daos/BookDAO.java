package br.com.codehouseJEE.daos;

import br.com.codehouseJEE.models.Book;

import javax.persistence.EntityManager;

public class BookDAO {

    private EntityManager manager;

    public void save(Book book) {
        manager.persist(book);
    }

}
