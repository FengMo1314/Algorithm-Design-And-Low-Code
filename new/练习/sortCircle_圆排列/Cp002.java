/**
 * 
 */
package ��ϰ.sortCircle_Բ����;

import java.util.Stack;

/**
 * @author ����(����)
 *
 */
public class Cp002 {

	/**
	 * @param args
	 */
	/**
     * ������ۺ����½�
     * @param circles Բ�ļ���
     * @param packed �Ѿ��źõ�Բ
     * @return ���ۺ����½�
     */
    // todo: ������ۺ����½�
    public static double lowerBound(Circle[] circles, Stack<Circle> packed) {
       
       return 0;
    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Circle c1 = new Circle(1, 1);
        Circle c2 = new Circle(4, 2);
        Circle c3 = new Circle(9, 3);
        c1.x = 0;
        c1.packed = true;
        c2.x = 4;
        c2.packed = true;

        Circle[] circles = new Circle[] {c1, c2, c3};

        Stack<Circle> packed = new Stack<>();
        packed.push(c1);
        packed.push(c2);

        System.out.println(Double.compare(lowerBound(circles, packed), 17) == 0);
	}

}
