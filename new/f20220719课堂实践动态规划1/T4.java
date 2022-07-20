/**
 * 
 */
package f20220719课堂实践动态规划1;

/**
 * @author 柳和(本地)
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
        catalan[1] = 1;//第一个卡塔兰数为1

        // todo: 使用动态规划，不用递归，求第 n 个卡塔兰数
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
		// TODO 自动生成的方法存根
		 System.out.println(catalan(0) == 1);
	        System.out.println(catalan(1) == 1);
	        System.out.println(catalan(6) == 132);
	        System.out.println(catalan(16) == 35357670);
	}

}
