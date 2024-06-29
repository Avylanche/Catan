import java. util. ArrayList;
public class Player extends NPC {
    ArrayList <Card> hand = new ArrayList();; //keep track of # cards, contents
    ArrayList <PointCard> pointCards = new ArrayList();
    ArrayList <DevCard> devCards  = new ArrayList();
    int points;
    ArrayList <Road> roads = new ArrayList();
    ArrayList <City> cities = new ArrayList();
    ArrayList <Settlement> settlements= new ArrayList();
    public Player(){
        points = 0;
    }
    public int Roll(){
        int roll1 = (int)(Math.random()*6+1);
        int roll2 = (int)(Math.random()*6+1);
        int roll = roll1+roll2;
        for (int row=0; row<board.length; row++){
            for (int col=0; col<board[row].length; col++){
                if (board[row][col]!=null && board[row][col].getPosition()==roll){
                    if (board[row][col].getType().equals("ore")){

                    }
                    //check hex tile number
                    //check hex resource type
                }
            }
        }
    }
}
