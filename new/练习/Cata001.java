/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Cata001 {

	/**
	 * @param args
	 */
	public static int catalan(int n) {
        if (n <= 1) {
            return 1;
        }

        // todo: ʹ�ü򵥵ݹ飬��� n ����������
      
			return catalan(n - 1) * 2 * (2 * n - 1) / (n + 1);
		

    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 System.out.println(catalan(0) == 1);
	        System.out.println(catalan(1) == 1);
	        System.out.println(catalan(6) == 132);
	        System.out.println(catalan(16) == 35357670);
	}

}
