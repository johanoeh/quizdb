package se.havero.test;

import java.util.List;
import se.havero.quizdb.Answer;
import se.havero.services.data.AnswerDAO;

/**
 * Tests the basic crud functionality of
 * AnswerDAO
 * @author johan
 */
public class AnswerTester implements Tester {

    private AnswerDAO aDAO;

    public AnswerTester() {

        aDAO = new AnswerDAO();
    }

    @Override
    public void test() {
        create();
        read();
        update();
        readAll();
        delete();
        read();
    }

    @Override
    public void create() {
        System.out.println(PrinterFormatter.APP_INFO + "Creating answers");
        for (Answer answer : TestData.answerList01) {
            aDAO.create(answer);
        }
    }

    @Override
    public void read() {
        System.out.println(PrinterFormatter.APP_INFO + "Reading answers");
        for (Answer answer : TestData.answerList01) {
            Answer readAnswer = aDAO.read(answer.getId());
            if (readAnswer != null) {
                PrinterFormatter.print(readAnswer);
            }
        }
    }

    @Override
    public void update() {
        System.out.println(PrinterFormatter.APP_INFO + "updating answers");
        for (Answer answer : TestData.answerList01) {
            answer.setText(answer.getText().toUpperCase());
            aDAO.update(answer);
        }
    }

    @Override
    public void delete() {
        System.out.println(PrinterFormatter.APP_INFO + "Deleting answers");
        for (Answer answer : TestData.answerList01) {
            aDAO.delete(answer.getId());
        }

    }

    @Override
    public void readAll() {
        System.out.println(PrinterFormatter.APP_INFO + "Reading all answers");
        List<Answer> answers = aDAO.readAll();
        for (Answer answer : answers) {
            PrinterFormatter.print(answer);
        }
    }
}
