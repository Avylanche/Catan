public class Hex {
    static String ore;
    static String wood;
    static String sheep;
    static String brick;
    static String wheat;
    static String desert;
    private String type;
    private int number;
    private boolean robberStatus;
    private int positionForPlayer;
    public Hex (String t, int n, boolean r, int p){
        type = t;
        number = n;
        robberStatus = false;
        positionForPlayer = p;
        ore = "ore";
        wood = "wood";
        sheep = "sheep";
        brick = "brick";
        wheat = "wheat";
        desert = "desert";
    }
    public int getPosition(){
        return positionForPlayer;
    }
    public void setRobberStatusTrue(){
        robberStatus=true;
    }
    public void setRobberStatusFalse(){
        robberStatus=false;
    }
    public String getType(){
        return type;
    }
}

