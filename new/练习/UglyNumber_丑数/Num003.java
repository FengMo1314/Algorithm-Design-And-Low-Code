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
public class Num003 {

	/**
	 * @param args
	 */
	/*
	 * 丑数队列 ：1,2,3,4,5,6,8,9,10,12,15，..... 分队列： 2倍数队列：2,4,6,8,10,12,16,18,20,24,30
	 * 3倍数队列：3,6,9,12,15,18,24,27,30,36,45 5倍数队列：5,10,15,20,25,30,40,45,50,60,75
	 * 每次依次提取分队列中的首位数字，保留3者中最小的添加到结果，只有被提取过得队列依次向后，其余队列不动 如：第一次提取：(2,3,5),保留(2)
	 * 第二次提取：(4,3,5),保留(3) 第三次提取：(4,6,5),保留(4) 第四次提取：(6,6,5),保留(5)
	 * 第五次提取：(6,6,10),保留(6) 第六次提取：(8,9,10),保留(8) 第七次提取：(10,9,10),保留(9)
	 * 第八次提取：(10,12,10),保留(10) 第九次提取：(12,12,15),保留(12)
	 */
	// todo: 使用动态规划，得到第 n 个丑数
	public static int getUglyNum(int nth) {
		if (nth <= 0) {
			return 0;
		}
		List<Integer> list = new ArrayList<>();
		list.add(1);
		int m2 = 0, m3 = 0, m5 = 0, i2 = 0, i3 = 0, i5 = 0, min = 0;
		while (list.size() < nth) {
			m2 = list.get(i2) * 2;// 以2开始队列
			m3 = list.get(i3) * 3;// 以3开始队列
			m5 = list.get(i5) * 5;// 以5 开始队列
			min = Math.min(m2, Math.min(m3, m5));// 三个队列中所有开头最小的数为结果队列中的数
			list.add(min);// 所求添加进集合
			if (min == m2) {
				i2++;// 自增以更改以2开始的队列开头
			}
			if (min == m3) {
				i3++;// 自增以更改以3开始的队列开头
			}
			if (min == m5) {
				i5++;// 自增以更改以5开始的队列开头
			}
		}
		return list.get(nth - 1);// 下标从0开始，所以第nth个即集合下标为nth-1的
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(getUglyNum(1) == 1);
		System.out.println(getUglyNum(2) == 2);
		System.out.println(getUglyNum(8) == 9);
		System.out.println(getUglyNum(11) == 15);
		System.out.println(getUglyNum(150) == 5832);
//		System.out.println(getUglyNum(20));
	}

}
