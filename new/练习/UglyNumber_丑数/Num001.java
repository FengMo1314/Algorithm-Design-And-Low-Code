/**
 * 
 */
package ��ϰ.UglyNumber_����;

/**
 * @author ����(����)
 *
 */
public class Num001 {

	/**
	 * @param args
	 */
	// todo: ���һ�����Ƿ���ϳ����Ĺ���
	public static boolean isUglyNum(int num) {
		if(num==2||num==3||num==5) {
			return true;
		}
		while (num % 2 == 0) {
			num = num / 2;
		}
		while (num % 3 == 0) {
			num = num / 3;
		}
		while (num % 5 == 0) {
			num = num / 5;
		}
		if (num == 1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(isUglyNum(1));
		System.out.println(isUglyNum(2));
		System.out.println(isUglyNum(8));
		System.out.println(isUglyNum(12));
		System.out.println(!isUglyNum(7));
	}

}
