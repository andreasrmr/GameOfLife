import java.util.ArrayList;
public class Visuals {
    public Visuals(ArrayList<Boolean> cells, World world){

        int count = 0;

        String dead = "-";
        String alive = "#";

        System.out.print("\033[H\033[2J");
        for(Boolean cell : cells){

            if(cell)
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