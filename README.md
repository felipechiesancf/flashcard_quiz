# Flashcard Quiz App

This is a simple Java Swing desktop application that simulates a flashcard quiz game with multiple choice questions.

The app was built using IntelliJ IDEA and the GUI Designer (`.form` file) with a focus on **object-oriented programming (OOP)** principles and clean code.

---

## Features

- 4 multiple choice options per question  
- 1 attempt per question  
- Instant feedback:  
  - **Green** for correct answers  
  - **Red** for incorrect answers  
- Score tracking:  
  - You earn 1 point **per mistake**  
  - Final score is displayed at the end  
- "Finish" and "Restart" options when the quiz ends  

---

## Technologies Used

- Java 17+  
- Swing (with IntelliJ GUI Designer `.form`)  
- OOP principles: encapsulation, abstraction, separation of concerns  


---

## How to Run

1. Open the project in **IntelliJ IDEA**
2. Open `QuizForm.form` and design the UI with:
   - 1 `JLabel` → `questionLabel`
   - 4 `JButton`s → `optionAButton` to `optionDButton`
   - 1 `JLabel` → `feedbackLabel`
   - 1 `JButton` → `nextButton`
   - 1 root `JPanel` → `mainPanel`
3. Run `QuizForm.java`
4. Play the game and try not to make mistakes!

---

## Author

Felipe Chiesa
