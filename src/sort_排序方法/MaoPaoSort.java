/**
 *
 */
package sort_���򷽷�;

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
			System.out.println("��"+(i+1)+"��");
			for (int element : a) {
				System.out.println(element);
			}
		}
	}

	public static void main(String[] args) {
		int a[]={17,18,60,40,7,32,73,65,85};
		MaoPaoSort.sort(a);
	}

}
