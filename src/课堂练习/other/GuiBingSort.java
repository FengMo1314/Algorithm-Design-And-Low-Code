/**
 * 
 */
package ������ϰ.other;

/**
 * @author ����(����)
 *
 */
/*
 * �鲢���򷽷�
 */
public class GuiBingSort {
	/*
	 * �Զ����¹鲢����
	 */
	public static void upToDownMergeSort(int a[]){
	mergeSort(0,a.length-1,a);
	}

	// �Զ����¹鲢��������㷨
		public static void mergeSort(int low, int high, int a[]) {
			if (low < high) {
				// �ֽ�
				int mid = (low + high) / 2;
				// �ݹ�ض��������
				mergeSort(low, mid, a);
				// �ݹ�ض��ұ�����
				mergeSort(mid + 1, high, a);
				merge(low, mid, high, a);// �������������кϲ�Ϊһ����������һ
			}
		}

		// �ϲ���������
		public static void merge(int low, int mid, int high, int a[]) {
			// ����ת������
			int b[] = new int[a.length];
			int f = low, s = mid + 1, p = low;
			// fΪ��һ������������sΪ�ڶ�������������pΪb��������
			while (f <= mid && s <= high) {
				// ����������Ԫ����ֵС��һ������b����
				if (a[f] <= a[s]) {
					b[p] = a[f];
					f++;
				} else {
					b[p] = a[s];
					s++;
				}
				p++;
			}

			if (f == mid + 1) {
				/* ����һ�������е�Ԫ��ȫ���洢��ȥ�ˣ���ô���ڶ��������е�ʣ��Ԫ��ȫ������b���� */
				for (; s <= high && p <= high; p++, s++) {
					b[p] = a[s];
				}
			} else {
				// ���򽫵�һ�������е�Ԫ��ȫ������b����
				for (; f <= mid && p <= high; p++, f++) {
					b[p] = a[f];
				}
			}

			for (int i = low; i <= high; i++)
				a[i] = b[i];
		}
		/*
		 * �Ե����Ϲ鲢����
		 */
		public static void bottomToUpMergeSort(int a[]){
			int i,s,t=1;
			while(t<a.length-1){
				s=t;
				t=2*s;
				i=0;
				for(;i+t<a.length;i=i+t) {
					merge2(i,i+s-1,i+t-1,a);
				}
				if(i+s-1<a.length) {
					merge2(i,i+s-1,a.length-1,a);
				}
			}
		}
		//�ϲ��������з���
		public static void merge2(int low, int mid, int high, int a[]) {
			// ����ת������
			int b[] = new int[a.length];
			int f = low, s = mid + 1, p = low;
			// fΪ��һ������������sΪ�ڶ�������������pΪb��������
			while (f <= mid && s <= high) {
				// ����������Ԫ����ֵС��һ������b����
				if (a[f] <= a[s]) {
					b[p] = a[f];
					f++;
				} else {
					b[p] = a[s];
					s++;
				}
				p++;
			}

			if (f == mid + 1) {
				/* ����һ�������е�Ԫ��ȫ���洢��ȥ�ˣ���ô���ڶ��������е�ʣ��Ԫ��ȫ������b���� */
				for (; s <= high && p <= high; p++, s++) {
					b[p] = a[s];
				}
			} else {
				// ���򽫵�һ�������е�Ԫ��ȫ������b����
				for (; f <= mid && p <= high; p++, f++) {
					b[p] = a[f];
				}
			}

			for (int i = low; i <= high; i++)
				a[i] = b[i];
		}
}
