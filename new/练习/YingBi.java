/**
 *
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class YingBi {

	/**
	 * @param args
	 */
	public int money(int[] coins, int amount) {
		int sum = 0;
		for (int i = 0; i < amount; i++) {// �������
			for (int coin : coins) {// �������
				if (i == coin) {
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
