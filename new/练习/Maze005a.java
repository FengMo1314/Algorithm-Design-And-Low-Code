/**
 *
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Maze005a {

	/**
	 * @param args
	 */
	/**
	 * 最佳路线步数
	 */
	public static int best = Integer.MAX_VALUE;
	/**
	 * 最佳路线
	 */
	public static int[][] bestSolution;
	/**
	 *
	 */
	static int[] xMove = { -1, 1, 0, 0 };
	static int[] yMove = { 0, 0, -1, 1 };
	static int steps = 1;

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
	 * 找到最短可行路线
	 *
	 * @param maze 迷宫
	 * @param x    当前 x 坐标
	 * @param y    当前 y 坐标
	 * @param n    最大 x 坐标
	 * @param m    最大 y 坐标
	 */
	// todo: 找到最短可行路线，并打印出该路线图，路线要能显示行进的方向，如
	// ↓ · ❏ · · · ❏ ·
	// ↓ · ❏ · · · ❏ ·
	// ↓ · ❏ · ❏ ❏ · ❏
	// ↓ ❏ ❏ ❏ → ↓ ❏ ·
	// → → ↓ ❏ ↑ → ↓ ·
	// · ❏ → → ↑ ❏ ↓ ❏
	// · ❏ ❏ ❏ ❏ · ↓ ❏
	// ❏ ❏ · · · ❏ ↓ ❏
	// ❏ ❏ · · · · → -
	public static void solveMaze(int[][] maze, int x, int y, int n, int m) {

		if (x == n - 1 && y == m - 1) {
			if (steps < best) {
				best = steps;
				bestSolution = maze.clone();
			}
			return;
		}
		for (int i = 0; i < xMove.length; i++) {
			int nextX = x + xMove[i];
			int nextY = y + yMove[i];
			if (isValid(maze, nextX, nextY, n, m)) {
				steps++;
				maze[nextX][nextY] = 2;

				solveMaze(maze, nextX, nextY, n, m);

				steps--;
				maze[nextX][nextY] = 0;
			}
		}
//		return false;

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] maze = { { 0, 0, 1, 0, 0, 0, 1, 0 }, { 0, 0, 1, 0, 0, 0, 1, 0 }, { 0, 0, 1, 0, 1, 1, 0, 1 },
				{ 0, 1, 1, 1, 0, 0, 1, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0, 1, 0, 1 },
				{ 0, 1, 1, 1, 1, 0, 0, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 0, 0, 1, 0, 1, 0 } };

		int n = maze.length;
		int m = maze[0].length;
		maze[0][0] = 2;

		solveMaze(maze, 0, 0, n, m);

		System.out.println("\nBest: " + best + " steps");
		Maze000.printMaze(bestSolution);

	}

}
