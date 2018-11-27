import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Game{

    //ArrayList<Boolean> cells = new ArrayList<Boolean>();
    ArrayList<boolean[]> yGrid;
    boolean[] xGrid;

    boolean cell;
    boolean running = true;
    Visuals visuals;
    World world = new World(10, 10);

    public Game(){

        //Initialiser 1. generation.
        //Opret grid med plads til celler.

        yGrid = new ArrayList<boolean[]>();
        //y akse.

        for(int y = 0; y < world.getGridY(); y++){
            //x akse
            xGrid = new boolean[world.getGridX()];
            for(int x = 0; x < xGrid.length; x++){

                //døde celler defineres
                xGrid[x] = false;

                //levende celler defineres.
                if(y == 5 && x > 2 && x < 7){
                    xGrid[x] = true;
                }
            }
            System.out.println(Arrays.toString(xGrid));
            yGrid.add(xGrid);
        }

        while (running == true){

            //Kør visuals (1. gen er læst ind via constructor.).
            printGenToScreen();

            //tryk enter for næste generation.
            System.out.println();
            System.out.println();
            System.out.println("Press enter for next generation");
            Scanner scan = new Scanner(System.in);
            scan.nextLine();

            //udregn naboer for hver celle
            determineAliveNeighbors();

            //kør regler på hver celle.
            //runRules();

            //kør næste tick/generation.
            //runTick();
        }
    }
    //Tæl naboer.
    public void determineAliveNeighbors(){


        for(int y = 0; y < world.getGridY(); y++){
            boolean[] z = yGrid.get(y);

            for(int x = 0; x < world.getGridX(); y++){



            }

        }

        /*
        public void printGenToScreen(){

            String dead = "-";
            String alive = "#";
            //clear screen.
            System.out.print("\033[H\033[2J");

            for(int y = 0; y < world.getGridY(); y++){
                boolean[] z = yGrid.get(y);

                for(int x = 0; x < world.getGridX(); x++){
                    if(!(z[x])){
                        System.out.print(dead);
                    }
                    else {
                        System.out.print(alive);
                    }
                }
                System.out.println();
            }
        }
        */



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
