package se.havero.test;
import se.havero.quizdb.Question;
import se.havero.services.data.QuestionDAO;

/**
 *
 * @author johan
 * Test the basic crud operations (create read update delete) of the QuestionDAO
 * class.
 */
public class QuestionTester implements Tester {


    //provides crud operations on Question objects
    private QuestionDAO qDAO;
    
    /**
     *Performs the basic test of crud operations
     */
    @Override
    public void test(){
        create();
        read();
        update();
        read();
        delete();
        read();
    }

  
    public QuestionTester() {
        qDAO = new QuestionDAO();
    }

    @Override
    public void create() {
        System.out.println(PrinterFormatter.APP_INFO+"Creating questions");
        for (Question question : TestData.questions) {
            qDAO.createQuestion(question);
        }
    }

    @Override
    public void read() {
        System.out.println(PrinterFormatter.APP_INFO+"Reading questions using id ");
        for (Question question : TestData.questions) {
            Question readQuestion = qDAO.readQuestion(question.getId());
            if (readQuestion != null) {
                PrinterFormatter.print(readQuestion);
            }
        }
    }

    @Override
    public void update() {
        System.out.println(PrinterFormatter.APP_INFO+"Updating questions");
        for (Question question : TestData.questions) {
            question.setText(question.getText().toUpperCase());
            qDAO.update(question);
        }
    }

    @Override
    public void delete() {
        System.out.println(PrinterFormatter.APP_INFO+"Deleting questions!");
        for (Question question : TestData.questions) {
            qDAO.delete(question.getId());
        }
    }

    @Override
    public void readAll() {
        System.out.println(PrinterFormatter.APP_INFO+"Reading all questions ");
        
    }
}
