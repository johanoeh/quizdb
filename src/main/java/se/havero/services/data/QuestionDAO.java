/*
 * 
 */
package se.havero.services.data;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import se.havero.quizdb.Question;

/**
 *
 * @author johan
 * provides methods used to persistently store, access, update and delete Questions objects
 * from database.
 */
public class QuestionDAO extends DAO {
   

    /**
     * Creates a question
     * @param question the question to create
     */
    public void createQuestion(Question question) {
        
        SimpleManager manager = new SimpleManager();
        EntityManager entityManager= manager.getEntityManager();
        manager.begin();
        entityManager.persist(question);
        manager.commit();
        manager.close();
    }
    
    /**
     *
     * @param id
     * @return
     */
    public Question readQuestion(final long id){
        
        SimpleManager manager  = new SimpleManager();
        EntityManager entityManager = manager.getEntityManager();
        Question question = entityManager.find(Question.class, id);
        manager.close();
        return question;
    }
    
    /**
     *
     * @return
     */
    public List<Question> readAll(){
        
        SimpleManager manager = new SimpleManager();
        EntityManager entityManager = manager.getEntityManager();
        TypedQuery<Question> namedQuery = entityManager.createNamedQuery(Question.READ_ALL, Question.class);
        List<Question> resultList = namedQuery.getResultList();      
        manager.close();
   
        return resultList;
 
    }
      
    /**
     *
     * @param question
     */
    public void update(Question question){
        
        SimpleManager manager = new SimpleManager();
        EntityManager entityManager = manager.getEntityManager();
        manager.begin();
        Question questionToUpdate = entityManager.find(Question.class, question.getId());
        questionToUpdate.setText(question.getText());
        entityManager.persist(questionToUpdate);
        manager.commit();
        manager.close();
 
    }
    
    /**
     *
     * @param id
     */
    public void delete(final long id){ 
        
        SimpleManager manager = new SimpleManager();
        EntityManager entityManager= manager.getEntityManager();
        manager.begin();
        Question question = entityManager.find(Question.class, id);
        entityManager.remove(question);
        manager.commit();
        manager.close();
  
    }    
 
}
