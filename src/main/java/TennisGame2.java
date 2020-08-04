public class TennisGame2 implements TennisGame
{
    private int player1point = 0;
    private int player2point = 0;

    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }
    public  String countPoint(int playerPoint){
        if (playerPoint==0)
            return "Love";
        if (playerPoint==1)
            return "Fifteen";
        if (playerPoint ==2)
            return  "Thirty";
        if (playerPoint ==3)
            return  "Forty";

        return "";
    }
    public String getScore(){
         String player1result = "";
         String player2result = "";
        String score = "";
        if (player1point == player2point && player1point < 4)
        {
            score = countPoint(player1point);
            score += "-All";
        }
        if (player1point == player2point && player1point >=3)
            score = "Deuce";

        if (player1point > 0 && player2point ==0)
        {
            countPoint(player1point);

            player2result = "Love";
            score = player1result + "-" + player2result;
        }
        if (player2point > 0 && player1point ==0)
        {
            countPoint(player2point);

            player1result = "Love";
            score = player1result + "-" + player2result;
        }

        if (player1point > player2point && player1point < 4)
        {
            player1result = countPoint(player1point);
            player2result = countPoint(player2point);
            score = player1result + "-" + player2result;
        }
        if (player2point > player1point && player2point < 4)
        {
            player1result = countPoint(player1point);
            player2result = countPoint(player2point);
            score = player1result + "-" + player2result;
        }

        if (player1point > player2point && player2point >= 3)
        {
            score = "Advantage player1";
        }

        if (player2point > player1point && player1point >= 3)
        {
            score = "Advantage player2";
        }

        if (player1point >=4 && player2point >=0 && (player1point - player2point)>=2)
        {
            score = "Win for player1";
        }
        if (player2point >=4 && player1point >=0 && (player2point - player1point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }

//    public void SetP1Score(int number){
//
//        for (int i = 0; i < number; i++)
//        {
//            P1Score();
//        }
//
//    }
//
//    public void SetP2Score(int number){
//
//        for (int i = 0; i < number; i++)
//        {
//            P2Score();
//        }
//
//    }

    public void p1Score(){
        player1point++;
    }

    public void p2Score(){
        player2point++;
    }

    public void wonPoint(String player) {
        if ("player1".equals(player))//null safe
            p1Score();
        else
            p2Score();
    }
}