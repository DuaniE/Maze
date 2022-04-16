package algorithms.mazeGenerators;

public class Maze {
    BinaryTree[][] matrix;

    Maze(int col, int row){
        matrix = new BinaryTree[row][col];
        for (int r = 0; r < row; r++){
            for (int c = 0; c < col; c++) {
                Cell tempCell = new Cell(r, c);
                Node tempNode = new Node(tempCell);
                matrix[r][c] = new BinaryTree(tempNode);
            }
        }
    }

    public boolean mazeComplete(){
        if (this.matrix[0][0].root == this.matrix[matrix.length-1][matrix.length-1].root)
            return true;
        return false;
    }
}
