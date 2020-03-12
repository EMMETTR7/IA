public class Computer extends Player{
    public Computer(String token) {
        super("computer", token);
    }

    public int generateMove(){
        return 2;
    }
}
