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
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		StopWatch s = new StopWatch();
		s.start();
		int zu[] =RandomGenerator.uniformInts(100);
		int i, j;
		for (i = 0; i < zu.length - 1; i++) {// 最外层循环表示趟数。
			int first = i;// 默认无序区第一个为i。
			for (j = first + 1; j < zu.length; j++) {// j初值为无序区的第二个元素（注意下标）。
				if (zu[first] > zu[j]) {// 找出最小的
					first = j;
				}
			} // first为最小值的下标
			int temp = 0;
			if (first != i) {// 将zu[first]交换到有序区第一个，从而使有序区长度增加1，无序区长度减少一
				temp = zu[i];
				zu[i] = zu[first];
				zu[first] = temp;
			}
		}
		int sum = 0;
		for (j = 0; j < zu.length; j++) {
			if (sum % 10 == 0) {
				System.out.println();
			}
			System.out.print(zu[j] + ",");
			sum++;
		}
		s.stop();
		System.out.println(s.getTime());
	}

}
