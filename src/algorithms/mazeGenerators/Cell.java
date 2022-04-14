package algorithms.mazeGenerators;

public class Cell {
    public int colP;
    public int rowP;

    Cell(int column, int row){
        this.colP = column;
        this.rowP = row;
    }

    public int getColP() {
        return colP;
    }
    public void setColP(int colP) {
        this.colP = colP;
    }

    public int getRowP() {
        return colP;
    }
    public void setRowP(int rowP) {
        this.rowP = rowP;
    }
}
