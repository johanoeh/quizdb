/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.havero.services.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author johan
 */
public class SimpleManager {
    
        private final String PU ="se.havero_QUIZ_PU"; 
        private final EntityManagerFactory entityManagerFactory;
        private final EntityManager entityManager;
        
        public SimpleManager(){
            entityManagerFactory = Persistence.createEntityManagerFactory(PU);
            entityManager = entityManagerFactory.createEntityManager();           
        }

        public EntityManager getEntityManager() {
            return entityManager;
        }
        
        public void commit(){
            entityManager.getTransaction().commit();
        }
        
        public void begin(){
            entityManager.getTransaction().begin();
        }
        
        public void close(){
            entityManager.close();
            entityManagerFactory.close();
        }      
    }
