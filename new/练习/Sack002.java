/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Sack002 {

	/**
	 * @param args
	 */
	/**
     * ���㱳���ڿ�������Ʒ������ֵ
     * @param b ���������������
     * @param w ��Ʒ����
     * @param v ��Ʒ��ֵ
     * @param n ��Ʒ������
     * @return ��������Ʒ������ֵ
     */
    // todo: �ö�̬�滮���㱳���ڿ�������Ʒ������ֵ
    public static int knapsack(int b, int[] w, int[] v, int n) {
        
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int b = 10;
        int[] v = { 1, 3, 5, 9 };
        int[] w = { 2, 3, 4, 7 };
        int n = v.length;
        System.out.println(knapsack(b, w, v, n) == 12);
	}

}
