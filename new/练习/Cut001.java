/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Cut001 {

	/**
	 * @param args
	 */
	 // todo: ʹ�õݹ�������۸�
    private static int cutRod(int[] price, int index, int n) {
    	 if (index == 0) {
             return 0;
         } else {
             n = 0;
             if (index > price.length - 1) {
                n = -1;
             } else {
               n = price[index];
             }
             for (int i = 1; i < index; i++) {
                 n = Math.max(n, cutRod(price, index - i-1,n) +price[i]);
                 if(i>price.length-1) {
                	 break;
                 }
             }
             return n;
         }
    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 int[] arr = { 1, 3, 7, 11, 15, 16, 17, 22 };
	        int size = arr.length;
	        System.out.println(cutRod(arr, size - 1, size));
	}

}
