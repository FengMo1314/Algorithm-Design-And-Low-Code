/**
 *
 */
package sort_排序方法;

/**
 * @author 柳和(本地)
 *  选择类排序
 */
public class DuiSort {
	/*
	 * 对排序
	 */
	public static void heapSort(int[] a) {
		// 构造大根堆
		heapinsert(a);
		int size = a.length;
		while (size > 1) {// 固定最大值
			swap(a, 0, size - 1);
			size--;// 构造大根堆
			heapify(a, 0, size);
		}
	}

	// 构造大根堆(通过新插入的数上升)
	public static void heapinsert(int[] a) {
		for (int i = 0; i < a.length; i++) {
			// 当前插入的索引
			int currentIndex = i;
			// 父结点索引
			int fatherlndex = (currentIndex - 1) / 2;
			/* 如当前插入值大于其父结点的值，则交换值，并且将索引指向父结点，然后继 续和上面的父结点值比较，直到不大于父结点，则退出循环 */
			while (a[currentIndex] > a[fatherlndex]) {
				// 交换当前结点与父结点的值
				swap(a, currentIndex, fatherlndex);
				// 将当前索引指向父索引
				currentIndex = fatherlndex;
				// 重新计算当前索引的父索引
				fatherlndex = (currentIndex - 1) / 2;
			}
		}
	}

	// 将剩余的数构造成大根堆(通过顶端的数下降)
	public static void heapify(int[] a, int index, int size) {
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		while (left < size) {
			int largestIndex;
			// 判断孩子中较大的值的索引(要确保右孩子在size之内)
			if (a[left] < a[right] && right < size) {
				largestIndex = right;
			} else {
				largestIndex = left;
			}
			// 比较父结点的值与孩子中较大的值，并确定最大值的索引
			if (a[index] > a[largestIndex]) {
				largestIndex = index;
			}
			int largestlndex = 0;
			// 如果父结点索引是最大值的索引，那巳经是大根堆了，则退出循环
			if (index == largestlndex) {
				break;
			}
			// 父结点不是最大值，与孩子中较大的值交换
			swap(a, largestlndex, index);
			// 将索引指向孩子中较大的值的索引
			index = largestlndex;
			// 重新计算交换之后的孩子的索引
			left = 2 * index + 1;
			right = 2 * index + 2;
		}
	}

	// 交换数组中两个元素的值
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
