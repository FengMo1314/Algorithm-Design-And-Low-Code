/**
 *
 */
package ��ϰ;

import java.util.Arrays;

/**
 * @author ����(����)
 *
 */
public class Knight001 {

	/**
	 * @param args
	 */
	/**
	 * �ж��Ƿ���Է�����ʿ
	 *
	 * @param x     ������
	 * @param y     ������
	 * @param board ����
	 * @param n     ���̴�С
	 * @return �Ƿ���Է���
	 */
	// todo: �ж��Ƿ�����ڸ�������ʾ��λ�÷�����ʿ
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
		// TODO �Զ����ɵķ������
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
