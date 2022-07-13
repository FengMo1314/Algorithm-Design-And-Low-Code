/**
 * 
 */
package f20220708课堂实践蛮力算法;

/**
 * @author 柳和(本地)
 *
 */
public class Point {

	/**
	 * @param args
	 */
	private int x;
    private int y;
    private String right;
    private String left;
    private String dou;
    Point(){
        x = 0;
        y = 0;
        right="(";
        left=")";
        dou=",";
    }
    
   
    
    public Point(String right,int x,String doo, int y, String left,String dou) {
		super();
		this.x = x;
		this.y = y;
		this.right = right;
		this.left = left;
		this.dou=dou;
		this.dou=doo;
	}



	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	public String getRight() {
		return right;
	}



	public String getDou() {
		return dou;
	}



	public void setDou(String dou) {
		this.dou = dou;
	}



	public void setRight(String right) {
		this.right = right;
	}



	public String getLeft() {
		return left;
	}



	public void setLeft(String string) {
		this.left = string;
	}



	public void setX(int x){
        this.x = x;
    }
    
    public int getX(){
        return x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public int getY(){
        return y;
    }



	@Override
	public String toString() {
		return "(" + x + ", " + y + "),";
	}
	
}
