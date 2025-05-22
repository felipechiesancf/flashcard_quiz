package com.example.flashcard_quiz;

public class Flashcard {
    private String question;
    private String[] options;
    private int correctIndex;

    public Flashcard(String question, String[] options, int correctIndex) {
        this.question = question;
        this.options = options;
        this.correctIndex = correctIndex;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectIndex() {
        return correctIndex;
    }
}




