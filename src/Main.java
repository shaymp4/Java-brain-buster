import java.util.Scanner;

public class Main {

    static void questions(Scanner input) {
        String[] questions = {"What is the capital of France?", "What is the capital of Germany?", "What is the capital of Itlay?"};
        String[] options = {"A| Paris", "B| London", "C| Berlin", "D| Rome"};
        String[] correctAnswers = {"a", "c", "d"};
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options) {
                System.out.println(option);
            }
            while (true) {
                System.out.println("Please make choice [A/B/C/D]: ");
                String answer = input.nextLine();
                if (answer.equalsIgnoreCase(correctAnswers[i])) {
                    System.out.println("Correct!");
                    score += 10;
                    System.out.println("Your score is: " + score);
                    break;
                } else {
                    System.out.println("Wrong!");
                    break;
                }
            }
        }
        System.out.println("Total score: " + score);
    }

    static void question_test(){
        Question question_1 = new Question("Capital Of France","","A) Paris","B) London","C) Berlin","D) Rome" );
        Question question_2 = new Question("Capital Of Spain","","A) Paris","B) Dubai","C) Madrid","D) Belfast");
        Question question_3 = new Question("Capital Of Germany","","A) Paris","B) Berlin","C) London","D) Rome");

        System.out.println(question_1.question,question_1.options,question_1.correctAnswer);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Brain Buster!");
            System.out.println("1| Play");
            System.out.println("2| Exit");
            System.out.println("Please make choice [1/2]: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("Game is starting...");
                question_test();
            } else if (choice == 2) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

    }
}
