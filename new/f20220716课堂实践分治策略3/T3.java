/**
 *
 */
package f20220716����ʵ�����β���3;

import java.util.Scanner;

/**
 * @author ����(����)
 *
 */
public class T3 {

	/**
	 * @param args
	 */
	public static int[][] matrixSplit(int[][] parent, int rowStart, int rowEnd, int colStart, int colEnd) {

		// todo: �����Ӿ���Ĵ�С����ʼ��
		int rows = rowEnd - rowStart + 1;
		int cols = colEnd - colStart + 1;
		int[][] result = new int[rows][cols];

		for (int row = 0, parentRow = rowStart; row < rows; row++, parentRow++) {
			for (int col = 0, parentCol = colStart; col < cols; col++, parentCol++) {
				// todo: �õ��Ӿ����Ӧλ�õ�Ԫ��
				result[row][col] = parent[parentRow][parentCol];
			}
		}
		return result;
	}

	public static void matrixJoin(int[][] child, int[][] parent, int rowStart, int colStart) {

		int rows = child.length;
		int cols = child[0].length;

		for (int row = 0, parentRow = rowStart; row < rows; row++, parentRow++) {
			for (int col = 0, parentCol = colStart; col < cols; col++, parentCol++) {
				// todo: �õ�˫�׾����Ӧλ�õ�Ԫ��
				parent[parentRow][parentCol] = child[row][col];
			}
		}
	}

	public static int[][] matrixAdd(int[][] m1, int[][] m2) {
		int rows = m1.length;
		int cols = m1[0].length;
		int[][] result = new int[rows][cols];
		// todo: ���������Ӧλ�õ�Ԫ�صĺ�
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}

		return result;
	}

	public static int[][] matrixSub(int[][] m1, int[][] m2) {
		int rows = m1.length;
		int cols = m1[0].length;
		int[][] result = new int[rows][cols];
		// todo: ���������Ӧλ�õ�Ԫ�صĲ�
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = m1[i][j] - m2[i][j];
			}
		}
		return result;
	}

	public static int[][] strassen(int[][] m1, int[][] m2) {
		int n = m1.length;
		int[][] result = new int[n][n];

		if (n == 1) {
			result[0][0] = m1[0][0] * m2[0][0];
		} else {
			// todo: �ָ���� A11~A22, B11~B22
			int[][] A11 = matrixSplit(m1, 0, n / 2 - 1, 0, n / 2 - 1);
			int[][] A12 = matrixSplit(m1, 0, n / 2 - 1, n / 2, n - 1);
			int[][] A21 = matrixSplit(m1, n / 2, n - 1, 0, n / 2 - 1);
			int[][] A22 = matrixSplit(m1, n / 2, n - 1, n / 2, n - 1);
			int[][] B11 = matrixSplit(m2, 0, n / 2 - 1, 0, n / 2 - 1);
			int[][] B12 = matrixSplit(m2, 0, n / 2 - 1, n / 2, n - 1);
			int[][] B21 = matrixSplit(m2, n / 2, n - 1, 0, n / 2 - 1);
			int[][] B22 = matrixSplit(m2, n / 2, n - 1, n / 2, n - 1);
			// todo: ����������
			int[][] M1 = strassen(A11, matrixSub(B12, B22));
			int[][] M2 = strassen(matrixAdd(A11, A12), B22);
			int[][] M3 = strassen(matrixAdd(A21, A22), B11);
			int[][] M4 = strassen(A22, matrixSub(B21, B11));
			int[][] M5 = strassen(matrixAdd(A11, A22), matrixAdd(B11, B22));
			int[][] M6 = strassen(matrixSub(A12, A22), matrixAdd(B21, B22));
			int[][] M7 = strassen(matrixSub(A11, A21), matrixAdd(B11, B12));
			// todo: �����м����
			int[][] C11 = matrixAdd(matrixSub(matrixAdd(M5, M4), M2), M6);
			int[][] C12 = matrixAdd(M1, M2);
			int[][] C21 = matrixAdd(M3, M4);
			int[][] C22 = matrixSub(matrixSub(matrixAdd(M5, M1), M3), M7);
			// todo: �ϳɾ���
			matrixJoin(C11, result, 0, 0);
			matrixJoin(C12, result, 0, n / 2);
			matrixJoin(C21, result, n / 2, 0);
			matrixJoin(C22, result, n / 2, n / 2);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("�����������һ�������" + i + 1 + "��");
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("����������ڶ��������" + i + "��");
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(strassen(a, b)[i][j] + "\t");
			}
			System.err.println();
		}

	}

}
