import java.util.ArrayList;
public class NPC {
    ArrayList <Card> hand = new ArrayList();; //keep track of # cards, contents
    ArrayList <PointCard> pointCards = new ArrayList();
    ArrayList <DevCard> devCards  = new ArrayList();
    int points;
    ArrayList <Road> roads = new ArrayList();
    ArrayList <City> cities = new ArrayList();
    ArrayList <Settlement> settlements= new ArrayList();
    private String color;
    public NPC(String c){
        points = 0;
        color = c;
    }
    public void setColor(String userinput){
        color=userinput;
        for (int i=0; i<roads.size(); i++){
            roads.get(i).color=userinput;
        }
        for (int i=0; i<cities.size(); i++){
            cities.get(i).color=userinput;
        }
        for (int i=0; i<settlements.size(); i++){
            settlements.get(i).color=userinput;
        }
    }
}
