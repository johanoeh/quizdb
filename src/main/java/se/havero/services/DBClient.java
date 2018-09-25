/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.havero.services;

import se.havero.test.AnswerTester;
import se.havero.test.QuestionTester;
import se.havero.test.QuizTester;


/**
 *
 * @author johan
 */
public class DBClient {

    
    
    public static void main(String[] args) {
        QuizTester quizTester = new QuizTester();
        quizTester.test();
        QuestionTester questionTester = new QuestionTester();
        questionTester.test();
        AnswerTester answerTester = new AnswerTester();
        answerTester.test();
    }    
}
