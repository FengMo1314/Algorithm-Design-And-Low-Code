/**
 * 
 */
package ��ϰ.sortCircle_Բ����;

import java.util.Stack;

/**
 * @author ����(����)
 *
 */
public class Cp003 {

	/**
	 * @param args
	 */
	 public static double best = Double.MAX_VALUE;
	    public static Circle[] bestSolution;

	    /**
	     * ��ǰ���з����ĳ���
	     * @param packed �����е�Բ�ļ���
	     * @return ��ǰ���з����ĳ���
	     */
	    public static double getPackLength(Stack<Circle> packed) {
	        Circle k = packed.peek();
	        Circle f = packed.firstElement();
	        return k.x + k.radius + f.radius;
	    }

	    /**
	     * ���������е�Բ��Բ��
	     * @param k �����е����һ��Բ
	     * @param newCircle �����е�Բ
	     */
	    public static void setX(Circle k, Circle newCircle) {
	        newCircle.x = k.x + Cp001.dist(k, newCircle);
	    }

	    /**
	     * ���������з�����ʹ������С
	     * @param circles Բ�ļ���
	     * @param packed �����е�Բ�ļ���
	     * @param idx ��ǰ�������е�Բ
	     * @param n Բ�ĸ���
	     */
	    // todo: ���������з�����ʹ������С
	    public static void packing(Circle[] circles, Stack<Circle> packed, int idx, int n) {


	    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
