package algorithms.mazeGenerators;

public interface IMazeGenerator {

    /*
    This function need to be Override by all the Classes that inherit this interface
    */
    public Maze generate(int columns, int rows);
    public long measureAlgorithmTimeMillis(int column, int rows);

}
