package algorithms.mazeGenerators;

import java.util.Random;

public class MyMazeGenerator extends AMazeGenerator{
    @Override
    public Maze generate(int columns, int rows) {
        Random randC1 = new Random();
        Random randR1 = new Random();
        Maze myMaze = new Maze(columns, rows);
        /*
         * We add random sets with each other
         */
        while (!myMaze.mazeComplete())
            myMaze.matrix[(int) randC1.nextInt()][(int) randR1.nextInt()].addSet(myMaze.matrix[(int) randC1.nextInt()][randR1.nextInt()]);
        /* Now here we need to build the walls according to the cell stat
        //
        // (ToDo)
        //
         */

        return null;
    }
}
