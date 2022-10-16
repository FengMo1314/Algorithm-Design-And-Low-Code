package 课堂练习.other;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
/*
 * 随机数组生成
 */
public class RandomGenerator {
	
	  public RandomGenerator() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public static int[] uniformInts(int n) {
	        int[] randomArray = IntStream.generate(() -> new Random().nextInt(n)).limit(n).toArray();
	        return randomArray;
	    }

	    public static int[] descendedInts(int n) {
	        int[] randomArray = new int[n];
	        for (int i = 0; i < n; i++) {
	            randomArray[i] = n - i;
	        }
	        return randomArray;
	    }

	    public static int[] gaussianInts(int n) {
	        Random r = new Random();
	        int[] randomArray = new int[n];
	        for(int i = 0; i < n; ++i) {
	            randomArray[i] = (int) (r.nextGaussian() * n);
	        }

	        return randomArray;
	    }

	    public static void main(String[] args) {
	        System.out.println(Arrays.toString(gaussianInts(100)));
	    }

	}

