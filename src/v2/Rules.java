package v2;
/*Rules
        1) Under-population :
        Any live cell with fewer than two live neighbors dies.
        2) Surviving :
        Any live cell with two or three live neighbors lives on.
        3) Overcrowding :
        Any live cell with more than three live neighbors dies.
        4) Reproduction :
        Any dead cell with exactly three live neighbors
        becomes a live cell.
*/
public class Rules {
    public static boolean isCellAlive(int aliveNeighbours, boolean aliveStatus){
        //alive cells
        if(aliveStatus){
            //under-populated
            if(aliveNeighbours < 2){
                return false;
            }
            //surviving
            else if(aliveNeighbours < 4){
                return true;
            }
            //overcrowded
            else {
                return false;
            }
        }
        else {
            if(aliveNeighbours == 3){
                return true;
            }
            return false;
        }

    }
}
