package v2;
public class GameBoard {

    static int gameboardX;
    static int gameboardY;
    static int boardSize;

    public GameBoard(int gameboardX, int gameboardY){
        this.gameboardX = gameboardX;
        this.gameboardY = gameboardY;
        this.boardSize = gameboardX * gameboardY;
    }
    public static int getGameboardX() {
        return gameboardX;
    }

    public static int getGameboardY() {
        return gameboardY;
    }

    public static int getBoardSize(){
        return boardSize;
    }

}