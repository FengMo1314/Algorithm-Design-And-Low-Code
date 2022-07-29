/**
 * 
 */
package 练习;

import java.util.Arrays;

/**
 * @author 柳和(本地)
 *
 */
public class Knight002 {

	/**
	 * @param args
	 */

	/**
	 * 横向行走的步数限制
	 */
	static int[] xMove = { 2, 1, -1, -2, -2, -1, 1, 2 };
	/**
	 * 纵向行走的步数限制
	 */
	static int[] yMove = { 1, 2, 2, 1, -1, -2, -2, -1 };

	// 打印棋盘
	public static void printSolution(int[][] board) {
		int n = board.length;
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				System.out.format("%1$5s", board[x][y]);
			}
			System.out.println();
		}
	}

	/**
	 * 计算骑士是否可以不重复地走完棋盘，并返回行走线路
	 * 
	 * @param curX  当前位置 x 坐标
	 * @param curY  当前位置 y 坐标
	 * @param steps 行走步数
	 * @param board 棋盘
	 * @param n     棋盘大小
	 * @return 是否可以走完
	 */
	// todo: 是否可以不重复地走完棋盘，并返回行走线路
	public static boolean knightTour(int curX, int curY, int steps, int[][] board, int n) {
		if (steps == n * n) {
			return true;
		}
		for (int i = 0; i < board.length; i++) {			
			if (Knight001.isValid(curX + xMove[i], curY + yMove[i], board, n)) {
				board[curX +xMove[i]][curY + yMove[i]] = steps;
				knightTour(curX + xMove[i], curY + yMove[i], steps+1, board, n);
				board[curX + xMove[i]][curY + yMove[i]] = -8;
				}
			}	
		return false;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] board = new int[8][8];
		Arrays.stream(board).forEach(a -> Arrays.fill(a, -1));
		board[0][0] = 0;

		System.out.println(knightTour(0, 0, 1, board, board.length));
		printSolution(board);
	}

}
