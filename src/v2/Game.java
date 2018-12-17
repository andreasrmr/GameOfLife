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
        //visuals.printVisuals(cells);
        //1. generation printet til skærm.

        boolean running = true;
        while(running){
            System.out.println();
            System.out.println();
            System.out.println("Press enter for next generation");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            if(str.equals("x")){
                running = false;
            }
            else {
                nextGen();
            }

        }
    }

    public void nextGen(){

        for(int x = 0; x < getGameboardX()-1; x++){
            for(int y = 0; y < getGameboardY()-1; y++){
                int aliveNeighbours = 0;
                    //check each cell around a cell if its alive and count.
                    //top left
                    if(cells[x-1][y-1] == true){
                        aliveNeighbours++;
                    }
                    //top
                    if(cells[x][y-1] == true){
                        aliveNeighbours++;
                    }
                    //top right
                    if(cells[x + 1][y-1] == true){
                        aliveNeighbours++;
                    }
                    //left
                    if(cells[x - 1][x] == true){
                        aliveNeighbours++;
                    }
                    //right
                    if(cells[x + 1][x] == true){
                        aliveNeighbours++;
                    }
                    //buttom left
                    if(cells[x - 1][y + 1] == true){
                        aliveNeighbours++;
                    }
                    //buttom mid
                    if(cells[x][y + 1] == true){
                        aliveNeighbours++;
                    }
                    if(cells[x + 1][y + 1] == true){
                        aliveNeighbours++;
                    }
                    //if current cell is alive
                    if(cells[x][y] == true){
                        //run rules
                    }
                    //if current cell is dead
                    else {
                        //run rules.
                    }

                }




                    //top row.
                    //y-1, x-1
                    //y-1, x
                    //y-1, x+1

                    //mid row (dont count itself);
                    //y, x - 1
                    //y, x + 1

                    //bottom row.
                    //y+1, x-1
                    //y+1, x
                    //y+1, x + 1




        }
    }

}