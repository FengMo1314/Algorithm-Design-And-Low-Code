package gather_集合.sequential_顺序表;

import java.util.Comparator;

/**
 * 顺序表实现
 *
 * @param <T> 数据元素的数据类型
 */
public class Accomplish<T> implements Gathers<T> {
	/**
	 * 对象数组 用于存储顺序表数据元素
	 */
	protected Object[] data;

	/**
	 * 顺序表数据的元素个数
	 */
	protected int n;

	/**
	 * 构造指定容量的空表
	 *
	 * length 指定容量
	 */
	public Accomplish(int length) {
		this.data = new Object[length];
		// 空表长度为0
		this.n = 0;
	}

	/**
	 * 默认构造函数，构造一个长度为10的数组
	 */
	public Accomplish() {
		this(10);
	}

	/**
	 * 由指定数组构造顺序表
	 */
	public Accomplish(T[] elements) {
		this(elements.length);
		for (int i = 0; i < elements.length; i++) {
			this.data[i] = elements[i];
		}
		this.n = elements.length;
	}

	/**
	 * 返回下标为index的元素
	 *
	 * @param index 下标
	 * @return 元素
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		// TODO 自动生成的方法存根
		if (index >= 0 && index < this.n) {
			return (T) this.data[index];
		} else {
			throw new IndexOutOfBoundsException(index + " out of bounds");
		}
	}

	/**
	 * 替换列表中指定位置的元素
	 *
	 * @param index   指定位置下标
	 * @param element 替换用的元素
	 */
	@Override
	public void set(int index, T element) {
		// TODO 自动生成的方法存根
		if (element == null) {
			throw new NullPointerException("t == null");
		}

		if (index >= 0 && index < this.n) {
			this.data[index] = element;
		} else {
			throw new IndexOutOfBoundsException(index + " out of bounds");
		}
	}

	/**
	 * 在线性表的指定位置处插入元素
	 *
	 * @param index   指定位置下标
	 * @param element 待插入的元素
	 * @return 插入后元素的序号
	 */
	@Override
	public int insert(int index, T element) {
		// TODO 自动生成的方法存根
		if (element == null) {
			throw new NullPointerException("t == null");
		}

		if (index >= 0 && index <= this.n) {
			Object[] src = this.data;
			if (this.n == data.length) {
				this.data = new Object[src.length * 2];
				for (int j = 0; j < index; j++) {
					this.data[j] = src[j];
				}
			}
			for (int j = this.n - 1; j >= index; j--) {
				this.data[j + 1] = src[j];
			}
			this.data[index] = element;
			this.n++;
			return index;
		} else {
			throw new IndexOutOfBoundsException(index + " out of bounds");
		}
	}

	/**
	 * 在线性表的最后插入元素
	 *
	 * @param element 待插入的元素
	 * @return 插入后元素的序号
	 */
	@Override
	public int insert(T element) {
		// TODO 自动生成的方法存根
		return this.insert(this.n, element);
	}

	/**
	 * 删除指定位置的元素
	 *
	 * @param index 指定位置下标
	 * @return 被删除的元素
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) {
		// TODO 自动生成的方法存根
		if (this.n == 0) {
			try {
				throw new Exception("Cannot remove from empty list");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (index >= 0 && index < this.n) {
			T old = (T) this.data[index];
			for (int j = index; j < this.n - 1; j++) {
				this.data[j] = this.data[j + 1];
			}
			this.data[this.n - 1] = null;
			this.n--;
			return old;

		} else {
			throw new IndexOutOfBoundsException(index + " out of bounds");
		}
	}

	/**
	 * 在线性表中查找首次出现的与被查元素相同的元素的位置
	 *
	 * @param element 被查元素
	 * @return 如果查到，返回元素位置，否则返回 -1
	 */
	@Override
	public int indexOf(T element) {
		// TODO 自动生成的方法存根
		for (int i = 0; i < this.n; i++) {
			if (element.equals(this.data[i])) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * 判断线性表中是否包含指定元素
	 *
	 * @param element 指定元素
	 * @return 如果包含返回 true，否则 false
	 */
	@Override
	public boolean contains(T element) {
		// TODO 自动生成的方法存根
		return indexOf(element) != -1;
	}

	/**
	 * 返回线性表的长度
	 *
	 * @return 线性表的长度
	 */
	@Override
	public int size() {
		// TODO 自动生成的方法存根
		return this.n;
	}

	/**
	 * 返回线性表的占用空间
	 *
	 * @return 占用空间
	 */
	@Override
	public int space() {
		// TODO 自动生成的方法存根
		return this.data == null ? 0 : this.data.length;
	}

	/**
	 * 清空线性表
	 */
	@Override
	public void clear() {
		// TODO 自动生成的方法存根
		for (int i = 0; i < this.n; i++) {
			this.data[i] = null;
		}

		this.n = 0;
	}

	/**
	 * 判断线性表是否为空
	 *
	 * @return 如果空，返回 true， 否则 false
	 */
	@Override
	public boolean isEmpty() {
		// TODO 自动生成的方法存根
		return this.n == 0;
	}

	/**
	 * 遍历线性表所有元素
	 */
	@Override
	public void printList() {
		// TODO 自动生成的方法存根
		for (int i = 0; i < this.n; i++) {
			System.out.print(this.data[i] + " ");
		}
	}

	/**
	 * 排序，接受comparator
	 *
	 * @param c comparator
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void sort(Comparator<T> c) {
		// TODO 自动生成的方法存根
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (c.compare((T) data[j], (T) data[j + 1]) > 0) {
					Object temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}

}
