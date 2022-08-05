/**
 *
 */
package f20220715����ʵ�����β���2;

import java.util.Scanner;

/**
 * @author ����(����)
 *
 */
public class T3 {

	private static Scanner sc;

	/**
	 * @param args
	 */
	/*
	 * ��λ����
	 */
	public static int[][] identity(int rows, int cols) {
		int[][] id = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == j) {
					id[i][j] = 1;
				}
			}
		}
		return id;
	}

	/*
	 * ����˷����� ��߾����ÿһ�е�Ԫ������*�ұ߾����ÿһ�е���ӦԪ�أ���Ϊ�������ĳ��λ�õ�Ԫ��ֵ
	 */
	public static int[][] MX(int[][] a, int[][] b) {
		int tr = a.length;
		int td = b[0].length;
		int[][] output = new int[tr][td];
		for (int i = 0; i < tr; i++) {
			for (int j = 0; j < td; j++) {
				for (int k = 0; k < b.length; k++) {
					output[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return output;
	}

	/*
	 * �������
	 */
	public static int[][] MXX(int[][] a, int n) {
		if (n == 0) {
			return identity(a.length, a[0].length);
		}
		if (n == 1) {
			return a;
		}
		int[][] temp;
		int[][] result;
		if (n % 2 == 0) {
			temp = MXX(a, n / 2);
			result = MX(temp, temp);
			return result;
		} else {
			temp = MXX(a, (n - 1) / 2);
			result = MX(MX(temp, temp), a);
			return result;
		}
	}

	public static int[][] getM(int tr, int td) {
		sc = new Scanner(System.in);
		int[][] array = new int[tr][td];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		return array;
	}

	public static void print(int array[][]) {
		System.out.println("�������");
		for (int[] element : array) {
			for (int j = 0; j < element.length; j++) {
				System.out.print(element[j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[][] a = getM(2, 2);
		int[][] result = MXX(a, 16);
		print(result);
	}

}
