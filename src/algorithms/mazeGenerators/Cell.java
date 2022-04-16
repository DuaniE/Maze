package algorithms.mazeGenerators;

public class Cell {
    public int colP;
    public int rowP;
    public boolean up;
    public boolean down;
    public boolean left;
    public boolean right;

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

    @Override
    public boolean equals(Object o){
        Cell c = (Cell) o;
        return (this.rowP == c.rowP && this.colP == c.colP);
    }
}
