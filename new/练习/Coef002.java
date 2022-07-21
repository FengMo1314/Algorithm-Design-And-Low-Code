/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Coef002 {

	/**
	 * @param args
	 */
	/*
	 * �������     1
	 *                           1 1 
	 *                           1 2 1
	 *                           1 3 3 1
	 *                           1 4 6 4 1
	 *                           1 5 10 10 5 1
	 */
	// todo: �ö�ά��̬�滮�� k ���ϵ��
	private static int binomialCoefficient(int n, int k) {
		int[][] memo = new int[n + 1][k + 1];
		for (int i = 0; i <= n; i++) {// �������
			for (int j = 0; j <= Math.min(i, k); j++) {// ����� ��
				if (j == 0 || j == i) {// ������ǵ�һ�к�б�ߣ��Խ��ߣ���Ϊ1
					memo[i][j] = 1;
				} else {// ��i�еĵ�j��==��i-1�е�j��+��i-1�е�j-1��
					memo[i][j] = memo[i - 1][j - 1] + memo[i - 1][j];
				}
			}
		}
		return memo[n][k];
	}

	private static int binomialCoefficient2(int n, int k) {
		/*
		 * C(n,k)=n!/[k!*(n-k)!]
		 * �������     
		 *                  n=0  1  k=0
		 *                  n=1  1 1 k=1
		 *                  n=2  1 2 1 k=2
		 *                  n=3  1 3 3 1 k=3
		 *                  n=4  1 4 6 4 1  k=4
		 *                  n=5  1 5 10 10 5 1 k=5
		 *                  
		 */
		int[] memo = new int[k + 1];//չ��ʽ������������ָ����1
		memo[0] = 1;//��һ��(n==0)����һ��1
		for (int i = 1; i <= n; i++) {//�����Ѷ����ӵڶ��п�ʼiΪn��ָ��
			for (int j = Math.min(i, k); j >=1; j--) {//jΪ��(k)��ָ�룬k������ָ��(i)��1
				memo[j] = memo[j] + memo[j - 1]; 
		    }
		}
		return memo[k];
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(binomialCoefficient(2, 3) == 0);
		System.out.println(binomialCoefficient(2, 0) == 1);
		System.out.println(binomialCoefficient(2, 2) == 1);
		System.out.println(binomialCoefficient(5, 2) == 10);
		System.out.println(binomialCoefficient(10, 5) == 252);
		System.out.println("C(2,3)="+binomialCoefficient2(2, 3));
		System.out.println("C(2,0)="+binomialCoefficient2(2, 0));
		System.out.println("C(2,2)="+binomialCoefficient2(2, 2));
		System.out.println("C(5,2)="+binomialCoefficient2(5, 2));
		System.out.println("C(10,5)="+binomialCoefficient2(10, 5));
	}

}
