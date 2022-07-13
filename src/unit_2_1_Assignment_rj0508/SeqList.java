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

	public SeqList(SeqList<T> newT) {// ��Ԫ��newT���θ�ֵ������
		this();

		for (int i = 0; i < newT.size(); i++) {
			this.t[i] = newT.get(i);
		}
		this.n = newT.size();
	}

	// ��д���ϵķ���
	void add(T o) {
		t[n++] = o;
	}

	T get(int index) {// ��дget����-��ȡָ���±��Ԫ��ֵ
		if (index >= 0 && index < this.n) {
			return this.t[index];
		} else {
			throw new IndexOutOfBoundsException(index + "\tԽ��");
		}
	}

	void set(int index, T newT) {// ��дset����--�滻ָ���±��Ԫ��ֵ
		if (newT == null) {
			throw new NullPointerException("����ֵΪ��");
		}
		if (index >= 0 && index < this.n) {
			this.t[index] = newT;
		} else {
			throw new IndexOutOfBoundsException(index + "Խ��");
		}
	}

	@SuppressWarnings("unchecked")
	int insert(int i, T newT) {
		if (newT == null) {
			throw new NullPointerException("�滻Ϊ��");
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
			throw new IndexOutOfBoundsException(i + "\tԽ��");
		}
	}

	int insert(T newT) {
		return this.insert(this.n, newT);
	}

	Object remove(int index) {// ɾ��ָ���±������
		if (this.n == 0) {
			try {
				throw new Exception("ԭʼ����Ϊ��");
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
			System.out.println("ɾ���ɹ�:��"+ (index+1));
			return old;
		} else {
			throw new IndexOutOfBoundsException(index + "Խ��");
		}
	}

	int size() {// ��д����������ȡ���ϳ���
		return this.n;
	}

	boolean isEmpty() {// �жϼ����Ƿ�Ϊ��
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

	boolean contains(T element) {//contains() ���������ж��ַ������Ƿ����ָ�����ַ����ַ�����
		return false;
	}

}