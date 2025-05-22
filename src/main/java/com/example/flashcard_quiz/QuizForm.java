package com.example.flashcard_quiz;

import javax.swing.*;
import java.awt.*;

public class QuizForm {
    private JPanel mainPanel;
    private JLabel questionLabel;
    private JButton optionAButton;
    private JButton optionBButton;
    private JButton optionCButton;
    private JButton optionDButton;
    private JLabel feedbackLabel;
    private JButton nextButton;

    private FlashcardDeck deck;
    private boolean answered;
    private int errorCount;

    public QuizForm() {
        deck = new FlashcardDeck();
        deck.loadCards();
        errorCount = 0;
        updateCard();

        optionAButton.addActionListener(e -> checkAnswer(0));
        optionBButton.addActionListener(e -> checkAnswer(1));
        optionCButton.addActionListener(e -> checkAnswer(2));
        optionDButton.addActionListener(e -> checkAnswer(3));

        nextButton.addActionListener(e -> {
            if (deck.isAtLastCard() && answered) {
                JOptionPane.showMessageDialog(mainPanel,
                        "Quiz finished!\nTotal errors: " + errorCount,
                        "Results",
                        JOptionPane.INFORMATION_MESSAGE);
                deck.restart();
                errorCount = 0;
                nextButton.setText("Next");
            } else {
                deck.nextCard();
            }
            updateCard();
        });
    }

    private void updateCard() {
        Flashcard card = deck.getCurrentCard();
        questionLabel.setText(card.getQuestion());
        optionAButton.setText(card.getOptions()[0]);
        optionBButton.setText(card.getOptions()[1]);
        optionCButton.setText(card.getOptions()[2]);
        optionDButton.setText(card.getOptions()[3]);
        feedbackLabel.setText("");
        feedbackLabel.setForeground(Color.BLACK);
        answered = false;
        enableOptionButtons(true);
    }

    private void checkAnswer(int selectedIndex) {
        if (answered) return;

        int correctIndex = deck.getCurrentCard().getCorrectIndex();
        if (selectedIndex == correctIndex) {
            feedbackLabel.setText("Correct!");
            feedbackLabel.setForeground(new Color(0, 128, 0)); // Green
        } else {
            feedbackLabel.setText("Incorrect.");
            feedbackLabel.setForeground(Color.RED);
            errorCount++;
        }

        answered = true;
        enableOptionButtons(false);

        if (deck.isAtLastCard()) {
            nextButton.setText("Finish");
        }
    }

    private void enableOptionButtons(boolean enable) {
        optionAButton.setEnabled(enable);
        optionBButton.setEnabled(enable);
        optionCButton.setEnabled(enable);
        optionDButton.setEnabled(enable);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flashcard Quiz");
        frame.setContentPane(new QuizForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


