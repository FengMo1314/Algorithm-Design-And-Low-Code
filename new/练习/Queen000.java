/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Queen000 {

	/**
	 * @param args
	 */
	/**
     * ��ӡ����
     * @param board ����
     * @param n ���̴�С
     */
    public static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 int queen = 4;
	        int[][] board = new int[queen][queen];
	        board[0][0] = 1;
	        board[1][2] = 1;
	        board[3][1] = 1;
	        printBoard(board, queen);
	}

}
