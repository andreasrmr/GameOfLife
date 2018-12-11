package v2;
import java.util.ArrayList;
public class Visuals {

    final String dead = " ";
    final String alive = "#";
    public Visuals(){}
    public Visuals(GameBoard gameBoard, ArrayList<Boolean> cellList){
        for(int i = 0; i < gameBoard.getGameboardY(); i++){

            for(int j = 0; j < gameBoard.getGameboardX(); j++){
                if (cellList.get(j)) {
                    System.out.print(dead);
                }
                else {
                    System.out.print(alive);
                }
            }
            System.out.println();

        }

    }
}