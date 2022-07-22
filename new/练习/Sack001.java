/**
 * 
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Sack001 {

	/**
	 * @param args
	 */
	/**
	 * 计算背包内可容纳物品的最大价值
	 * 
	 * @param b   背包最大重量限制
	 * @param w   物品重量
	 * @param v   物品价值
	 * @param idx 第 i 种物品
	 * @return 背包内物品的最大价值
	 */
	// todo: 用递归计算背包内可容纳物品的最大价值
	public static int knapsack(int b, int[] w, int[] v, int idx) {
		if (idx <0||b<=0) {//背包容量低于0与所取得的物品不够停止
			return 0;
		}
		int maxW=knapsack(b,w,v,idx-1);//
		return  maxW;

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int b = 10;
		int[] v = { 1, 3, 5, 9 };
		int[] w = { 2, 3, 4, 7 };
		int n = v.length;
		System.out.println(knapsack(b, w, v, n - 1) == 12);
	}
}
