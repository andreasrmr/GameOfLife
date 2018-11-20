import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Game{

    ArrayList<Boolean> cells = new ArrayList<Boolean>();
    boolean cell;
    boolean running = true;
    Visuals visuals;
    World world = new World(10, 10);

    public Game(){

        //Initialiser 1. generation.

        //y aksen
        for (int y = 0; y < world.getGridX(); y++) {
            //x aksen
            for (int x = 0; x < world.getGridY(); x++) {

                //definer levende celler  på x aksen
                if(y % 5 == 0 && y != 0){
                    //definer levende celler på y aksen
                    if(x >= 2 && x < 8){
                        cells.add(true);
                    }
                    else{
                        cells.add(false);
                    }
                }
                else {
                    cells.add(false);
                }

            }
        }

        while (running == true){

            //Kør visuals efter spil er læst ind.
            visuals = new Visuals(cells, world);

            //tryk enter for næste generation.
            System.out.println();
            System.out.println();
            System.out.println("Press enter for next generation");
            Scanner scan = new Scanner(System.in);
            scan.nextLine();

            //udregn naboer for hver celle
            //determineAliveNeighbors();

            //kør regler på hver celle.
            //runRules();

            //kør næste tick/generation.
            //runTick();
        }
    }
    //Tæl naboer.
    public void determineAliveNeighbors(){

        int neighborsAliveCount = 0;

        for(int i = 0; i < cells.size(); i++){

            if(i - world.getGridX()){
                
            }

            //i1 = [0,0]
            //i2 = [1,0]
            //i3 = [2,0]


        }



/*
            cell.setNeighborsAliveCount(0);
            for(int i = 0; i < cells.size(); i++){
                if(Arrays.equals(cell.getNeighborUpperLeft(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
                else if(Arrays.equals(cell.getNeighborUpperRight(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
                else if(Arrays.equals(cell.getNeighborDownRight(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
                else if(Arrays.equals(cell.getNeighborDownLeft(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
                else if(Arrays.equals(cell.getNeighborUp(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
                else if(Arrays.equals(cell.getNeighborDown(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
                else if(Arrays.equals(cell.getNeighborLeft(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
                else if(Arrays.equals(cell.getNeighborRight(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
            }
            cell.setNeighborsAliveCount(neighborsAliveCounter);
            */

    }

/*
    public void runRules(){

        for(Cell cell : cells){

            if (cell.getAliveStatus() == true){
                //Under populated
                if(cell.getNeighborsAliveCount() < 2){
                    cell.setTempAliveStatus(false);
                }
                //Surviving
                else if(cell.getNeighborsAliveCount() == 2 || cell.getNeighborsAliveCount() == 3){
                    cell.setTempAliveStatus(true);
                }
                //Overcrowding
                else if(cell.getNeighborsAliveCount() > 3){
                    cell.setTempAliveStatus(false);
                }
                else{
                    System.out.println("Du bør ikke være her");
                }
            }
            else if(cell.getAliveStatus() == false){
                //reproduction
                if(cell.getNeighborsAliveCount() == 3){
                    cell.setTempAliveStatus(true);
                }
            }
            else {
                System.out.println("Du bør ikke være here");
            }
        }
    }
    */
    /*
    public void runTick(){
        for(Cell cell : cells){
            cell.setAliveStatus(cell.getTempAliveStatus());
        }
    }
    */

}