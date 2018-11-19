import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Game{

    ArrayList<Cell> cells = new ArrayList<Cell>();
    boolean running = true;
    Visuals visuals;
    World world = new World(30, 30);

    public Game(){

        //Initialiser 1. generation.

        //x aksen
        for (int x = 0; x < world.getGridX(); x++) {
            //y aksen
            for (int y = 0; y < world.getGridY(); y++) {

                //definer levende celler  på x aksen
                if(x % 15 == 0 && x != 0){
                    //definer levende celler på y aksen
                    if(y >= 10 && y < 20){
                        cells.add(new Cell(x, y, true));
                    }
                    else{
                        cells.add(new Cell(x, y, false));
                    }
                }
                else {
                    cells.add(new Cell(x, y, false));
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
            determineAliveNeighbors();

            //kør regler på hver celle.
            runRules();

            //kør næste tick/generation.
            runTick();
        }
    }

    public void determineAliveNeighbors(){

        for(Cell cell : cells){

            cell.setNeighborsAliveCount(0);
            int neighborsAliveCounter = 0;

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
        }
    }


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
    public void runTick(){
        for(Cell cell : cells){
            cell.setAliveStatus(cell.getTempAliveStatus());
        }
    }

}