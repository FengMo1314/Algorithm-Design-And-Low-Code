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
public class Test1 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 StopWatch s=new StopWatch();
		s.start();
//		RandomGenerator rg=new RandomGenerator();
		 int a[]=RandomGenerator.uniformInts(1000);
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[i] >= a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
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
