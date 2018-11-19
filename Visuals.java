import java.util.ArrayList;
public class Visuals {
    public Visuals(ArrayList<Cell> cells, World world){

        int count = 0;

        String dead = "-";
        String alive = "#";

        System.out.print("\033[H\033[2J");
        for(Cell cell : cells){

            if(cell.getAliveStatus())
            {
                System.out.print(alive);
                count++;
                if(count % world.getGridX() == 0){
                    System.out.print("\n");
                }
            }
            else{
                System.out.print(dead);
                count++;
                if(count % world.getGridX() == 0){
                    System.out.print("\n");
                }
            }
        }

    }

}