/**
 * 
 */
package f20220712����ʵ�����β���;

import java.util.Scanner;

/**
 * @author ����(����)
 *
 */
public class T7 {

	private static Scanner sc;
	/**
	 * @param args
	 */
	  public static void swap(int array[],int a,int b){//��������
	         int temp;
	         temp=array[a];
	         array[a]=array[b];
	         array[b]=temp;
	     }
	   public  static int Partition(int r[],int low,int high){
	        int i=low ;
	        int j=high;
	        int pivot=r[low];//��׼Ԫ��
	        while(i<j) {
	            while (i < j && r[j] > pivot) //����ɨ��
	                j--;

	                if (i < j) {
	                    swap(r, i++, j);
	                }
	                while (i < j && r[i] <= pivot) {//����ɨ��
	                    i++;
	                }
	                if (i < j) {
	                    swap(r, i, j--);
	                }
	            }
	        return i;
	    }
	    public static void QuickSort(int R[],int low,int high){//��������ݹ��㷨
	         int mid;
	         if(low<high){
	             mid=Partition(R,low,high);//��׼λ��
	             QuickSort(R,low,mid-1);//������ݹ��������
	             QuickSort(R,mid+1,high);//������ݹ��������
	             for(int i=0;i<R.length-1;i++) {
	            	 System.out.print(R[i]+"-");
	             }
	             System.out.println(R[R.length-1]);
	         }
	    }
	public static void main(String[] args) {
		sc = new Scanner (System.in);
	         int i;
	         int n;//���ݵĸ���
	        System.out.println("��������Ҫ����Ԫ�صĸ���");
	        n=sc.nextInt();
	        System.out.println("������Ҫ���������");
	        int []a=new int[n];
	         for (i=0;i<n;i++){
	             a[i]=sc.nextInt();
	         }
	         QuickSort(a,0,n-1);
	        System.out.println("����������");
	        for (i=0;i<n;i++){
	            System.out.print(a[i]+" ");
	        }
	        System.out.println();
	    }

	}


