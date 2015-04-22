package com.example;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Dependent
public class EntityManagerFactoryProducer {
    @PersistenceContext(name = "myPU")
    EntityManager entityManager;

    @Produces
    @RequestScoped
    public EntityManager createEntityManager() {
        return entityManager;
    }
}
