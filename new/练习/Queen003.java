/**
 *
 */
package ��ϰ;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ����(����)
 *
 */
public class Queen003 {

	/**
	 * @param args
	 */
	/**
	 * ���� n ���ʺ�����з���
	 */
	public static List<int[]> solutions = new ArrayList<>();

	/**
	 * ���� n ���ʺ󣬲��õ����п��ܵķ��÷���
	 *
	 * @param board ����
	 * @param col   ��ǰ��
	 */
	// todo: ���� n ���ʺ󣬲��õ����п��ܵķ��÷���
	public static void nQueen(int[][] board, int col, int[] solution) {
		// todo: ��ɿ��н��������col������������������ݹ���ֹ
		if (col >= board.length) {
			Queen000.printBoard(board, col);
			System.out.println();
			int[] sc = new int[solution.length];// ����solution
			for (int i = 0; i < solution.length; i++) {
				sc[i] = solution[i];
			}
			solutions.add(sc);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			// todo: �Ƿ�����Լ���������ʺ��ܲ��ܷ����ڵ�ǰλ��
			if (Queen001.check(board, i, col)) {
				solution[i] = col;
				// todo: ����ѷ��ûʺ�ĸ���
				board[i][col] = 1;
				// todo: ������һ�����������ĸ���
				nQueen(board, col + 1, solution);
				// todo: ����
				board[i][col] = 0;
			}

		}

	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
