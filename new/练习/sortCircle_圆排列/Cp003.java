/**
 * 
 */
package 练习.sortCircle_圆排列;

import java.util.Stack;

/**
 * @author 柳和(本地)
 *
 */
public class Cp003 {

	/**
	 * @param args
	 */
	 public static double best = Double.MAX_VALUE;
	    public static Circle[] bestSolution;

	    /**
	     * 求当前排列方案的长度
	     * @param packed 已排列的圆的集合
	     * @return 当前排列方案的长度
	     */
	    public static double getPackLength(Stack<Circle> packed) {
	        Circle k = packed.peek();
	        Circle f = packed.firstElement();
	        return k.x + k.radius + f.radius;
	    }

	    /**
	     * 设置新排列的圆的圆心
	     * @param k 已排列的最后一个圆
	     * @param newCircle 新排列的圆
	     */
	    public static void setX(Circle k, Circle newCircle) {
	        newCircle.x = k.x + Cp001.dist(k, newCircle);
	    }

	    /**
	     * 求最优排列方案，使长度最小
	     * @param circles 圆的集合
	     * @param packed 已排列的圆的集合
	     * @param idx 当前正在排列的圆
	     * @param n 圆的个数
	     */
	    // todo: 求最优排列方案，使长度最小
	    public static void packing(Circle[] circles, Stack<Circle> packed, int idx, int n) {


	    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 Circle c1 = new Circle(1, 1);
	        Circle c2 = new Circle(1, 2);
	        Circle c3 = new Circle(2, 3);
	        Circle c4 = new Circle(2, 4);
	        Circle c5 = new Circle(3, 5);
	        Circle c6 = new Circle(5, 6);
	        c1.x = 0;
	        Circle[] circles = new Circle[] {c1, c2, c3, c4, c5, c6};
	        int n = circles.length;
	        Stack<Circle> packed = new Stack<>();

	        packing(circles, packed, 0, n);

	        System.out.println(best);
	        for (Circle circle : bestSolution) {
	            System.out.print(circle.id + " ");
	        }

	}

}
