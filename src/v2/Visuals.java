package v2;
import java.util.ArrayList;
import static v2.GameBoard.*;

public class Visuals {

    final String dead = "-";
    final String alive = "#";

    public Visuals(){}

    public void printVisuals(Boolean[][] cells){
        for(int y = 0; y < getGameboardY(); y++){

            for(int x = 0; x < getGameboardX(); x++){

                if(cells[x][y] == false){
                    System.out.print("#");
                }
                else {
                    System.out.print("-");
                }

            }
            System.out.println();
        }

    }
}