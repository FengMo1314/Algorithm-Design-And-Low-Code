/**
 * 
 */
package 练习;

/**
 * @author 柳和(本地)
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

        // todo: 使用简单递归，求第 n 个卡塔兰数
      
			return catalan(n - 1) * 2 * (2 * n - 1) / (n + 1);
		

    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 System.out.println(catalan(0) == 1);
	        System.out.println(catalan(1) == 1);
	        System.out.println(catalan(6) == 132);
	        System.out.println(catalan(16) == 35357670);
	}

}
