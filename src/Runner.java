import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Board b = new Board();
        Human h = new Human("Emmett", "1");
        Computer c = new Computer("2");
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter your age");
//
//        int age = sc.nextInt();
//
//        System.out.println("You are " + age + " years old.");


        boolean gameOverC = false;
        boolean gameOverP = false;
        boolean legalCol = false;
        int move = -1;

        while(gameOverP==false && gameOverC == false){
            /*System.out.println("Enter a column");
            int move = sc.nextInt();*/
            while(!legalCol) {

                //row move
                System.out.println("Enter column to drop character:");
                //hasNextInt will return true if user input is an int
                if(sc.hasNextInt()) {
                    move = sc.nextInt();
                    if(move>=1 && move<=7){
                        legalCol = true;
                    }
                }
                else {
                    System.out.println("Enter a legal column!");
                    sc.next();  //very important, resets the input from the "bad" one
                }

                if(legalCol) {
                    b.makeMove(move,h.token);
                }
            }

            b.makeMove(move-1,h.token);
            gameOverP=b.hasWin(h.token);
            b.makeMove(c.generateMove()-1, c.token);
            gameOverC=b.hasWin(c.token);
            b.displayBoard();

        }
        System.out.println("You win");



    }


}
