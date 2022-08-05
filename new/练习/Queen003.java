/**
 *
 */
package 练习;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 柳和(本地)
 *
 */
public class Queen003 {

	/**
	 * @param args
	 */
	/**
	 * 放置 n 个皇后的所有方案
	 */
	public static List<int[]> solutions = new ArrayList<>();

	/**
	 * 放置 n 个皇后，并得到所有可能的放置方案
	 *
	 * @param board 棋盘
	 * @param col   当前列
	 */
	// todo: 放置 n 个皇后，并得到所有可能的放置方案
	public static void nQueen(int[][] board, int col, int[] solution) {
		// todo: 达成可行解的条件，col超过棋盘最大列数，递归终止
		if (col >= board.length) {
			Queen000.printBoard(board, col);
			System.out.println();
			int[] sc = new int[solution.length];// 复制solution
			for (int i = 0; i < solution.length; i++) {
				sc[i] = solution[i];
			}
			solutions.add(sc);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			// todo: 是否满足约束条件，皇后能不能放置在当前位置
			if (Queen001.check(board, i, col)) {
				solution[i] = col;
				// todo: 标记已放置皇后的格子
				board[i][col] = 1;
				// todo: 搜索下一个符合条件的格子
				nQueen(board, col + 1, solution);
				// todo: 回溯
				board[i][col] = 0;
			}

		}

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int queen = 4;
		int[][] board = new int[queen][queen];
		nQueen(board, 0, new int[queen]);
		System.out.println(solutions.size() == 2);

		for (int[] s : solutions) {
			int[][] b = new int[queen][queen];
			for (int i = 0; i < s.length; i++) {
				b[i][s[i]] = 1;
			}
			Queen000.printBoard(b, b.length);
			System.out.println();
		}

	}
}
