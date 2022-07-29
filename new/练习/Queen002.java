/**
 * 
 */
package 练习;

import javax.swing.border.Border;

/**
 * @author 柳和(本地)
 *
 */
public class Queen002 {

	/**
	 * @param args
	 */
	/**
     * 计算是否可以放置 n 个皇后
     * @param board 棋盘
     * @param col 当前列
     * @return 是否可以放置 n 个皇后
     */
    // todo: 计算是否可以放置 n 个皇后
    public static boolean nQueen(int[][] board, int col) {
    	  // todo: 达成可行解的条件，col超过棋盘最大列数，递归终止
    if(col>=board.length) {
    	return true;
    }
        for (int i = 0; i <board.length; i++) {

            // todo: 是否满足约束条件，皇后能不能放置在当前位置
            if (Queen001.check(board, i,col)) {
                // todo: 标记已放置皇后的格子
                    board[i][col]=1;
                // todo: 搜索下一个符合条件的格子
//                    nQueen(board,col+1);//如此书写——可行解缺失，无法中断
                if(nQueen(board,col+1)) {
                    return true;
                }
                // todo: 回溯
                board[i][col]=0;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 int queen = 4;
	        int[][] board = new int[queen][queen];
	        System.out.println(nQueen(board, 0));
	        System.out.println();
	        Queen000.printBoard(board, queen);
	}

}
