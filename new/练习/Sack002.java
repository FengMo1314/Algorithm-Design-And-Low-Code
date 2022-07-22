/**
 * 
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Sack002 {

	/**
	 * @param args
	 */
	/**
     * 计算背包内可容纳物品的最大价值
     * @param b 背包最大重量限制
     * @param w 物品重量
     * @param v 物品价值
     * @param n 物品的种类
     * @return 背包内物品的最大价值
     */
    // todo: 用动态规划计算背包内可容纳物品的最大价值
    public static int knapsack(int b, int[] w, int[] v, int n) {
        
    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int b = 10;
        int[] v = { 1, 3, 5, 9 };
        int[] w = { 2, 3, 4, 7 };
        int n = v.length;
        System.out.println(knapsack(b, w, v, n) == 12);
	}

}
