/**
 * 
 */
package 练习;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 柳和(本地)
 *
 */
public class Num001 {

	/**
	 * @param args
	 */
	// todo: 检测一个数是否符合丑数的规则
	public static boolean isUglyNum(int num) {
		if(num==2||num==3||num==5) {
			return true;
		}
		while (num % 2 == 0) {
			num = num / 2;
		}
		while (num % 3 == 0) {
			num = num / 3;
		}
		while (num % 5 == 0) {
			num = num / 5;
		}
		if (num == 1) {
			return true;
		}
		return false;
	}
//	public static boolean isUglyNum2(int num){
//		if(num <= 0){
//			return false;
//		}
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		int m2 = 0, m3 = 0, m5 = 0, i2 = 0, i3 = 0, i5 = 0, min = 0;
//		while(list.size() <num){
//			m2 = list.get(i2) * 2;
//			m3 = list.get(i3) * 3;
//			m5 = list.get(i5) * 5;
//			min = Math.min(m2, Math.min(m3, m5));
//			list.add(min);
//			if(min == m2){
//				++i2;
//			}
//			if(min == m3){
//				++i3;
//			}
//			if(min == m5){
//				++i5;
//			}
//		}
//		return list.get(num-1)==1;
//	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(isUglyNum(1));
		System.out.println(isUglyNum(2));
		System.out.println(isUglyNum(8));
		System.out.println(isUglyNum(12));
		System.out.println(!isUglyNum(7));
//		System.out.println(isUglyNum2(1));
//		System.out.println(isUglyNum2(2));
//		System.out.println(isUglyNum2(8));
//		System.out.println(isUglyNum2(12));
//		System.out.println(!isUglyNum2(7));
	}

}
