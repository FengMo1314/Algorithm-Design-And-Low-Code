/**
 * 
 */
package f20220719����ʵ����̬�滮1;

/**
 * @author ����(����)
 *
 */
public class T4 {

	/**
	 * @param args
	 */
	public static int catalan(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] catalan = new int[n + 1];
        catalan[0] = 1;
        catalan[1] = 1;//��һ����������Ϊ1

        // todo: ʹ�ö�̬�滮�����õݹ飬��� n ����������
        int y = 0;
		int z = 0;
		for (int counter = 2; counter <=n; ++counter) {
			y = 4 * counter - 2;
			z = counter + 1;
			catalan[counter] = catalan[counter - 1]*y;
			catalan[counter] = catalan[counter]/z;
		}
        return catalan[n];
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 System.out.println(catalan(0) == 1);
	        System.out.println(catalan(1) == 1);
	        System.out.println(catalan(6) == 132);
	        System.out.println(catalan(16) == 35357670);
	}

}
