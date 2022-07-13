/**
 * 
 */
package f20220712课堂实践分治策略;

import java.util.Scanner;

/**
 * @author 柳和(本地)
 *
 */
public class T7 {

	private static Scanner sc;
	/**
	 * @param args
	 */
	  public static void swap(int array[],int a,int b){//交换函数
	         int temp;
	         temp=array[a];
	         array[a]=array[b];
	         array[b]=temp;
	     }
	   public  static int Partition(int r[],int low,int high){
	        int i=low ;
	        int j=high;
	        int pivot=r[low];//基准元素
	        while(i<j) {
	            while (i < j && r[j] > pivot) //向左扫描
	                j--;

	                if (i < j) {
	                    swap(r, i++, j);
	                }
	                while (i < j && r[i] <= pivot) {//向右扫描
	                    i++;
	                }
	                if (i < j) {
	                    swap(r, i, j--);
	                }
	            }
	        return i;
	    }
	    public static void QuickSort(int R[],int low,int high){//快速排序递归算法
	         int mid;
	         if(low<high){
	             mid=Partition(R,low,high);//基准位置
	             QuickSort(R,low,mid-1);//左区间递归快速排序
	             QuickSort(R,mid+1,high);//右区间递归快速排序
	             for(int i=0;i<R.length-1;i++) {
	            	 System.out.print(R[i]+"-");
	             }
	             System.out.println(R[R.length-1]);
	         }
	    }
	public static void main(String[] args) {
		sc = new Scanner (System.in);
	         int i;
	         int n;//数据的个数
	        System.out.println("请先输入要排序元素的个数");
	        n=sc.nextInt();
	        System.out.println("请输入要排序的数据");
	        int []a=new int[n];
	         for (i=0;i<n;i++){
	             a[i]=sc.nextInt();
	         }
	         QuickSort(a,0,n-1);
	        System.out.println("排序后的数据");
	        for (i=0;i<n;i++){
	            System.out.print(a[i]+" ");
	        }
	        System.out.println();
	    }

	}


