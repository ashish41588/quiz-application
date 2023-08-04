package src;

public class QuizApplication {
    public static void main(String[] args) throws InterruptedException {

        // create a quiz (5 question)
        // create 5 questions from user
        // QuestionService : create, get, delete,
        // Array - String


        // Roles
        // Negative marking
        // realtime score
        // play again (different question)
        // skip question
        // set timer

        // Step 1: Creating the questions for quiz
        TrainerActionsImpl trainerActionsImplObj=new TrainerActionsImpl();
        Question[] questionsSet=trainerActionsImplObj.createQuiz();

        // Step 2: Display the created questions for quiz
        String[] selection = new String[5];
        PlayerActionsImpl playerActionsImplObj=new PlayerActionsImpl();
        playerActionsImplObj.playQuiz(questionsSet,selection);


        //playerActionsImplObj.playQuiz();
        //service.displayQuestions();

        // QuestionService service = new QuestionService();
        // service.playQuiz();
        // service.printScore();
    }
}
