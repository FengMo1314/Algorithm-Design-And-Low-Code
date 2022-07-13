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
public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		StopWatch s = new StopWatch();
		s.start();
		int a[] = RandomGenerator.uniformInts(100000000);
		int h = 1;// 计算出最大的h值

		while (h <= a.length / 3) {
			// 使用Knuth增量序列
			h = h * 3 + 1;
		}
		while (h > 0) {
			for (int i = h; i < a.length; i++) {
				if (a[i] < a[i - h]) {
					int tmp = a[i];
					int j = i - h;
					while (j >= 0 && a[j] > tmp) {
						a[j + h] = a[j];
						j -= h;
					}
					a[j + h] = tmp;
				}
			}
			// 计算出下一个h值(h - 1)/ 3;h =100%
			h = (h - 1) / 3;
		}
		s.stop();
//		int sum = 0;
//		for (int j = 0; j < a.length; j++) {
//			if (sum % 10 == 0) {
//				System.out.println();
//			}
//			System.out.print(a[j] + ",");
//			sum++;
//		}

		System.out.println(s.getTime());
	}
}
