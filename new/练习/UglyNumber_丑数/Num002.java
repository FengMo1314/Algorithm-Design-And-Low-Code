/**
 *
 */
package 练习.UglyNumber_丑数;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 柳和(本地)
 *
 */
public class Num002 {

	/**
	 * @param args
	 */
	// todo: 使用蛮力算法，得到第 n 个丑数
	public static int getUglyNum(int nth) {
		int i = 0, j = 0;
		List<Integer> list = new ArrayList<>();
		while (i < nth) {
			j++;// 自然数累加测试
			if (Num001.isUglyNum(j)) {
				list.add(j);
				++i;// i与nth为共性，
			}
		}
		return list.get(nth - 1);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(getUglyNum(1) == 1);
		System.out.println(getUglyNum(2) == 2);
		System.out.println(getUglyNum(8) == 9);
		System.out.println(getUglyNum(11) == 15);
		System.out.println(getUglyNum(150) == 5832);
	}

}
