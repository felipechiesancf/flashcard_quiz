package com.example.flashcard_quiz;

import java.util.ArrayList;

public class FlashcardDeck {
    private ArrayList<Flashcard> cards;
    private int currentIndex;

    public FlashcardDeck() {
        cards = new ArrayList<>();
        currentIndex = 0;
    }

    public void loadCards() {
        cards.add(new Flashcard("What is the capital of France?",
                new String[]{"Marseille", "Paris", "Versailles", "Rome"}, 1));
        cards.add(new Flashcard("What is the capital of Italy?",
                new String[]{"Firenze", "Milan", "Rome", "Venice"}, 2));
        cards.add(new Flashcard("What is the capital of England?",
                new String[]{"London", "Manchester", "Glasgow", "Dublin"}, 0));
        cards.add(new Flashcard("What is the capital of Canada?",
                new String[]{"Toronto", "Montreal", "Vancouver", "Ottawa"}, 3));
        cards.add(new Flashcard("What is the capital of Spain?",
                new String[]{"Barcelona", "Valencia", "Bilbao", "Madrid"}, 3));
        cards.add(new Flashcard("What is the capital of Russia?",
                new String[]{"Moscow", "Saint Petersburg", "Sochi", "Baku"}, 0));
        cards.add(new Flashcard("What is the capital of Brazil?",
                new String[]{"Rio de Janeiro", "Porto Alegre", "Brasilia", "Lisbon"}, 2));
        cards.add(new Flashcard("What is the capital of Australia?",
                new String[]{"Melbourne", "Canberra", "Auckland", "Sidney"}, 1));
        cards.add(new Flashcard("What is the capital of Argentina?",
                new String[]{"La Plata", "Cordoba", "Rosario", "Buenos Aires"}, 3));
        cards.add(new Flashcard("What is the capital of the United States?",
                new String[]{"Washington D.C.", "New York", "Boston", "San Francisco"}, 0));
        cards.add(new Flashcard("What is the capital of Germany?",
                new String[]{"Munich", "Hamburg", "Berlin", "Frankfurt"}, 2));
    }

    public Flashcard getCurrentCard() {
        return cards.get(currentIndex);
    }

    public void nextCard() {
        currentIndex = (currentIndex + 1) % cards.size();
    }

    public boolean isLastCard() {
        return currentIndex == cards.size() - 1;
    }

    public boolean isAtLastCard() {
        return isLastCard();
    }

    public boolean finished() {
        return currentIndex == 0;
    }

    public void restart() {
        currentIndex = 0;
    }
}



