//package Backtracking;

public class RatInMazeTwoDirection {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        int maze[][] = { {1,1,1,1},
                         {1,1,1,1},
                         {1,1,1,1},
                         {1,1,1,1}};

        possiblePathInMaze(0, 0, row-1, col-1,"", maze);
    }

    private static void possiblePathInMaze(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(maze[sr][sc] == 0) return;
        if (sr == er && sc == ec){
            System.out.println(s);
            return;
        }

        //Turn to right
        possiblePathInMaze(sr, sc+1, er, ec,s+"R", maze);

        //Turn to down
        possiblePathInMaze(sr+1, sc, er, ec, s+"D", maze);
    }
}
