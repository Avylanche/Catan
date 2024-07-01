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
    private int row;
    private int col;
    public Hex (String t, int n, boolean r, int p, int x, int y){
        type = t;
        number = n;
        robberStatus = false;
        positionForPlayer = p;
        this.row = x;
        this.col = y;
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

