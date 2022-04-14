package algorithms.mazeGenerators;

public abstract class AMazeGenerator implements IMazeGenerator {



    public abstract Maze generate(int columns, int rows);

    @Override
    public long measureAlgorithmTimeMillis(int column, int rows) {
        long start = System.currentTimeMillis();
        generate(column, rows);
        long finish = System.currentTimeMillis();
        return (finish-start);
    }
}
