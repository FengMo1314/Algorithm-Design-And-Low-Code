/**
 * 
 */
package 练习.sortCircle_圆排列;

/**
 * @author 柳和(本地)
 *
 */
public class Cp001 {

	/**
	 * @param args
	 */
	/**
     * 计算两个圆心之间的距离
     * @param c1 第一个圆
     * @param c2 第二个圆
     * @return 两个圆心之间的距离
     */
    // todo: 计算两个圆心之间的距离
    public static double dist(Circle c1, Circle c2) {
        double a=(c1.radius+c2.radius)*(c1.radius+c2.radius);//radius表示半径
        double b=(c1.radius-c2.radius)*(c1.radius-c2.radius);
        return Math.sqrt(a-b);
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Circle c1 = new Circle(1, 1);
        Circle c2 = new Circle(4, 2);
        System.out.println(Double.compare(Cp001.dist(c1, c2), 4) == 0);
        c1.radius = 2;
        c2.radius = 18;
        System.out.println(Double.compare(Cp001.dist(c1, c2), 12) == 0);
    }
	}


