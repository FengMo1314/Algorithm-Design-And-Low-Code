/**
 * 
 */
package 练习.sortCircle_圆排列;

import java.util.Stack;

/**
 * @author 柳和(本地)
 *
 */
public class Cp002 {

	/**
	 * @param args
	 */
	/**
     * 计算代价函数下界
     * @param circles 圆的集合
     * @param packed 已经排好的圆
     * @return 代价函数下界
     */
    // todo: 计算代价函数下界
    public static double lowerBound(Circle[] circles, Stack<Circle> packed) {
       
       return 0;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
