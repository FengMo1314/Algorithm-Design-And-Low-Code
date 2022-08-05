/**
 *
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Queen001 {

	/**
	 * @param args
	 */
	/**
	 * �Ƿ������ָ��λ�÷Żʺ� ������������е��ұ�
	 *
	 * @param board ����
	 * @param row   ��
	 * @param col   ��
	 * @return �Ƿ���Է���
	 */
	// todo: �Ƿ������ָ��λ�÷Żʺ�
	public static boolean isValid(int[][] board, int row, int col) {// �÷���������
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
			// �ݣ�res[x][i] �з���false
			if ((res[x][i] != 0) || (res[i][y] != 0))
				return false; // �᣺res[i][y] �з���false
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
		// TODO �Զ����ɵķ������
		int queen = 4;
		int[][] board = new int[queen][queen];
		board[0][0] = 1;
		// Ĭ�ϲ�����ͬһ�У����������е��ұ�
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
