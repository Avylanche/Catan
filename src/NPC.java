import java. util. ArrayList;
public class NPC {
    ArrayList <Card> hand = new ArrayList();; //keep track of # cards, contents
    ArrayList <PointCard> pointCards = new ArrayList();
    ArrayList <DevCard> devCards  = new ArrayList();
    int points;
    ArrayList <Road> roads = new ArrayList();
    ArrayList <City> cities = new ArrayList();
    ArrayList <Settlement> settlements= new ArrayList();
    public NPC(){
        points = 0;
    }
}
