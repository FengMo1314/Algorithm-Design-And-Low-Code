/**
 * 
 */
package ��ϰ.sortCircle_Բ����;

/**
 * @author ����(����)
 *
 */
public class Cp001 {

	/**
	 * @param args
	 */
	/**
     * ��������Բ��֮��ľ���
     * @param c1 ��һ��Բ
     * @param c2 �ڶ���Բ
     * @return ����Բ��֮��ľ���
     */
    // todo: ��������Բ��֮��ľ���
    public static double dist(Circle c1, Circle c2) {
        double a=(c1.radius+c2.radius)*(c1.radius+c2.radius);//radius��ʾ�뾶
        double b=(c1.radius-c2.radius)*(c1.radius-c2.radius);
        return Math.sqrt(a-b);
    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Circle c1 = new Circle(1, 1);
        Circle c2 = new Circle(4, 2);
        System.out.println(Double.compare(Cp001.dist(c1, c2), 4) == 0);
        c1.radius = 2;
        c2.radius = 18;
        System.out.println(Double.compare(Cp001.dist(c1, c2), 12) == 0);
    }
	}


