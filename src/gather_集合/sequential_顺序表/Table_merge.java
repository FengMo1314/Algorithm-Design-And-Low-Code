package gather_����.sequential_˳���;

public class Table_merge extends Accomplish<Integer> {
	public Table_merge() {
		super();
	}

	public Table_merge(Integer[] elements) {
		super(elements);
	}

	public void reverse() {
		int temp;

		// i �±��ͷ��ʼ����j �±��β��ʼ��ǰ
		for (int i = 0, j = this.size() - 1; i < j; i++, j--) {
			temp = (Integer) this.data[i];
			this.data[i] = this.data[j];
			this.data[j] = temp;
		}
	}

	public Table_merge merge(Table_merge other) {//˳������ں�ͬ���ͱ���
		Table_merge merged = new Table_merge();

		// ����ӵ�һ��Ԫ�ؿ�ʼ����ɨ�衢�Ƚ�
		int i = 0, j = 0;

		// �������н�С��������merged����
		while (i < this.size() && j < other.size()) {

			if (this.get(i) < other.get(j)) {
				merged.insert(this.get(i));
				i++;

			} else {
				merged.insert(other.get(j));
				j++;

			}

		}

		// ��ʣ�����this��������ʣ���Ԫ��ȫ������merged��
		while (i < this.size()) {
			merged.insert(this.get(i));
			i++;
		}

		// ��ʣ�����other��������ʣ���Ԫ��ȫ������merged��
		while (j < other.size()) {
			merged.insert(other.get(j));
			j++;
		}

		return merged;
	}

}
