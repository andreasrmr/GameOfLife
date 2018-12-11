package v2;
import java.util.ArrayList;
import static v2.GameBoard.*;

public class Visuals {

    final String dead = "-";
    final String alive = "#";

    public Visuals(){}
    public Visuals(ArrayList<String> listCells){


       for(int i = 0; i < getBoardSize(); i++){
           if(listCells.get(i).charAt(2) == '0'){
               System.out.print(dead);
           }
           else {
               System.out.print(alive);
           }
           if(i != 0 && i != 1){
               if(i % getGameboardX()== 0){
                   System.out.println();
               }

           }
       }
       System.out.println();
    }
}