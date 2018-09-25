/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.havero.test;

import se.havero.quizdb.Answer;
import se.havero.quizdb.Question;
import se.havero.quizdb.Quiz;

/**
 *
 * @author johan
 */
public class PrinterFormatter {

    public static final String APP_INFO = "[App Info] ";

    public static void print(Question question) {
        System.out.println(APP_INFO + "id: " + question.getId() + ", text: " + question.getText());
    }

    public static void print(Answer answer) {
        System.out.println(APP_INFO + "id: " + answer.getId() + ", text: " + answer.getText() + ", iscorrect: " + answer.isCorrectAnswer());
    }

    public static void print(Quiz quiz) {
        System.out.println(APP_INFO+"quiz id:" + quiz.getId() + " quiz name: " + quiz.getName());
    }

}
