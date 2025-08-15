import java.util.Scanner;

public class OnlineQuizApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Welcome screen
        System.out.println("====================================");
        System.out.println("        ONLINE QUIZ APPLICATION     ");
        System.out.println("====================================");

        // Quiz questions and answers
        String[] questions = {
            "1. What is the capital of India?",
            "2. Which language is used for Android development?",
            "3. What is 5 + 7?",
            "4. Who is known as the Father of Java?",
            "5. Which keyword is used to define a class in Java?"
        };

        String[][] options = {
            {"A. New Delhi", "B. Mumbai", "C. Kolkata", "D. Chennai"},
            {"A. Python", "B. Java", "C. C++", "D. Swift"},
            {"A. 10", "B. 11", "C. 12", "D. 13"},
            {"A. James Gosling", "B. Dennis Ritchie", "C. Bjarne Stroustrup", "D. Guido van Rossum"},
            {"A. define", "B. class", "C. Class", "D. create"}
        };

        char[] answers = {'A', 'B', 'C', 'A', 'B'}; // Correct answers

        int score = 0;

        // Menu system
        while (true) {
            System.out.println("\n----------- MAIN MENU -----------");
            System.out.println("1. Start Quiz");
            System.out.println("2. View Instructions");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Start quiz
                    for (int i = 0; i < questions.length; i++) {
                        System.out.println("\n" + questions[i]);
                        for (int j = 0; j < options[i].length; j++) {
                            System.out.println(options[i][j]);
                        }

                        System.out.print("Enter your answer (A/B/C/D): ");
                        char userAnswer = Character.toUpperCase(sc.next().charAt(0));

                        if (userAnswer == answers[i]) {
                            System.out.println("✅ Correct!");
                            score++;
                        } else {
                            System.out.println("❌ Wrong! Correct answer is: " + answers[i]);
                        }
                    }

                    // Final score
                    System.out.println("\nYour Final Score: " + score + "/" + questions.length);
                    if (score == questions.length) {
                        System.out.println("🏆 Excellent! You got all correct!");
                    } else if (score >= 3) {
                        System.out.println("👍 Good Job! Keep practicing.");
                    } else {
                        System.out.println("📚 Better luck next time.");
                    }
                    score = 0; // Reset for next attempt
                    break;

                case 2:
                    // Show instructions
                    System.out.println("\n--- Instructions ---");
                    System.out.println("1. The quiz contains 5 multiple-choice questions.");
                    System.out.println("2. Each question has 4 options: A, B, C, D.");
                    System.out.println("3. Enter the letter of your chosen option.");
                    System.out.println("4. Your score will be shown at the end.");
                    break;

                case 3:
                    // Exit
                    System.out.println("\nThank you for using Online Quiz Application!");
                    sc.close();
                    return;

                default:
                    System.out.println("\n⚠ Invalid choice! Please try again.");
            }
        }
    }
}
