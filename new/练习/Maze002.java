/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Maze002 {

	/**
	 * @param args
	 */
	/**
     * ����·������
     */
    public static int solutionCount;

    /**
     * ���Լ������
     * @param maze �Թ�
     * @param x ��ǰ x ����
     * @param y ��ǰ y ����
     * @param n ��� x ����
     * @param m ��� y ����
     * @return �Ƿ�����Լ������
     */
    // todo: ���Լ������
    public static boolean isValid(int[][] maze, int x, int y, int n, int m) {
          if(x<n&&y<m&&x>=0&&y>=0) {
        	  if(maze[x][y]==0) {
        		  return true;
        	  }
          }
        return false;
    }

    /**
     * �������·������
     * @param maze �Թ�
     * @param x ��ǰ x ����
     * @param y ��ǰ y ����
     * @param n ��� x ����
     * @param m ��� y ����
     * @return ����·������
     */
    // todo: �������·������
    public static void solveMaze(int[][] maze, int x, int y, int n, int m) {
    	if(x==n-1&&y==m-1) {
    		solutionCount++;
//    		return ;
    	}
        if(isValid(maze, x, y, n, m)) {
        	maze[x][y]=1;
        	solveMaze(maze, x-1, y, n, m);
        	solveMaze(maze, x+1, y, n, m);
        	solveMaze(maze, x, y-1, n, m);
        	solveMaze(maze, x, y+1, n, m);	
        	 maze[x][y]=0;
        }
       
    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 int[][] maze = {
	                {0, 0, 1, 0, 0, 0, 1, 0},
	                {0, 0, 1, 0, 0, 0, 1, 0},
	                {0, 0, 1, 0, 1, 1, 0, 1},
	                {0, 1, 1, 1, 0, 0, 1, 0},
	                {0, 0, 0, 1, 0, 0, 0, 0},
	                {0, 1, 0, 0, 0, 1, 0, 1},
	                {0, 1, 1, 1, 1, 0, 0, 1},
	                {1, 1, 0, 0, 0, 1, 0, 1},
	                {1, 1, 0, 0, 0, 0, 0, 0}
	        };

	        int n = maze.length;
	        int m = maze[0].length;

	        solveMaze(maze, 0, 0, n, m);

	        if (solutionCount == 8) {
	            System.out.println("Total: " + solutionCount);
	            Maze000.printMaze(maze);
	        }
	}

}
