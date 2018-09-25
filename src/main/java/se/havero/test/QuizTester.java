
package se.havero.test;

import java.util.List;
import se.havero.quizdb.Quiz;
import se.havero.services.data.QuizDAO;
import static se.havero.test.PrinterFormatter.print;

/**
 *
 * @author johan
 */
public class QuizTester implements Tester{

    private QuizDAO quizDAO;

    public QuizTester() {
        quizDAO = new QuizDAO();
    }

    @Override
    public void test() {

        create();
        readAll();
        update();
        readAll();
        delete();
        readAll();
    }

    /* Methods used to test the basic CRUD operations for QuizDAO*/
    
    @Override
    public void create() {
        System.out.println(PrinterFormatter.APP_INFO+"Creating Quizzes");
        for (Quiz quiz : TestData.quizList) {
            quizDAO.create(quiz);
        }
    }

    @Override
    public void readAll() {
        
        System.out.println(PrinterFormatter.APP_INFO+"Reading quizzes");
        List<Quiz> quizList = quizDAO.readAll();
        if (quizList.isEmpty()) {
            System.out.println(PrinterFormatter.APP_INFO+"Result list is emtpy!!! ");
        }
        for (Quiz quiz : quizList) {
            print(quiz);
        }
    }

    @Override
    public void read() {
        System.out.println(PrinterFormatter.APP_INFO+"Reading quizzes by id");
        for (Quiz quiz : TestData.quizList) {
            print(quizDAO.readQuiz(quiz.getId()));
        }
    }

    @Override
    public void update() {
        System.out.println(PrinterFormatter.APP_INFO+"Updating Quizzes");
        for (Quiz quiz : TestData.quizList) {
            quiz.setName(quiz.getName().toUpperCase());
            quizDAO.update(quiz);
        }
    }

    @Override
    public void delete() {
        System.out.println(PrinterFormatter.APP_INFO+"Deleting Quizzes");
        for(Quiz quiz : TestData.quizList) {
            quizDAO.delete(quiz.getId());
        }
    }


}
