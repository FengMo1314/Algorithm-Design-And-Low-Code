/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Power003 {

	/**
	 * @param args
	 */
	 public static int[][] createMatrix() {
	        int[][] matrix = new int[5][5];

	        // todo: ��� 1 �У��� 1 ��Ϊ 25; ֮��ÿһ��������ǰһ����С 1������˳�����Ϊ�����ң����ϵ��£�
	      int f=25;
	        for(int i=0;i<matrix.length;i++) {
	        	 for(int j=0;j<matrix[i].length;j++) {
	        		 matrix[i][j]=f;
	        		 f--;
	 	        }
	        }

	        return matrix;
	    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 int[][] matrix = createMatrix();
	        System.out.println(matrix[0][4] == 21);
	        System.out.println(matrix[1][2] == 18);
	        System.out.println(matrix[2][0] == 15);
	}

}
