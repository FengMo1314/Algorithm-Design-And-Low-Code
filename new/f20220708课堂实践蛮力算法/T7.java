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
		
		for (int i = 0; i < s.length(); i++) {
			for (int j =i+1; j < s.length(); j++) {
				char a=s.charAt(i);
				char b=s.charAt(j);
				if(a=='A'&&b=='F') {
					sum++;
					
				}
			}
			
		}
		
	return sum;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("��������Ľ��Ϊ:" + new T7().zichuan("AFFBed09mfmFMD8FAFDDAF"));
	}

}
