package v2;

import java.util.ArrayList;
import static v2.GameBoard.*;

public class Game{
    public Game(){
        boolean cell;
        GameBoard gameBoard = new GameBoard(9, 9);
        //ArrayList<int[][]> livingCells = new ArrayList<int[][]>();

        //define all cells.
        //x, y, state
        //state = 0 || 1 (dead or alive)
        int cells[][];
        ArrayList<String> listCell = new ArrayList<String>();
        cells = new int[getGameboardX()][getGameboardY()];
        for(int x = 0; x < getGameboardX(); x++){
            for(int y = 0; y < getGameboardY(); y++) {
                //Hvis celler er levende får de tilføjet et 1 tal, hvis døde tilføjes et 0.
                String number = Integer.toString(x) + Integer.toString(y);
                if(number.charAt(0) == '2'){
                    number = number + "1";
                }
                else {
                    number = number + "0";
                }
                listCell.add(number);
            }
        }
        Visuals visuals = new Visuals(listCell);
    }

}