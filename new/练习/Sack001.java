/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Sack001 {

	/**
	 * @param args
	 */
	/**
	 * ���㱳���ڿ�������Ʒ������ֵ
	 * 
	 * @param b   ���������������
	 * @param w   ��Ʒ����
	 * @param v   ��Ʒ��ֵ
	 * @param idx �� i ����Ʒ
	 * @return ��������Ʒ������ֵ
	 */
	// todo: �õݹ���㱳���ڿ�������Ʒ������ֵ
	public static int knapsack(int b, int[] w, int[] v, int idx) {
		//������Ч���߱�����������
				if(idx<=0||b<=0) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
					return 0;
				}
				//��������õ�index����Ʒ�ļ�ֵ
				int res=knapsack(b,w,v,idx-1);
				//�����˵�index����Ʒ�ļ�ֵ
				if(w[idx]<=b) {
					//���ˣ���һ���е�index����Ʒ�ļ�ֵv[index],ͬʱ����������ʧw[index]
					res=Math.max(res,knapsack(b-w[idx],w,v,idx-1)+v[idx]);
				}
				return res;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int b = 10;
		int[] v = { 1, 3, 5, 9 };
		int[] w = { 2, 3, 4, 7 };
		int n = v.length;
		System.out.println(knapsack(b, w, v, n - 1) == 12);
	}
}
