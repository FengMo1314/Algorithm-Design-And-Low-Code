/**
 *
 */
package unit_3_1_Assignment_rj00514;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 柳和(本地)
 *
 */
public class T32 {

	/**
	 * @param args
	 */
	public static Map<Long, BigInteger> cache = new HashMap<>();
	 public static BigInteger fib1(int n) {
	        if (n == 0 || n ==1) {
	            return BigInteger.valueOf(1);
	        }

	        BigInteger sum1 = BigInteger.valueOf(1), sum2 = BigInteger.valueOf(2);//截取下标为n-1的值
	        for (int i = 0; i < n - 2; i++) {
	            BigInteger tmp = sum1.add(sum2);
	            sum1 = sum2;
	            sum2 = tmp;
	        }

	        return sum2;
	    }

	public static BigInteger fib2(long l) {
		if (l <= 1) {
			return BigInteger.valueOf(1);
		}

		if (cache.containsKey(l)) {
			return cache.get(l);
		}

		BigInteger num = fib2(l - 1).add(fib2(l - 2));
		cache.put(l, num);

		return num;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		System.out.println("非递归"+fib1(sc.nextInt()));
		System.out.println("递归"+fib2(sc.nextLong()));
		sc.close();
	}

}
