/**
 * 
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Pairing001 {

	/**
	 * @param args
	 */
	 // todo: 使用动态规划，求单身或配对成功，一共有多少种可能
    private static int countPairings(int n) {
    	if (n == 1 || n == 2) { // 特殊情况，分开讨论
			return n;
		
		int i = 1, j = 2, sum = 0;
		for (int m =3; m <=n; m++) {
			/*
			 * 斐波那契数列的第一项和第二项是1、1，从第三项开始每一项的数字为前两项之和。
			 *  所以从第三项开始迭代。
			 */
			sum =i*(n-1)+ j;// sum为第n项数值，i 、j 分别为n-2项和n-1项。
			i = j;
			j = sum;
		}
		return sum;
       
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		  System.out.println(countPairings(6)==76 );
	}

}
