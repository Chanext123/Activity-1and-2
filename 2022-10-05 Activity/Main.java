import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        List<Game> listOfGame = new ArrayList<Game>();

        System.out.println("\nChoose what game you want to play! ");
        System.out.println("\nReminder: You can only input an integer ");

        try{
            System.out.print("\nNumber of game you want to play : ");
            Integer objects = input.nextInt();
            
            if(objects < 0){
                input.close();
                sc.close();
                throw new GameException("Your input is negative. Please input positive index.");
            }

            for(int i = 0; i < objects; i++){
                
                System.out.println("");
                System.out.print("Title of the Game: ");
                String game_title = sc.nextLine();

                System.out.print("Publisher: ");
                String game_publisher = sc.nextLine();
    

                listOfGame.add(new Game(game_publisher, game_title));
            }

            System.out.println("");
            System.out.println("-------------------------------------");
            System.out.println("\nHere's Your Gamelist!");
            System.out.println("=====================================");
            for(Game list : listOfGame){
                System.out.println("Title: " + list.getTitle() + " (" + "Publisher: " + list.getPublisher() + ")");    
            }
            System.out.println("=====================================");
            System.out.println("");

            input.close();
            sc.close();

        }
        catch(GameException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("Your input is not a number.");
        }

    }
}