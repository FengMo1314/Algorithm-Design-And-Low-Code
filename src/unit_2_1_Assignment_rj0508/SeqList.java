package unit_2_1_Assignment_rj0508;

public class SeqList<T> {
	protected T[] t;
	protected int n;
	static final int NULL_NUMBER = 100;

	@SuppressWarnings("unchecked")
	public SeqList() {//
		this.t = (T[]) new Object[NULL_NUMBER];
		this.n = 0;
	}

	public SeqList(SeqList<T> newT) {// 将元素newT依次赋值给集合
		this();

		for (int i = 0; i < newT.size(); i++) {
			this.t[i] = newT.get(i);
		}
		this.n = newT.size();
	}

	// 仿写集合的方法
	void add(T o) {
		t[n++] = o;
	}

	T get(int index) {// 重写get方法-获取指定下标的元素值
		if (index >= 0 && index < this.n) {
			return this.t[index];
		} else {
			throw new IndexOutOfBoundsException(index + "\t越界");
		}
	}

	void set(int index, T newT) {// 重写set方法--替换指定下标的元素值
		if (newT == null) {
			throw new NullPointerException("代替值为空");
		}
		if (index >= 0 && index < this.n) {
			this.t[index] = newT;
		} else {
			throw new IndexOutOfBoundsException(index + "越界");
		}
	}

	@SuppressWarnings("unchecked")
	int insert(int i, T newT) {
		if (newT == null) {
			throw new NullPointerException("替换为空");
		}
		if (i >= 0 && i <= this.n) {
			Object[] src = this.t;
			if (this.n == t.length) {
				this.t = (T[]) new Object[src.length * 2];
				for (int j = 0; j < i; j++) {
					this.t[j] = (T) src[j];
				}
			}
			for (int j = this.n - 1; j >= i; j--) {
				this.t[j + 1] = (T) src[j];
			}
			this.t[i] = newT;
			this.n++;
			return i;
		} else {
			throw new IndexOutOfBoundsException(i + "\t越界");
		}
	}

	int insert(T newT) {
		return this.insert(this.n, newT);
	}

	Object remove(int index) {// 删除指定下标的内容
		if (this.n == 0) {
			try {
				throw new Exception("原始集合为空");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (index >= 0 && index < this.n) {
			Object old = this.t[index];
			for (int j = index; j < this.n - 1; j++) {
				this.t[j] = this.t[j + 1];
			}
			this.t[this.n - 1] = null;
			this.n--;
			System.out.println("删除成功:第"+ (index+1));
			return old;
		} else {
			throw new IndexOutOfBoundsException(index + "越界");
		}
	}

	int size() {// 仿写方法——获取集合长度
		return this.n;
	}

	boolean isEmpty() {// 判断集合是否为空
		return this.n == 0;
	}

	int space() {
		return 0;
	}

	void clear() {
	}

	void printList() {
		for (int i=0; i < this.n; i++) {
            System.out.print(this.t[i] + " ");
        }
	}

	int indexOf(T element) {
		return 0;
	}

	boolean contains(T element) {//contains() 方法用于判断字符串中是否包含指定的字符或字符串。
		return false;
	}

}