/**
 * 
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Image001 {

	/**
	 * @param args
	 */
	/**
     * 求给定整数的二进制位数
     * @param i 正整数
     * @return 二进制位数
     */
    public static int binaryLength(int i) {
        // todo: 计算给定整数的二进制位数
    	int sum=1;
    	i=i/2;
    	while(i>0){
			sum++;
			i/=2;
		}
    	return sum;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 System.out.println(binaryLength(1) == 1);
	        System.out.println(binaryLength(6) == 3);
	        System.out.println(binaryLength(255) == 8);
	}

}
