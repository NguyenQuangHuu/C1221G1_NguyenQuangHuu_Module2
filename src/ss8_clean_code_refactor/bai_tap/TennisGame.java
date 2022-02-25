package ss8_clean_code_refactor.bai_tap;

import java.util.Arrays;

public class TennisGame {
    private static int i = 0;

    public static void main(String[] args) {

    }
    public static  String getScore(String playerOneName, String playerTwoName, int playerOneScore, int playerTwoScore) {
        String score = "";
        int tempScore=0;
        boolean isDeuce = playerOneScore==playerTwoScore;
        boolean isWinner =  playerOneScore>=4 || playerTwoScore>=4;

        if (isDeuce)
        {
            score = getDeuce(playerOneScore);
        }
        else if (isWinner)
        {
            int minusResult = playerOneScore-playerTwoScore;
            score = checkAdvantageAndWinner(minusResult);
        }
        else
        {
            score = getString(playerOneScore, playerTwoScore, score);
        }
        return score;
    }

    private static String getString(int playerOneScore, int playerTwoScore, String score) {
        int tempScore;
        final int LOVE = 0;
        final int FIFTEEN = 1;
        final int THIRTY = 2;
        final int FORTY = 3;
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = playerOneScore;
            else { score+="-"; tempScore = playerTwoScore;}
            switch(tempScore)
            {
                case LOVE:
                    score+="Love";
                    break;
                case FIFTEEN:
                    score+="Fifteen";
                    break;
                case THIRTY:
                    score+="Thirty";
                    break;
                case FORTY:
                    score+="Forty";
                    break;
            }
        }
        return score;
    }

    private static String getDeuce(int playerOneScore) {
        String score;
        final int LOVE = 0;
        final int FIFTEEN = 1;
        final int THIRTY = 2;
        final int FORTY = 3;
        switch (playerOneScore)
        {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FORTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }


    public static String checkAdvantageAndWinner(int number){

        if(number == 1){
            return "Advantage player1";
        }else if(number == -1){
            return "Advantage player2";
        }else if(number>=2){
            return "Win for player1";
        }else{
            return "Win for player2";
        }
    }
}
