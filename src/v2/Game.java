package v2;

import java.util.ArrayList;
import static v2.GameBoard.*;

public class Game{
    public Game(){
        GameBoard gameBoard = new GameBoard(9, 9);
        Boolean cell[][] = new Boolean[getGameboardX()][getGameboardY()];

        for(int y = 0; y < getGameboardY(); y++){
            for (int x = 0; x < getGameboardX(); x++){
                //alle celler i x = 5 lever.
                if(y == 4){
                    cell[x][y] = true;
                }
                //resten af cellerne er døde.
                else {
                    cell[x][y] = false;
                }

            }
        }
        Visuals visuals = new Visuals(cell);

        //1. generation loaded.


    }

}