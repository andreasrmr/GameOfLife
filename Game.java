import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Game{

    ArrayList<Cell> cells = new ArrayList<Cell>();
    boolean running = true;
    Visuals visuals;
    World world = new World();

    public Game(){

        for (int x = 0; x < 10; x++) {
            //y aksen
            for (int y = 0; y < 10; y++) {
                if(x % 5 == 0){
                    cells.add(new Cell(x, y, true));
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
            this.cells = determineAliveNeighbors(cells);

            //kør regler på hver celle.
            runRules();

            //kør næste tick/generation.
            runTick();
        }
    }

    public ArrayList<Cell> determineAliveNeighbors(ArrayList<Cell> cells){

        for(int z = 0; z < cells.size(); z++){
            cells.get(z).setNeighborsAliveCount(0);
            int neighborsAliveCounter = 0;

            for(int i = 0; i < cells.size(); i++){
                if(Arrays.equals(cells.get(z).getNeighborUpperLeft(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
                else if(Arrays.equals(cells.get(z).getNeighborUpperRight(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
                else if(Arrays.equals(cells.get(z).getNeighborDownRight(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
                else if(Arrays.equals(cells.get(z).getNeighborDownLeft(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
                else if(Arrays.equals(cells.get(z).getNeighborUp(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
                else if(Arrays.equals(cells.get(z).getNeighborDown(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
                else if(Arrays.equals(cells.get(z).getNeighborLeft(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }
                else if(Arrays.equals(cells.get(z).getNeighborRight(), cells.get(i).getCellXY())){
                    if(cells.get(i).getAliveStatus()){
                        neighborsAliveCounter++;
                    }
                }




            }
            cells.get(z).setNeighborsAliveCount(neighborsAliveCounter);

        }
        return cells;
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
            else if(cell.getAliveStatus()== false){
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