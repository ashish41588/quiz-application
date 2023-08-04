package src;

public interface PlayerActions {
    public void playQuiz(Question[] questions, String[] selection) throws InterruptedException;
    public void playQuizAgain(String s,Question[] questions, String[] selection) throws InterruptedException;
}
