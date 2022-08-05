/**
 * 
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Maze000 {

	/**
	 * @param args
	 */
	public static void printMaze(int[][] maze) {
        int n = maze.length;
        int m = maze[0].length;
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String s = String.valueOf(maze[i][j]);
                if (maze[i][j] == 1) {
                    s = "❏";
                } else if (maze[i][j] == 0) {
                    s = "·";
                } else if (maze[i][j] == 101) {
                    s = "↑";
                } else if (maze[i][j] == 102) {
                    s = "↓";
                } else if (maze[i][j] == 103) {
                    s = "←";
                } else if (maze[i][j] == 104) {
                    s = "→";
                } else if (maze[i][j] == 105) {
                    s = "↖";
                } else if (maze[i][j] == 106) {
                    s = "↘";
                } else if (maze[i][j] == 107) {
                    s = "↗";
                } else if (maze[i][j] == 108) {
                    s = "↙";
                } else {
                    s = "-";
                }
                System.out.format("%1$3s", s);
            }
            System.out.println();
        }
        System.out.println();

	}

}
