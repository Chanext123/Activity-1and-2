public class GameException extends Exception {

    public GameException(String message){
        super(message);
    }
    
    public String notNumber(){
        return "Your input is not a number.";
    }

}