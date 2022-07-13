package stopWatch_计时器;

import java.math.BigDecimal;
import java.math.RoundingMode;
/*
 * 计时器
 */
public class StopWatch {
	  private long time;
	    private long total;
	    private long free2;
	    public void start() {
	        time = System.nanoTime();
	        Runtime.getRuntime().freeMemory();
	    }

	    public void stop() {
	        time = System.nanoTime() - time;
	        total = Runtime.getRuntime().totalMemory();
	        free2 = Runtime.getRuntime().freeMemory();
	    }

	    public String getTime() {

	        System.out.println("++++++++++++++++++++++++++++++++++++");

	        System.out.println("Available processors (cores): " +
	                Runtime.getRuntime().availableProcessors());

	        System.out.println("Used memory: " +
	                (total - free2) / 1024 / 1024 + "M");

	        System.out.println("++++++++++++++++++++++++++++++++++++");

	        BigDecimal secs = BigDecimal.valueOf(time).divide(BigDecimal.valueOf(1_000_000_000));

	        if (secs.compareTo(BigDecimal.valueOf(60)) > 0) {
	            BigDecimal mins = secs.divide(BigDecimal.valueOf(60), 0, RoundingMode.FLOOR);
	            secs = secs.subtract(mins.multiply(BigDecimal.valueOf(60)));
	            return "本次运算花费时间: " + mins + " 分" + secs + " 秒";

	        } else {
	            return "本次运算花费时间: " + secs + " 秒";

	        }
	    }
	}
