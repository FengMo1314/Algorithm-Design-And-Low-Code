/**
 * 
 */
package f20220708����ʵ�������㷨;

/**
 * @author ����(����)
 *
 */
public class T7 {

	/**
	 * @param args
	 */
	public int zichuan(String s) {
		int sum = 0;
		int[] a = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'F') {
				a[i] = c;
			} else {
				a[i] = -1;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 1; i < a.length; i++) {
			if (a[i] == -1 && a[i - 1] != -1) {
				sum++;
			} else if (a[i] == -1 && a[i + 1] != -1) {
				sum++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("��������Ľ��Ϊ:" + new T7().zichuan("AFFBed09mfmFMD8FAFDDAF"));
	}

}
