import java.util.Scanner;
import java. util. ArrayList;
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
        if (Response().equals("red")){
            //set colors here and afterwqards
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
                for (int row=0; row<board.length; row++){
                    for (int col=0; col<board[row].length; col++){
                        if (board[row][col]!=null && board[row][col].getPosition()==Response()){ {
                            setRobberStatusTrue();
                        }
                            Robber();
                        }
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

