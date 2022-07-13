/**
 *
 */
package sort_排序方法;

/**
 * @author 柳和(本地)
 *
 */
public class KuaiSuSort {
	/*
	 * 快速排序法
	 */
	public static void quickSort(int[] a) {
		int len;
		if(a==null||(len=a.length)==0||len==1) {
			return;
		}
		quickSort(a,0,len-1);
	}
	public static void quickSort(int[] array,int left,int right) {
		if(left>right) {
			return;
		}
		//base里面存放基准数
		int base=array[left];
		int i=left,j=right;
		while(i!=j) {
			//顺序很重要,新从右边开始网左边找,直到找到b比base值小的数
			while(array[j]>=base&&i<j) {
				j--;
			}
			//再从左边向右边找,直到找到比base大的数
			while(array[i]<=base&&i<j) {
				i++;
			}
			//上述循环结束之后,找到位置或者(i>=j),交换两个数在数组中的位置
			if(i<j) {
				int tmp=array[i];
				array[i]=array[j];
				array[j]=tmp;
			}
		}
		//将基准数放到中间位置(基准数递归)
		array[left]=array[i];
		array[i]=base;
		//递归,继续向基准的左右两边执行和上述相同的操作
		//i的索引处为上面的已经确定好的基准值得位置,无需再处理
		quickSort(array,left,i-1);
		quickSort(array,i+1,right);
	}
}
