/**
 * 
 */
package ������ϰ.other;

/**
 * @author ����(����)
 *
 */
public class MaoPaoSort {
	/*
	 * ð������Ľ�
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
