package v2;
import java.util.ArrayList;
import static v2.GameBoard.*;

public class Visuals {

    final String dead = "-";
    final String alive = "#";

    public Visuals(){}
    public Visuals(Boolean[][] cell){
        for(int y = 0; y < getGameboardY(); y++){

            for(int x = 0; x < getGameboardX(); x++){

                if(cell[x][y] == false){
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