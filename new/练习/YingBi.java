/**
 * 
 */
package ��ϰ;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ����(����)
 *
 */
public class YingBi {

	/**
	 * @param args
	 */
	public int money(int[]coins,int amount) {
		int sum=0;
		for (int i = 0; i <amount; i++) {//�������
			for (int j = 0; j < coins.length; j++) {//�������
				if(i==coins[j]) {
					sum++;
					break;
				}
				
			}
			
			
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

}
