/**
 *
 */
package 课堂练习;

import random_随机数生成器.RandomGenerator;
import stopWatch_计时器.StopWatch;

/**
 * @author 柳和(本地)
 *
 */
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		StopWatch s = new StopWatch();
		s.start();
		int a[] =RandomGenerator.uniformInts(10);
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j;
			if (a[i] < a[i - 1]) {
				for (j = i - 1; j >= 0 && a[j] > temp; j--) {
					a[j + 1] = a[j];
					}
					a[j + 1] = temp;
				}
			}
		int sum=0;
		for (int element : a) {
			if(sum%10==0) {
				System.out.println();
			}
			System.out.print(element +",");
			sum++;
		}
		s.stop();
		System.out.println(s.getTime());
	}
}
