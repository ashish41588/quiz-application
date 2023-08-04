package src;

import java.util.Scanner;

public class PlayerActionsImpl implements PlayerActions {

    @Override
    public void playQuiz(Question[] questions, String[] selection) throws InterruptedException {
        int i = 0;
        int currentScore = 0;
        for (Question q : questions) {
            int qNum=i + 1;
            System.out.println("Question " + (qNum) + " : ");
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            System.out.println("Skip question: Yes or No");
            Scanner sc0 = new Scanner(System.in);
            if(sc0.nextLine().trim().equals("Yes")){
                System.out.println("Current score of the user is: " + currentScore);
                i++;
                continue;
            }

            System.out.println("provide your answer to question "+(qNum));
            String currentAns = sc0.nextLine().trim();
            if(currentAns.equals("")){
                System.out.println("Current score of the user is: " + currentScore);
                continue;
            }else if (q.getAnswer().equals(currentAns)) {
                currentScore++;
            } else {
                currentScore--;
            }
            System.out.println("Current score of the user is: " + currentScore);
            selection[i] = currentAns;
            i++;
        }
        System.out.println("Total score of the user is: " + currentScore);
        System.out.println("Want to start over: Yes or No");
        Scanner sc2 = new Scanner(System.in);
        String currentAns = sc2.nextLine().trim();
        playQuizAgain(currentAns,questions,selection);
    }

    @Override
    public void playQuizAgain(String s,Question[] questions, String[] selection) throws InterruptedException {
        if(s.equals("Yes")){
            playQuiz(questions,selection);
        }
    }

}
