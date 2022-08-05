/**
 * 
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Maze003a {

	/**
	 * @param args
	 */
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
	 * 检查迷宫是否存在可行路线
	 * 
	 * @param maze 迷宫
	 * @param x    当前 x 坐标
	 * @param y    当前 y 坐标
	 * @param n    最大 x 坐标
	 * @param m    最大 y 坐标
	 * @return 是否存在可行路线
	 */
	// todo: 检查迷宫是否存在可行路线，并打印出迷宫路线图，路线要能显示行进的方向，如
	// ↓ · ❏ · · · ❏ ·
	// ↓ · ❏ · · · ❏ ·
	// ↓ · ❏ · ❏ ❏ · ❏
	// ↓ ❏ ❏ ❏ → ↓ ❏ ·
	// → → ↓ ❏ ↑ → ↓ ·
	// · ❏ → → ↑ ❏ ↓ ❏
	// · ❏ ❏ ❏ ❏ · ↓ ❏
	// ❏ ❏ · · · ❏ ↓ ❏
	// ❏ ❏ · · · · → -

	public static boolean solveMaze(int[][] maze, int x, int y, int n, int m) {
		int[] xMove = { -1, 1, 0,0 };
		int[] yMove = { 0, 0,-1, 1 };
		if (x == n - 1 && y == m - 1) {
			maze[n - 1][m - 1] = 2;
			return true;
		}
		for (int i = 0; i < xMove.length; i++) {
			int nextX = x + xMove[i];
			int nextY = y + yMove[i];
			if (isValid(maze, nextX, nextY, n, m)) {
				switch (i) {
				case 0:
					maze[nextX][nextY] = 101;
					break;
				case 1:
					maze[nextX][nextY] = 102;
					break;
				case 2:
					maze[nextX][nextY] = 103;
					break;
				case 3:
					maze[nextX][nextY] = 104;
					break;
				}
				if (solveMaze(maze, nextX, nextY, n, m)) {
					return true;
				} else {
					maze[nextX][nextY] = 0;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] maze = { { 0, 0, 1, 0, 0, 0, 1, 0 }, { 0, 0, 1, 0, 0, 0, 1, 0 }, { 0, 0, 1, 0, 1, 1, 0, 1 },
				{ 0, 1, 1, 1, 0, 0, 1, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0, 1, 0, 1 },
				{ 0, 1, 1, 1, 1, 0, 0, 1 }, { 1, 1, 0, 0, 0, 1, 0, 1 }, { 1, 1, 0, 0, 0, 0, 0, 0 } };

		int n = maze.length;
		int m = maze[0].length;
		maze[0][0] = 10;

		if (solveMaze(maze, 0, 0, n, m)) {
			Maze000.printMaze(maze);
		}
	}

}
