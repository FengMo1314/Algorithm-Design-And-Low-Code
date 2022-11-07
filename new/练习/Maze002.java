/**
 *
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Maze002 {

	/**
	 * @param args
	 */
	/**
	 * 可行路线总数
	 */
	public static int solutionCount;

	/**
	 * 检查约束条件
	 *
	 * @param maze 迷宫
	 * @param x    当前 x 坐标
	 * @param y    当前 y 坐标
	 * @param n    最大 x 坐标
	 * @param m    最大 y 坐标
	 * @return 是否满足约束条件
	 */
	// todo: 检查约束条件
	public static boolean isValid(int[][] maze, int x, int y, int n, int m) {
		if (x < n && y < m && x >= 0 && y >= 0) {
			if (maze[x][y] == 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 计算可行路线总数
	 *
	 * @param maze 迷宫
	 * @param x    当前 x 坐标
	 * @param y    当前 y 坐标
	 * @param n    最大 x 坐标
	 * @param m    最大 y 坐标
	 * @return 可行路线总数
	 */
	// todo: 计算可行路线总数
	public static void solveMaze(int[][] maze, int x, int y, int n, int m) {
		if (x == n - 1 && y == m - 1) {
			solutionCount++;
//    		return ;
		}
		if (isValid(maze, x, y, n, m)) {
			maze[x][y] = 1;
			solveMaze(maze, x - 1, y, n, m);
			solveMaze(maze, x + 1, y, n, m);
			solveMaze(maze, x, y - 1, n, m);
			solveMaze(maze, x, y + 1, n, m);
			maze[x][y] = 0;
		}

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] maze = { { 0, 0, 1, 0, 0, 0, 1, 0 }, { 0, 0, 1, 0, 0, 0, 1, 0 }, { 0, 0, 1, 0, 1, 1, 0, 1 },
				{ 0, 1, 1, 1, 0, 0, 1, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0, 1, 0, 1 },
				{ 0, 1, 1, 1, 1, 0, 0, 1 }, { 1, 1, 0, 0, 0, 1, 0, 1 }, { 1, 1, 0, 0, 0, 0, 0, 0 } };

		int n = maze.length;
		int m = maze[0].length;

		solveMaze(maze, 0, 0, n, m);

		if (solutionCount == 8) {
			System.out.println("Total: " + solutionCount);
			Maze000.printMaze(maze);
		}
	}

}
