package br.com.codehouseJEE.daos;

import br.com.codehouseJEE.models.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class AuthorDAO {

    @PersistenceContext
    private EntityManager manager;

    public List<Author> findAll() {
        return manager.createQuery("select a from Author a", Author.class).getResultList();
    }

}
