/**
 * 
 */
package ��ϰ;

import javax.swing.border.Border;

/**
 * @author ����(����)
 *
 */
public class Queen002 {

	/**
	 * @param args
	 */
	/**
     * �����Ƿ���Է��� n ���ʺ�
     * @param board ����
     * @param col ��ǰ��
     * @return �Ƿ���Է��� n ���ʺ�
     */
    // todo: �����Ƿ���Է��� n ���ʺ�
    public static boolean nQueen(int[][] board, int col) {
    	  // todo: ��ɿ��н��������col������������������ݹ���ֹ
    if(col>=board.length) {
    	return true;
    }
        for (int i = 0; i <board.length; i++) {

            // todo: �Ƿ�����Լ���������ʺ��ܲ��ܷ����ڵ�ǰλ��
            if (Queen001.check(board, i,col)) {
                // todo: ����ѷ��ûʺ�ĸ���
                    board[i][col]=1;
                // todo: ������һ�����������ĸ���
//                    nQueen(board,col+1);//�����д�������н�ȱʧ���޷��ж�
                if(nQueen(board,col+1)) {
                    return true;
                }
                // todo: ����
                board[i][col]=0;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 int queen = 4;
	        int[][] board = new int[queen][queen];
	        System.out.println(nQueen(board, 0));
	        System.out.println();
	        Queen000.printBoard(board, queen);
	}

}
