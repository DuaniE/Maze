package algorithms.mazeGenerators;

public class Node {
    Cell value;
    Node left;
    Node right;

    Node(Cell value) {
        this.value = value;
        right = null;
        left = null;
    }
    public boolean canMerge(Cell a, Cell b){
        if (a.rowP == b.rowP && a.colP == b.colP)
            return false;
        return a.rowP == b.rowP || a.colP == b.colP;
    }

    public boolean canMerge(Cell a){
        return a.rowP == this.value.rowP || a.colP == this.value.colP;
    }

}
