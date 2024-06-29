import java. util. ArrayList;
public class Board {
    private Hex[][] board; //can i make this public or something
    public Board(){
        board = new Hex[5][5];
        board[0][3] = null;
        board[0][4] = null;
        board[1][4] = null;
        board[3][0] = null;
        board[4][0] = null;
        board[4][1] = null;
        ArrayList <DevCard> devcards = new ArrayList();
        ArrayList <String> deck = new ArrayList();
        ArrayList <Integer> disks =  new ArrayList();
        ArrayList <Card> cards =  new ArrayList();
        disks.add(2);
        disks.add(3);
        disks.add(3);
        disks.add(4);
        disks.add(4);
        disks.add(5);
        disks.add(5);
        disks.add(6);
        disks.add(6);
        disks.add(8);
        disks.add(8);
        disks.add(9);
        disks.add(9);
        disks.add(10);
        disks.add(10);
        disks.add(11);
        disks.add(11);
        disks.add(12);
        for (int i=0; i<19; i++){
            cards.add(new Card("ore"));
        }
        for (int i=0; i<19; i++){
            cards.add(new Card("wood"));
        }
        for (int i=0; i<19; i++){
            cards.add(new Card("sheep"));
        }
        for (int i=0; i<19; i++){
            cards.add(new Card("brick"));
        }
        for (int i=0; i<19; i++){
            cards.add(new Card("wheat"));
        }
        for (int i=0; i<14; i++){
            devcards.add(new DevCard("knight"));
        }
        for (int i=0; i<5; i++){
            devcards.add(new DevCard("victoryPoint"));
        }
        for (int i=0; i<2; i++){
            devcards.add(new DevCard("roadBuilding"));
        }
        for (int i=0; i<2; i++){
            devcards.add(new DevCard("monopoly"));
        }
        for (int i=0; i<2; i++){
            devcards.add (new DevCard("yearOfPlenty"));
        }
        for (int i=0; i<3; i++){
            deck.add ("ore");
            deck.add ("brick");
        }
        for (int i=0; i<4; i++){
            deck.add ("wood");
            deck.add ("sheep");
            deck.add ("wheat");
        }
        for (int i=0; i<1; i++){
            deck.add ("desert");
        }
        for (int i = deck.size()-1; i>=0; i--){
            int n=0;
            if (n>19){
                for (int row=0; row<board.length; row++){
                    for (int col=0; col<board[row].length; col++){
                        if (!(board[row][col]==null)){
                            int temp=(int)(Math.random()*(deck.size()));
                            int rollDisk = (int)(Math.random()*(disks.size()));
                            if (deck.get(temp).equals("desert")){
                                board[row][col]=new Hex(deck.get(temp),-1, true, n); //-1 if for desert, nobody rolls -1
                            }
                            else{
                                board[row][col]=new Hex(deck.get(temp),disks.get(rollDisk), false, n);
                                deck.remove(temp);
                                disks.remove(rollDisk);
                            }
                            n++;
                        }
                        else {
                            n++;
                        }
                    }
                }
            }
        }
    }
}
