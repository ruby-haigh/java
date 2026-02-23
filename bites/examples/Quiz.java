package bites.examples;

public class Quiz {
    String question1;
    String question2;

    public Quiz(String question1, String question2) {
        this.question1 = question1;
        this.question2 = question2;
    }

    public String getQuestionOne() {
        return this.question1; //can just use question1 rather than this.question1
    }
    public String getQuestionTwo() {
        return this.question2;
    }

    public static void main(String[] args) {
        Quiz myQuiz = new Quiz("What is the capital of Burkina Faso?", "What is the capitol of Bhutan?");
        System.out.println(myQuiz.getQuestionOne());
        //System.out.println(myQuiz.question2); direct field access, works but normally fields should be private so accessed by a getter method
        System.out.println(myQuiz.getQuestionTwo());
    }
}
