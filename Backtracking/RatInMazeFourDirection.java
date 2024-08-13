//package Backtracking;

public class RatInMazeFourDirection {
    public static void main(String[] args) {
        int row = 3;
        int col = 4;
        int maze[][] = { {1,0,1,1},
                         {1,1,1,1},
                         {1,1,0,1}};

        possiblePathInMaze4D(0, 0, row-1, col-1,"", maze);
    }

    private static void possiblePathInMaze4D(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(maze[sr][sc] == 0) return;
        if (maze[sr][sc] == -1) return;
        if (sr == er && sc == ec){
            System.out.println(s);
            return;
        }

        //Checking
        maze[sr][sc] = -1;

        //Turn to Right
        possiblePathInMaze4D(sr, sc+1, er, ec,s+"R", maze);

        //Turn to Down
        possiblePathInMaze4D(sr+1, sc, er, ec, s+"D", maze);

        //Turn to left
        possiblePathInMaze4D(sr, sc-1, er, ec, s+"L", maze);

        //Turn to Up
        possiblePathInMaze4D(sr-1, sc, er, ec, s+"U", maze);

        //Backtracking
        maze[sr][sc] = 1;
    }
}
