/**
 * 
 */
package ��ϰ;

import java.util.Arrays;

/**
 * @author ����(����)
 *
 */
public class Knight002 {

	/**
	 * @param args
	 */

	/**
	 * �������ߵĲ�������
	 */
	static int[] xMove = { 2, 1, -1, -2, -2, -1, 1, 2 };
	/**
	 * �������ߵĲ�������
	 */
	static int[] yMove = { 1, 2, 2, 1, -1, -2, -2, -1 };

	// ��ӡ����
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
	 * ������ʿ�Ƿ���Բ��ظ����������̣�������������·
	 * 
	 * @param curX  ��ǰλ�� x ����
	 * @param curY  ��ǰλ�� y ����
	 * @param steps ���߲���
	 * @param board ����
	 * @param n     ���̴�С
	 * @return �Ƿ��������
	 */
	// todo: �Ƿ���Բ��ظ����������̣�������������·
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
		// TODO �Զ����ɵķ������
		int[][] board = new int[8][8];
		Arrays.stream(board).forEach(a -> Arrays.fill(a, -1));
		board[0][0] = 0;

		System.out.println(knightTour(0, 0, 1, board, board.length));
		printSolution(board);
	}

}
