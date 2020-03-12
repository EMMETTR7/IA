public class Board {

    int size = 8;
    String[][] grid = new String[size][size];

    public Board() {
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {

                grid[row][col] = "0";

            }
        }
    }

    public void displayBoard() {

        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                System.out.print(grid[row][col]+" ");

            }
            System.out.print("\n");
        }
    }

    public boolean makeMove(int col, String token){
        for(int i=7; i>=0; i--){
            if(grid[i][col].equals("0")){
                grid[i][col]=token;
                return true;
            }
        }
        return false;
    }

    public boolean hasWin(String token){
        return (hWin(token) || vWin(token) || dWin(token));
    }

    public boolean hWin(String token){
        for(int i = 7;i>=0;i--){
            for (int j = 0;j<=4;j++){
                if(grid[i][j].equals(token)){
                    if(grid[i][j+1].equals(token)){
                        if(grid[i][j+2].equals(token)){
                            if(grid[i][j+3].equals(token)){
                                return true;
                            }
                        }
                    }
                }
            }
        }




        return false;
    }

    public boolean vWin(String token){
        for(int i = 7;i>=3;i--){
            for(int j = 0;j<=7;j++){
                if(grid[i][j].equals(token)){
                    if(grid[i-1][j].equals(token)){
                        if(grid[i-2][j].equals(token)){
                            if(grid[i-3][j].equals(token)){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean dWin(String token){

        return false;
    }

}
