/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.havero.test;

import java.util.ArrayList;
import java.util.List;
import se.havero.quizdb.Answer;
import se.havero.quizdb.Question;
import se.havero.quizdb.Quiz;

/**
 *
 * @author johan
 */
public class TestData {
    
    public static final List<Quiz> quizList= new ArrayList<Quiz>(){
        { 
            add(new Quiz(new Long(1),"Basic Java Quiz"));
            add(new Quiz(new Long(2),"Java persistence API (JPA)"));
        }
    };
    
        /*List of Question objects to be inserted into database*/
    public static final List<Question> questions = new ArrayList<Question>() {
        {

            add(new Question(new Long(1), "What of the following is correct about a final Method in Java"));
            add(new Question(new Long(2), "What of the following is correct about a static Method in Java "));
            add(new Question(new Long(3), "What of the following is correct about an abstract Class in Java"));
            add(new Question(new Long(4), "What of the following is correct about an Interface in Java"));
            add(new Question(new Long(5), "what is the correct syntax for performing an import in Java"));
            add(new Question(new Long(6), "What of the following is correct about a protected member variable in Java"));
            add(new Question(new Long(7), "What is the default Access for a variable declared in Java "));
            add(new Question(new Long(8), "What of the following is correct about String concatenation in Java"));
            add(new Question(new Long(9), "What of the following is the correct about exceptions in Java"));
            add(new Question(new Long(10), "What of the following is the correct Syntax for declaring a method in Java"));
        }
    };
    

    public static final List<Answer> answerList01 = new ArrayList<Answer>() {
        {
            add(new Answer(new Long(1), "The method can't be overriden", true));
            add(new Answer(new Long(2), "The method can be overloaded", true));
            add(new Answer(new Long(3), "The method can be overridden but we need to add @Override annotation to do so", false));
        }
    };

    public static final List<Answer> answerList02 = new ArrayList<Answer>() {
        {
            add(new Answer(new Long(4), "", true));
            add(new Answer(new Long(5), "", true));
            add(new Answer(new Long(6), "", true));
        }
    };

    public static final List<Answer> answerList03 = new ArrayList<Answer>() {
        {
            add(new Answer(new Long(7), "", true));
            add(new Answer(new Long(8), "", true));
            add(new Answer(new Long(9), "", true));
        }
    };

    public static final List<Answer> answerList04 = new ArrayList<Answer>() {
        {
            add(new Answer(new Long(10), "", true));
            add(new Answer(new Long(11), "", true));
            add(new Answer(new Long(12), "", true));
        }
    };

    public static final List<Answer> answerList05 = new ArrayList<Answer>() {
        {
            add(new Answer(new Long(13), "", true));
            add(new Answer(new Long(14), "", true));
            add(new Answer(new Long(15), "", true));
        }
    };

    public static final List<Answer> answerList06 = new ArrayList<Answer>() {
        {
            add(new Answer(new Long(16), "", true));
            add(new Answer(new Long(17), "", true));
            add(new Answer(new Long(18), "", true));
        }
    };

    public static final List<Answer> answerList07 = new ArrayList<Answer>() {
        {
            add(new Answer(new Long(19), "", true));
            add(new Answer(new Long(20), "", true));
            add(new Answer(new Long(21), "", true));
        }
    };

    public static final List<Answer> answerList08 = new ArrayList<Answer>() {
        {
            add(new Answer(new Long(22), "", true));
            add(new Answer(new Long(23), "", true));
            add(new Answer(new Long(24), "", true));
        }
    };

    public static final List<Answer> answerList09 = new ArrayList<Answer>() {
        {
            add(new Answer(new Long(25), "", true));
            add(new Answer(new Long(26), "", true));
            add(new Answer(new Long(27), "", true));
        }
    };

    public static final List<Answer> answerList10 = new ArrayList<Answer>() {
        {
            add(new Answer(new Long(28), "", true));
            add(new Answer(new Long(29), "", true));
            add(new Answer(new Long(30), "", true));
        }
    };
 
    
}
