/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Image001 {

	/**
	 * @param args
	 */
	/**
     * ����������Ķ�����λ��
     * @param i ������
     * @return ������λ��
     */
    public static int binaryLength(int i) {
        // todo: ������������Ķ�����λ��
    	int sum=1;
    	i=i/2;
    	while(i>0){
			sum++;
			i/=2;
		}
    	return sum;
    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 System.out.println(binaryLength(1) == 1);
	        System.out.println(binaryLength(6) == 3);
	        System.out.println(binaryLength(255) == 8);
	}

}
