/**
 *
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Maze001 {

	/**
	 * @param args
	 */
	/**
	 * ���Լ������
	 *
	 * @param maze �Թ�
	 * @param x    ��ǰ x ����
	 * @param y    ��ǰ y ����
	 * @param n    ��� x ����
	 * @param m    ��� y ����
	 * @return �Ƿ�����Լ������
	 */
	// todo: ���Լ������
	public static boolean isValid(int[][] maze, int x, int y, int n, int m) {

		if (x < n && y < m && x >= 0 && y >= 0) {
			if (maze[x][y] == 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * ����Թ��Ƿ���ڿ���·��
	 *
	 * @param maze �Թ�
	 * @param x    ��ǰ x ����
	 * @param y    ��ǰ y ����
	 * @param n    ��� x ����
	 * @param m    ��� y ����
	 * @return �Ƿ���ڿ���·��
	 */
	// todo: ����Թ��Ƿ���ڿ���·��
	public static boolean solveMaze(int[][] maze, int x, int y, int n, int m) {
//    	int[] xMove= {0,0,1,-1};
//    	int[] yMove= {1,-1,0,0};
//    	for (int i = 0; i < xMove.length; i++) {
//    		int nextX=x+xMove[i];
//    		int nextY=y+yMove[i];
//			if(isValid(maze, nextX, nextY,n, m)) {
//				maze[nextX][nextY]=1;
//				solveMaze(maze, nextX,nextY,  n,  m);
//			}else {
//				maze[nextX][nextY]=1;
//			}
//		}
//    	if(x==n-1&&y==m-1) {//���ڴ�
//    		return true;
//    	}

		if (isValid(maze, x, y, n, m)) {
			maze[x][y] = 1;
			solveMaze(maze, x - 1, y, n, m);
			solveMaze(maze, x + 1, y, n, m);
			solveMaze(maze, x, y - 1, n, m);
			solveMaze(maze, x, y + 1, n, m);
			maze[x][y] = 0;
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[][] maze = { { 0, 0, 1, 0, 0, 0, 1, 0 }, { 0, 0, 1, 0, 0, 0, 1, 0 }, { 0, 0, 1, 0, 1, 1, 0, 1 },
				{ 0, 1, 1, 1, 0, 0, 1, 0 }, { 0, 0, 0, 1, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0, 1, 0, 1 },
				{ 0, 1, 1, 1, 1, 0, 0, 1 }, { 1, 0, 0, 0, 0, 1, 0, 1 }, { 1, 1, 0, 0, 0, 0, 0, 0 } };

		int n = maze.length;
		int m = maze[0].length;

		boolean solved = solveMaze(maze, 0, 0, n, m);
		System.out.println(solved);
	}

}
