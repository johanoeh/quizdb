
package se.havero.services.data;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import se.havero.quizdb.Quiz;

/**
 *
 * @author johan
 */
public class QuizDAO extends DAO {

    /**
     * Used to persistently create store  Quiz 
     * @param quiz the Quiz to create
     */
    public void create(Quiz quiz) {

        SimpleManager manager = new SimpleManager();
        EntityManager entityManager = manager.getEntityManager();
        manager.begin();
        entityManager.persist(quiz);
        manager.commit();
        manager.close();

    }

    public List<Quiz> readAll() {
        
        SimpleManager manager = new SimpleManager();
        EntityManager entityManager = manager.getEntityManager();
        manager.begin();
        TypedQuery<Quiz> query = entityManager.createNamedQuery(FIND_ALL_QUIZZES, Quiz.class);
        List<Quiz> resultList = query.getResultList();
        manager.close();
        return resultList;
    }

    public Quiz readQuiz(long id) {
        
        SimpleManager manager = new SimpleManager();
        EntityManager entityManager = manager.getEntityManager();
        manager.begin();
        TypedQuery<Quiz> query = entityManager.createNamedQuery(FIND_QUIZ_BY_ID, Quiz.class);
        Quiz quiz = query.getSingleResult();
        return quiz;
    }

    public void update(Quiz quiz) {
        
        SimpleManager manager = new SimpleManager();
        EntityManager entityManager = manager.getEntityManager();
        manager.begin();
        TypedQuery<Quiz> query = entityManager.createNamedQuery(FIND_QUIZ_BY_ID, Quiz.class);
        query.setParameter("id", quiz.getId());
        Quiz quizToUpdate = query.getSingleResult();
        quizToUpdate.setName(quiz.getName());
        entityManager.persist(quizToUpdate);
        manager.commit();
        manager.close();
        

    }
    
    
    public void delete(long id) {
        
        SimpleManager manager = new SimpleManager();
        EntityManager entityManager = manager.getEntityManager();
        manager.begin();
        TypedQuery<Quiz> query = entityManager.createNamedQuery(FIND_QUIZ_BY_ID, Quiz.class);
        query.setParameter("id", id);
        Quiz quiz = query.getSingleResult();
        entityManager.remove(quiz);
        manager.commit();
    }

}
