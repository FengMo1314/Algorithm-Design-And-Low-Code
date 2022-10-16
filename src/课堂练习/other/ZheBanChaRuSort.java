/**
 * 
 */
package 课堂练习.other;

/**
 * @author 柳和(本地)
 *
 */
public class ZheBanChaRuSort {
	/*
	 * 折半插入排序实现整型数据元素
	 */
	public static void binaryInsertSort(int[] a) {
		for(int i=1;i<a.length;i++) {
			if(a[i]<a[i-1]) {
				int temp=a[i];//缓存i所处的元素值
				int low=0;//记录搜索范围的左边界
				int high=i-1;//记录搜索范围的有边界
				while(low<=high) {
					int mid=(low+high)/2;//记录中间位置
					//比较中间位置数据和i处数据大小,以缩小搜索范围
					if(a[mid]<temp) {
						low=mid-1;
					}else {
						high=mid-1;
					}
				}
				//将low~i处数据整体向后移动一位
				for(int j=i ;j>low;j--) {
					a[j]=a[j-1];
				}
				a[low]=temp;
			}
		}
	}
}
