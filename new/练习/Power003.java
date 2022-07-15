/**
 * 
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Power003 {

	/**
	 * @param args
	 */
	 public static int[][] createMatrix() {
	        int[][] matrix = new int[5][5];

	        // todo: 设第 1 行，第 1 列为 25; 之后每一个数都比前一个数小 1（访问顺序假设为从左到右，从上到下）
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
		// TODO 自动生成的方法存根
		 int[][] matrix = createMatrix();
	        System.out.println(matrix[0][4] == 21);
	        System.out.println(matrix[1][2] == 18);
	        System.out.println(matrix[2][0] == 15);
	}

}
