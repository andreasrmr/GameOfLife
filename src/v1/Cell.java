public class Cell {

    private boolean aliveStatus;
    private boolean tempAliveStatus;
    private int neighborsAliveCount;

    //cell coordinates
    private int x;
    private int y;

    //Diagonal Neighbors
    private int[] neighborUpperLeft;
    private int[] neighborUpperRight;
    private int[] neighborDownLeft;
    private int[] neighborDownRight;

    //Straight neighbors
    private int[] neighborUp;
    private int[] neighborDown;
    private int[] neighborLeft;
    private int[] neighborRight;

    public Cell(int x, int y, boolean aliveStatus){
        this.x = x;
        this.y = y;
        this.aliveStatus = aliveStatus;

        //Diagonal Neighbors
        neighborUpperLeft = new int[] {x - 1, y + 1};
        neighborUpperRight = new int[] {x + 1, y + 1};
        neighborDownLeft = new int[] {x - 1, y - 1};
        neighborDownRight = new int[] {x + 1, y - 1};

        //Straight neighbors
        neighborUp = new int[] {x, y + 1};
        neighborDown = new int[] {x, y -1};
        neighborLeft = new int[] {x - 1, y};
        neighborRight = new int[] {x + 1, y};

    }

    public int[] getCellXY(){
        int[] cellXY = new int[] {x, y};
        return cellXY;
    }
    public boolean getAliveStatus(){
        return aliveStatus;
    }
    public void setAliveStatus(boolean aliveStatus){
        this.aliveStatus = aliveStatus;
    }
    public void setNeighborsAliveCount(int neighborsAliveCount){
        this.neighborsAliveCount = neighborsAliveCount;
    }
    public int getNeighborsAliveCount(){
        return this.neighborsAliveCount;
    }
    public boolean getTempAliveStatus(){
        return tempAliveStatus;
    }
    public void setTempAliveStatus(boolean tempAliveStatus){
        this.tempAliveStatus = tempAliveStatus;
    }

    //NABOER GET SET
    public int[] getNeighborUpperLeft(){
        return this.neighborUpperLeft;
    }
    public int[] getNeighborUpperRight(){
        return this.neighborUpperRight;
    }
    public int[] getNeighborDownLeft(){
        return this.neighborDownLeft;
    }
    public int[] getNeighborDownRight(){
        return this.neighborDownRight;
    }
    public int[] getNeighborUp(){
        return this.neighborUp;
    }
    public int[] getNeighborDown(){
        return this.neighborDown;
    }
    public int[] getNeighborLeft(){
        return this.neighborLeft;
    }
    public int[] getNeighborRight(){
        return this.neighborRight;
    }

}
