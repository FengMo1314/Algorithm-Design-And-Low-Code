/**
 *
 */
package unit_3_1_Assignment_rj00514;

import java.util.Scanner;

/**
 * @author 柳和(本地)
 *
 */
public class T28 {

	/**
	 * @param args
	 */
	public long maxYue(long a, long b) {
		if (b==0) {
			return a;
		} else {
			return maxYue(b, a % b);
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		System.out.println(new T28().maxYue(a,b));
		sc.close();
	}

}
