public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 901;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your Score is less than 5000 but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your Score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        //You cannot access variables created inside a codeblock outside of a code blaco
        if(gameOver = true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        } if(score > 900){
            System.out.println("Your Highest Score was " + score);
        } else {
            System.out.println("Your Second Score was not higher than 900");
        }

       // int savedFinalScore = finalScore;

        //print out a second score on a screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        //Make sure the the above printout still displayed as well

        //Solution

//        boolean NewgameOver = true;
//        int Newscore = 10000;
//        int NewlevelCompleted = 8;
//        int Newbonus = 200;
//
//        if(NewgameOver = true) {
//            int finalScore = Newscore + (NewlevelCompleted * Newbonus);
//            System.out.println("Your final score was " + finalScore);
//        } if(Newscore > 900){
//            System.out.println("Your New Highest Score was " + Newscore);
//        } else {
//            System.out.println("Your New Second Score was not higher than 900");
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver = true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}