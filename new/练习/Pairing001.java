/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Pairing001 {

	/**
	 * @param args
	 */
	 // todo: ʹ�ö�̬�滮���������Գɹ���һ���ж����ֿ���
    private static int countPairings(int n) {
    	if (n == 1 || n == 2) { // ����������ֿ�����
			return n;
		
		int i = 1, j = 2, sum = 0;
		for (int m =3; m <=n; m++) {
			/*
			 * 쳲��������еĵ�һ��͵ڶ�����1��1���ӵ����ʼÿһ�������Ϊǰ����֮�͡�
			 *  ���Դӵ����ʼ������
			 */
			sum =i*(n-1)+ j;// sumΪ��n����ֵ��i ��j �ֱ�Ϊn-2���n-1�
			i = j;
			j = sum;
		}
		return sum;
       
    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		  System.out.println(countPairings(6)==76 );
	}

}
