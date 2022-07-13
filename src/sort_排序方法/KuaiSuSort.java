/**
 *
 */
package sort_���򷽷�;

/**
 * @author ����(����)
 *
 */
public class KuaiSuSort {
	/*
	 * ��������
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
		//base�����Ż�׼��
		int base=array[left];
		int i=left,j=right;
		while(i!=j) {
			//˳�����Ҫ,�´��ұ߿�ʼ�������,ֱ���ҵ�b��baseֵС����
			while(array[j]>=base&&i<j) {
				j--;
			}
			//�ٴ�������ұ���,ֱ���ҵ���base�����
			while(array[i]<=base&&i<j) {
				i++;
			}
			//����ѭ������֮��,�ҵ�λ�û���(i>=j),�����������������е�λ��
			if(i<j) {
				int tmp=array[i];
				array[i]=array[j];
				array[j]=tmp;
			}
		}
		//����׼���ŵ��м�λ��(��׼���ݹ�)
		array[left]=array[i];
		array[i]=base;
		//�ݹ�,�������׼����������ִ�к�������ͬ�Ĳ���
		//i��������Ϊ������Ѿ�ȷ���õĻ�׼ֵ��λ��,�����ٴ���
		quickSort(array,left,i-1);
		quickSort(array,i+1,right);
	}
}
