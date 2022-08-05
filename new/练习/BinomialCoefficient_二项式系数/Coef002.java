/**
 *
 */
package 练习.BinomialCoefficient_二项式系数;

/**
 * @author 柳和(本地)
 *
 */
public class Coef002 {

	/**
	 * @param args
	 */
	/*
	 * 杨辉三角 1 1 1 1 2 1 1 3 3 1 1 4 6 4 1 1 5 10 10 5 1 0 1 2 3 4 5 j->
	 */
	// todo: 用二维动态规划求 k 项的系数
	private static int binomialCoefficient(int n, int k) {
		int[][] memo = new int[n + 1][k + 1];
		for (int i = 0; i <= n; i++) {// 组合数下
			for (int j = 0; j <= Math.min(i, k); j++) {// 组合数 上
				if (j == 0 || j == i) {// 杨辉三角第一列和斜边（对角线）处为1
					memo[i][j] = 1;
				} else {// 第i行的第j个==第i-1行第j个+第i-1行第j-1个
					memo[i][j] = memo[i - 1][j - 1] + memo[i - 1][j];
				}
			}
		}
		return memo[n][k];
	}

	private static int binomialCoefficient2(int n, int k) {
		/*
		 * C(n,k)=n!/[k!*(n-k)!] 杨辉三角 n=0 1 k=0 n=1 1 1 k=1 n=2 1 2 1 k=2 n=3 1 3 3 1k=3
		 * n=4 1 4 6 4 1 k=4 n=5 1 5 10 10 5 1 k=5
		 *
		 */
		int[] memo = new int[k + 1];// 展开式的项数比其幂指数多1
		memo[0] = 1;// 第一行(n==0)仅有一个1
		for (int i = 1; i <= n; i++) {// 首行已定，从第二行开始i为n的指针
			for (int j = k; j >= 1; j--) {// j为列(k)的指针，k最大比行指针(i)多1
				memo[j] = memo[j] + memo[j - 1];
			}
		}
		return memo[k];
	}

	/*
	 * 杨辉三角 1 0 0 0 0 0 0 1 1 0 0 0 0 0 1 2 1 0 0 0 0 1 3 3 1 0 0 0 1 4 6 4 1 0 0 1
	 * 5 10 10 5 1
	 */
	private static int binomialCoefficient3(int n, int k) {
		int[][] memo = new int[n + 1][n + 1];
		if (k > n) { // 特殊情况单独处理
			return 0;
		}
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (i == j || j == 0) {
					memo[i][j] = 1;
				} else {
					memo[i][j] = memo[i - 1][j - 1] + memo[i - 1][j];
				}
			}
		}
		return memo[n][k];
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(binomialCoefficient(2, 3) == 0);
		System.out.println(binomialCoefficient(2, 0) == 1);
		System.out.println(binomialCoefficient(2, 2) == 1);
		System.out.println(binomialCoefficient(5, 2) == 10);
		System.out.println(binomialCoefficient(10, 5) == 252);
		System.out.println("C(2,3)=" + binomialCoefficient2(2, 3));
		System.out.println("C(2,0)=" + binomialCoefficient2(2, 0));
		System.out.println("C(2,2)=" + binomialCoefficient2(2, 2));
		System.out.println("C(5,2)=" + binomialCoefficient2(5, 2));
		System.out.println("C(10,5)=" + binomialCoefficient2(10, 5));
		System.out.println(binomialCoefficient3(2, 3) == 0);
		System.out.println(binomialCoefficient3(2, 0) == 1);
		System.out.println(binomialCoefficient3(2, 2) == 1);
		System.out.println(binomialCoefficient3(5, 2) == 10);
		System.out.println(binomialCoefficient3(10, 5) == 252);
	}

}
