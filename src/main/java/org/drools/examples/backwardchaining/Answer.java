package org.drools.examples.backwardchaining;

public class Answer {
    public Question question;
    public String answer;

    public Answer(Question question, String answer) {
        this.question = question;
        this.answer = answer;
    }
}
