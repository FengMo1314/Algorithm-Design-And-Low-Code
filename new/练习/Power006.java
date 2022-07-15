/**
 * 
 */
package 练习;

/**
 * @author 柳和(本地)
 *
 */
public class Power006 {

	/**
	 * @param args
	 */
    public static int[][] matrixSplit(int[][] parent, int rowStart, int rowEnd, int colStart, int colEnd) {

        // todo: 计算子矩阵的大小并初始化
        int rows =rowEnd- rowStart;
        int cols = colEnd-colStart;
        int[][] result = new int[rows][cols];

        for (int row = 0, parentRow = rowStart; row < rows; row++, parentRow++) {

            // todo: 得到子矩阵对应位置的元素
           
        }

        return result;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 int[][] parent = new int[][] {{2, 3, -1}, {6, 1, -2}, {7, 5, 0}};
	        int[][] childExpect = new int[][] {{1, -2}, {5, 0}};

	        int[][] result = matrixSplit(parent, 1, 2, 1, 2);

	        System.out.println(result[0][0] == childExpect[0][0]);
	        System.out.println(result[1][1] == childExpect[1][1]);
	}

}
