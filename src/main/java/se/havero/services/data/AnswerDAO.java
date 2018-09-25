/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.havero.services.data;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import se.havero.quizdb.Answer;

/**
 *
 * @author johan
 */
public class AnswerDAO extends DAO {
    
    /**
     * Creates and persistently stores Answer Object
     * @param answer the answer to create
     */
    public void create(Answer answer) {
        SimpleManager manager = new SimpleManager();
        EntityManager entityManager = manager.getEntityManager();
        manager.begin();
        entityManager.persist(answer);
        manager.commit();
        manager.close();
    }
    
    /**
     *
     * @param id
     * @return
     */
    public Answer read(final long id){
        SimpleManager manager = new SimpleManager();
        EntityManager entityManager = manager.getEntityManager();
        Answer answer = entityManager.find(Answer.class, id);
        entityManager.close();
        return answer;
    }
    
    public List<Answer> readAll(){
        
        SimpleManager manager = new SimpleManager();
        EntityManager entityManager = manager.getEntityManager();
        TypedQuery<Answer> query = entityManager.createNamedQuery(Answer.SELECT_ALL, Answer.class);
        List<Answer> resultList = query.getResultList();
        manager.close();
        return resultList;
    }
    
    public void update(Answer answer){
        SimpleManager manager = new SimpleManager();
        EntityManager entityManager = manager.getEntityManager();
        manager.begin();
        Answer answerToUpdate = entityManager.find(Answer.class, answer.getId());
        answerToUpdate.setCorrectAnswer(answer.isCorrectAnswer());
        answerToUpdate.setText(answer.getText());
        entityManager.persist(answerToUpdate);
        manager.commit();
        manager.close();
    }
    
    public void delete(final long id) {
        SimpleManager manager = new SimpleManager();
        EntityManager entityManager = manager.getEntityManager();
        manager.begin();
        Answer answer = entityManager.find(Answer.class, id);
        entityManager.remove(answer);
        manager.commit();
        manager.close();
    }
    
}
