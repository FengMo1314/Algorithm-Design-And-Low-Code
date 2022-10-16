/**
 * 
 */
package 课堂练习.other;

/**
 * @author 柳和(本地)
 *
 */
public class MaoPaoSort {
	/*
	 * 冒泡排序改进
	 */
	public static void sort(int[] a) {
		int max=a.length-1;
		for(int i=0;i<max;i++) {
			boolean flag=true;
			for(int j=0;j<max-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=false;
				}
			}
			if(flag) {
				break;
			}
		}
	}

}
