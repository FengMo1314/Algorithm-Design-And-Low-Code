/**
 * 
 */
package f20220708课堂实践蛮力算法;

/**
 * @author 柳和(本地)
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
		// TODO 自动生成的方法存根
		System.out.println("符合题意的结果为:" + new T7().zichuan("AFFBed09mfmFMD8FAFDDAF"));
	}

}
