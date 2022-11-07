/**
 *
 */
package f20220712课堂实践分治策略;

/**
 * @author 柳和(本地)
 *
 */
public class T3 {

	/**
	 * @param args
	 */
	public static int found(String key, String[] arr, int start, int end) {
		if (start > end) {
			return 0;
		}
		int mid = start + (end - start) / 2;
		if (key.hashCode() < arr[mid].hashCode()) {
			return found(key, arr, start, mid - 1);
		} else if (key.hashCode() > arr[mid].hashCode()) {
			return found(key, arr, mid + 1, end);
		} else {
			return mid;
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] s = { "a", "b", "c", "d", "e", "f" };
		System.out.println(found("g", s, 0, 5));
	}

}
