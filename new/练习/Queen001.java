/**
 *
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Queen001 {

	/**
	 * @param args
	 */
	/**
	 * 是否可以在指定位置放皇后 假设放在现有列的右边
	 *
	 * @param board 棋盘
	 * @param row   行
	 * @param col   列
	 * @return 是否可以放置
	 */
	// todo: 是否可以在指定位置放皇后
	public static boolean isValid(int[][] board, int row, int col) {// 该方法有问题
		if (row == 0) {
			for (int i = 0; i <= col; i++) {
				if (board[0][i] != 0) {
					return false;
				}
			}
		} else {
			for (int i = row; i >= 0; i--) {
				for (int j = col; j >= 0; j--) {
					if (row != col) {
						if (board[i - 1][j] != 0 || board[i][j - 1] != 0) {
							return false;
						}
						if ((i - j == row - col || i - j == col - row) && board[i - 1][j - 1] != 0) {
							return false;
						}
					} else {
						if (board[i - 1][j - 1] != 0 || board[i - 1][j] != 0 || board[i][j - 1] != 0) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	static boolean check(int res[][], int x, int y) {
		for (int i = 0; i < res.length; i++) {
			// 纵：res[x][i] 有返回false
			if ((res[x][i] != 0) || (res[i][y] != 0))
				return false; // 横：res[i][y] 有返回false
			for (int j = 0; j < res.length; j++) {
				if (i + j == x + y && res[i][j] != 0)
					return false;
				if (i - j == x - y && res[i][j] != 0)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int queen = 4;
		int[][] board = new int[queen][queen];
		board[0][0] = 1;
		// 默认不放在同一列，放在现有列的右边
//		System.out.println(!isValid(board, 0, 1));
//		System.out.println(!isValid(board, 1, 1));
//		System.out.println(!isValid(board, 2, 2));
//		System.out.println(isValid(board, 2, 3));
//		System.out.println(isValid(board, 3, 1));
		System.out.println(!check(board, 0, 1));
		System.out.println(!check(board, 1, 1));
		System.out.println(!check(board, 2, 2));
		System.out.println(check(board, 2, 3));
		System.out.println(check(board, 3, 1));
	}

}
