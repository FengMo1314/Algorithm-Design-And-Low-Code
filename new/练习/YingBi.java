/**
 * 
 */
package 练习;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 柳和(本地)
 *
 */
public class YingBi {

	/**
	 * @param args
	 */
	public int money(int[]coins,int amount) {
		int sum=0;
		for (int i = 0; i <amount; i++) {//金额序列
			for (int j = 0; j < coins.length; j++) {//面额序列
				if(i==coins[j]) {
					sum++;
					break;
				}
				
			}
			
			
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
