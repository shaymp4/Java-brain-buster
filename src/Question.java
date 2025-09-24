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

    //Getters
    String getQuestion() {
        return question;
    }
    String[] getOptions() {
        return options;
    }
    String getCorrectAnswer() {
        return correctAnswer;
    }

    //Question Display
    void displayQuestion(){
        System.out.println(this.question);
        System.out.println("Choose between 1 - " + options.length);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i+1)+") "+options[i]);
        }
    }

    //Answer check
    void checkAnswer(String answer){
        if(answer.equalsIgnoreCase(correctAnswer)){
            System.out.println("Correct!");
        }else{
            System.out.println("Wrong!");
        }
    }
}
