package v2;

import java.util.Scanner;
import java.util.ArrayList;
import static v2.GameBoard.*;

public class Game{
    Visuals visuals = new Visuals();
    GameBoard gameBoard = new GameBoard(20, 20);
    Boolean cells[][] = new Boolean[getGameboardX()][getGameboardY()];
    public Game(){
        for(int y = 0; y < getGameboardY(); y++){
            for (int x = 0; x < getGameboardX(); x++){
                //alle celler i y = 10 lever.
                if(y == 10){
                    cells[x][y] = true;
                }
                //resten af cellerne er døde.
                else {
                    cells[x][y] = false;
                }

            }
        }
        //1. generation loaded.
        visuals.printVisuals(cells);
        //1. generation printet til skærm.

        boolean running = true;
        while(running){
            nextGen();
            System.out.println();
            System.out.println();
            System.out.println("Press enter for next generation");
            Scanner scan = new Scanner(System.in);
            scan.nextLine();
        }
    }

    public void nextGen(){

    }

}