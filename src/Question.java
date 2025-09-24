public class Question {
    String question;
    String[] options;
    String correctAnswer;

    //Constructor
    public Question(String question, String correctAnswer, String... options) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}
