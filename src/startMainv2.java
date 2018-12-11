import v2.*;

import java.util.ArrayList;

public class startMainv2 {
    public static void main(String[] args){
        GameBoard gameBoard = new GameBoard();
        Cell cell = new Cell();

        ArrayList<Boolean> cellList = new ArrayList<Boolean>();

        for(int i = 0; i < 200; i++){
            cellList.add(true);
        }

        Visuals visuals = new Visuals(gameBoard, cellList);


    }
}