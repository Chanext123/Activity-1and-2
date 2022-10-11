public class Game {
    public String publisher;
    public String title;
    
    Game(String publisher, String title){
        this.publisher = publisher;
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }
}