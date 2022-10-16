/**
 * 
 */
package 课堂练习.other;

/**
 * @author 柳和(本地)
 *
 */
public class XuanZeSort {
	public XuanZeSort(double zu[]) {
		int i, j;
		for (i = 0; i < zu.length - 1; i++) {// 最外层循环表示趟数。
			int first = i;// 默认无序区第一个为i。
			for (j = first + 1; j < zu.length; j++) {// j初值为无序区的第二个元素（注意下标）。
				if (zu[first] > zu[j]) {// 找出最小的
					first = j;
				}
			} // first为最小值的下标
			double temp = 0;
			if (first != i) {// 将zu[first]交换到有序区第一个，从而使有序区长度增加1，无序区长度减少一
				temp = zu[i];
				zu[i] = zu[first];
				zu[first] = temp;
			}
		}
	}

}
