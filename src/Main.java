import java.util.Scanner;

public class Main {

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
                question_test(input);
            } else if (choice == 2) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

    }

    static void question_test(Scanner input){
        Question question_1 = new Question("Capital Of France","1","Paris","London","Berlin","Rome" );
        question_1.displayQuestion();
        while(true){
            System.out.println("Please make choice [1/2/3/4]: ");
            String answer = input.nextLine();
            question_1.checkAnswer(answer);
            break;
            }
        }

}
