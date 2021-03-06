
public class TennisGame2 implements TennisGame
{
    public int P1point = 0;
    public int P2point = 0;
    private static final String[] scores = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
    
    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        String score = "";
        if (P1point == P2point && P1point < 4)
        {
            if (P1point==0 || P1point==1 || P1point==2)
                score = scores[P1point];
            score += "-All";
        }
        
        
        if (P1point==P2point && P1point>=3)
            score = "Deuce";
        
        if (P1point > 0 && P2point==0)
        {
            if (P1point==1 || P1point==2 || P1point==3)
                P1res = scores[P1point];
            P2res = scores[P2point];
            score.concat(P1res).concat("-".concat(P2res));
        }
                    
        if (P2point > 0 && P1point==0)
        {
            if (P2point==1 || P2point ==2)
                P2res = scores[P2point];          
            P1res = scores[P1point];
            score.concat(P1res).concat("-".concat(P2res));
        }
              
        if (P1point>P2point && P1point < 4)
        {
            if (P1point==2 || P1point==3)
                P1res=scores[P1point];           
            if (P2point==1||P2point==2)
                P2res=scores[P2point];
            score = P1res + "-" + P2res;
        }
                     
        if (P2point>P1point && P2point < 4)
        {
            if (P2point==2 || P2point==3)
                P2res=scores[P2point];   
            if (P1point==1 || P1point==2)
                P1res=scores[P1point];

            score = P1res + "-" + P2res;
        }
        
        if (P1point > P2point && P2point >= 3)
        {
            score = "Advantage player1";
        }
        
        if (P2point > P1point && P1point >= 3)
        {
            score = "Advantage player2";
        }
        
        if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
        {
            score = "Win for player1";
        }
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }
    
    public void SetP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P1Score();
        }
            
    }
    
    public void SetP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P2Score();
        }
            
    }
    
    public void P1Score(){
        P1point++;
    }
    
    public void P2Score(){
        P2point++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}