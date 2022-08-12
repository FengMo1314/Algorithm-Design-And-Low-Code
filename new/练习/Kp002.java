/**
 * 
 */
package ��ϰ;

import java.util.Arrays;

/**
 * @author ����(����)
 *
 */
public class Kp002 {

	/**
	 * @param args
	 */
	public static int best;
    public static int[] bestSolution;

    public static boolean isValid(int capacity, int idx, Item[] items) {
        return capacity - items[idx].w >= 0;
    }

    /**
     * ����Ƿ������ϱ߽�
     * @param capacity ʣ������
     * @param value ��ǰ��Ʒ�ܼ�ֵ
     * @param idx ��ǰװ����Ʒ
     * @param items ��Ʒ
     * @param n ��Ʒ����
     * @return �Ƿ������ϱ߽�
     */
    public static boolean checkBranch(int capacity, int value, int idx, Item[] items, int n) {
        if (capacity <= 0 || idx + 1 >= n) {
            return false;
        }

        double delta = (double)capacity * items[idx + 1].v/items[idx + 1].w;
        return value + delta > best;
    }

    /**
     * �����������
     * @param capacity ʣ������
     * @param value ��ǰ��Ʒ�ܼ�ֵ
     * @param idx ��ǰװ����Ʒ
     * @param x ��ǰ��װ�ط���
     * @param items ��Ʒ
     * @param n ��Ʒ����
     */
    public static void knapsack(int capacity, int value, int idx, int[] x, Item[] items, int n) {

        
    }

    static class Item {
        public int v;
        public int w;

        public Item(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		  int b = 10;
	        Item[] items = new Item[] {
	          new Item(1, 2), new Item(3, 3), new Item(5, 4), new Item(9, 7)
	        };
	        Arrays.sort(items, (o1, o2) -> {
	            float a1 = (float)o1.v/o1.w;
	            float a2 = (float)o2.v/o2.w;
	            return Float.compare(a2, a1);
	        });

	        int n = items.length;
	        int[] x = new int[n];

	        best = Integer.MIN_VALUE;
	        bestSolution = new int[n];

	        knapsack(b, 0,0, x, items, n);

	        System.out.println(best);
	        System.out.println(Arrays.toString(bestSolution));

	        System.out.println(best == 12);
	        System.out.println(bestSolution[0] == 1);
	        System.out.println(items[0].v == 9);
	        System.out.println(bestSolution[2] == 1);
	        System.out.println(items[2].v == 3);
	}

}
