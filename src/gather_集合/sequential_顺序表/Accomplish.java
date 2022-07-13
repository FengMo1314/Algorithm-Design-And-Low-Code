package gather_����.sequential_˳���;

import java.util.Comparator;

/**
 * ˳���ʵ��
 *
 * @param <T> ����Ԫ�ص���������
 */
public class Accomplish<T> implements Gathers<T> {
	/**
	 * �������� ���ڴ洢˳�������Ԫ��
	 */
	protected Object[] data;

	/**
	 * ˳������ݵ�Ԫ�ظ���
	 */
	protected int n;

	/**
	 * ����ָ�������Ŀձ�
	 *
	 * length ָ������
	 */
	public Accomplish(int length) {
		this.data = new Object[length];
		// �ձ���Ϊ0
		this.n = 0;
	}

	/**
	 * Ĭ�Ϲ��캯��������һ������Ϊ10������
	 */
	public Accomplish() {
		this(10);
	}

	/**
	 * ��ָ�����鹹��˳���
	 */
	public Accomplish(T[] elements) {
		this(elements.length);
		for (int i = 0; i < elements.length; i++) {
			this.data[i] = elements[i];
		}
		this.n = elements.length;
	}

	/**
	 * �����±�Ϊindex��Ԫ��
	 *
	 * @param index �±�
	 * @return Ԫ��
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		// TODO �Զ����ɵķ������
		if (index >= 0 && index < this.n) {
			return (T) this.data[index];
		} else {
			throw new IndexOutOfBoundsException(index + " out of bounds");
		}
	}

	/**
	 * �滻�б���ָ��λ�õ�Ԫ��
	 *
	 * @param index   ָ��λ���±�
	 * @param element �滻�õ�Ԫ��
	 */
	@Override
	public void set(int index, T element) {
		// TODO �Զ����ɵķ������
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
	 * �����Ա��ָ��λ�ô�����Ԫ��
	 *
	 * @param index   ָ��λ���±�
	 * @param element �������Ԫ��
	 * @return �����Ԫ�ص����
	 */
	@Override
	public int insert(int index, T element) {
		// TODO �Զ����ɵķ������
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
	 * �����Ա��������Ԫ��
	 *
	 * @param element �������Ԫ��
	 * @return �����Ԫ�ص����
	 */
	@Override
	public int insert(T element) {
		// TODO �Զ����ɵķ������
		return this.insert(this.n, element);
	}

	/**
	 * ɾ��ָ��λ�õ�Ԫ��
	 *
	 * @param index ָ��λ���±�
	 * @return ��ɾ����Ԫ��
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) {
		// TODO �Զ����ɵķ������
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
	 * �����Ա��в����״γ��ֵ��뱻��Ԫ����ͬ��Ԫ�ص�λ��
	 *
	 * @param element ����Ԫ��
	 * @return ����鵽������Ԫ��λ�ã����򷵻� -1
	 */
	@Override
	public int indexOf(T element) {
		// TODO �Զ����ɵķ������
		for (int i = 0; i < this.n; i++) {
			if (element.equals(this.data[i])) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * �ж����Ա����Ƿ����ָ��Ԫ��
	 *
	 * @param element ָ��Ԫ��
	 * @return ����������� true������ false
	 */
	@Override
	public boolean contains(T element) {
		// TODO �Զ����ɵķ������
		return indexOf(element) != -1;
	}

	/**
	 * �������Ա�ĳ���
	 *
	 * @return ���Ա�ĳ���
	 */
	@Override
	public int size() {
		// TODO �Զ����ɵķ������
		return this.n;
	}

	/**
	 * �������Ա��ռ�ÿռ�
	 *
	 * @return ռ�ÿռ�
	 */
	@Override
	public int space() {
		// TODO �Զ����ɵķ������
		return this.data == null ? 0 : this.data.length;
	}

	/**
	 * ������Ա�
	 */
	@Override
	public void clear() {
		// TODO �Զ����ɵķ������
		for (int i = 0; i < this.n; i++) {
			this.data[i] = null;
		}

		this.n = 0;
	}

	/**
	 * �ж����Ա��Ƿ�Ϊ��
	 *
	 * @return ����գ����� true�� ���� false
	 */
	@Override
	public boolean isEmpty() {
		// TODO �Զ����ɵķ������
		return this.n == 0;
	}

	/**
	 * �������Ա�����Ԫ��
	 */
	@Override
	public void printList() {
		// TODO �Զ����ɵķ������
		for (int i = 0; i < this.n; i++) {
			System.out.print(this.data[i] + " ");
		}
	}

	/**
	 * ���򣬽���comparator
	 *
	 * @param c comparator
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void sort(Comparator<T> c) {
		// TODO �Զ����ɵķ������
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
