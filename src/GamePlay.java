import java.util.Scanner;
import java.util.ArrayList;
public class GamePlay {
    static Scanner scan = new Scanner(System.in);
    static String quickGuide = ("quit: end game \n" + "stop: end roll");
    static Player player =new Player();
    static Board board = new Board();
    public static void main (String[] args){
        System.out.print("Hello, welcome to Catan! This is a single player simulation against fake NPCs.");
        System.out.print("say \"quickguide\" to access quickGuide ");
        System.out.println("to access quickGuide at anytime, say \"quickguide\"");
        System.out.println("***********************************************");
        System.out.println("Which color would you like?");
        System.out.println("Red, Orange, White, Blue");
        String color = Response();
        if (color.equals("red")){
        player.setColor("red");
        }
        if (color.equals("orange")){
            player.setColor("orange");
        }
        if (color.equals("white")){
            player.setColor("white");
        }
        if (Response().equals("blue")){
            player.setColor("blue");
        }
    }

    public static String Response(){
        String response = scan.nextLine();
        String s = response;
        clean(s);
        if (s.equals("quickguide")){
            return quickGuide;
        }
        else if (s.equals("roll")){
            Roll();
            if (roll==7){
                System.out.println("7 was rolled...uh oh! If your hand exceeds 6, you lose half your cards.");
                System.out.println("Please select a new hex for the robber to inhabit");
                int position = Integer.parseInt(Response());
                for (int row=0; row<board.board.length; row++){
                    for (int col=0; col<board.board[row].length; col++){
                        if (board.board[row][col]!=null && board.board[row][col].getPosition()==position){
                            Hex hex = board.board[row][col];
                            hex.setRobberStatusTrue();
                        }
                            Robber();
                    }
                }
            }
            else {
                return s;
            }
        }
    }

    public static String clean(String c){

        c = c.replaceAll("[^A-Za-z]", "").toLowerCase();
        c = c.replaceAll(" ", "");
        c = c.replaceAll("\\.", "");
        c = c.replaceAll("\\!", "");
        c = c.replaceAll("\\?", "");
        c = c.replaceAll("\\,", "");

        return c;
    }

    public void Robber(int x){

    }
}

