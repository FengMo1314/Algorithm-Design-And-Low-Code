/**
 *
 */
package 练习;

import java.util.Arrays;

/**
 * @author 柳和(本地)
 *
 */
public class Knight001 {

	/**
	 * @param args
	 */
	/**
	 * 判断是否可以放置骑士
	 *
	 * @param x     横坐标
	 * @param y     纵坐标
	 * @param board 棋盘
	 * @param n     棋盘大小
	 * @return 是否可以放置
	 */
	// todo: 判断是否可以在该坐标所示的位置放置骑士
	public static boolean isValid(int x, int y, int[][] board, int n) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = -8;
			}
		}
		int st = 0, ed = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != -8) {
					st = i;
					ed = j;
					break;
				}
			}
		}
		for (int[] element : board) {
			for (int j = 0; j < element.length; j++) {
				if (element[j] == -8 && (Math.abs(st - x) == 1 && Math.abs(ed - y) == 2)) {
					return true;
				}
				if (element[j] == -8 && (Math.abs(y - ed) == 1 && Math.abs(st - x) == 2)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] board = new int[8][8];
		Arrays.stream(board).forEach(a -> Arrays.fill(a, -1));
		board[0][0] = 0;

		System.out.println(!isValid(0, 0, board, board.length));
		System.out.println(isValid(2, 1, board, board.length));
		System.out.println(!isValid(-1, 1, board, board.length));
		System.out.println(!isValid(2, 8, board, board.length));
		System.out.println(!isValid(8, 0, board, board.length));
	}

}
