package gather_集合.sequential_顺序表;

public class Table_merge extends Accomplish<Integer> {
	public Table_merge() {
		super();
	}

	public Table_merge(Integer[] elements) {
		super(elements);
	}

	public void reverse() {
		int temp;

		// i 下标从头开始往后，j 下标从尾开始往前
		for (int i = 0, j = this.size() - 1; i < j; i++, j--) {
			temp = (Integer) this.data[i];
			this.data[i] = this.data[j];
			this.data[j] = temp;
		}
	}

	public Table_merge merge(Table_merge other) {//顺序表——融合同类型表中
		Table_merge merged = new Table_merge();

		// 两表从第一个元素开始依次扫描、比较
		int i = 0, j = 0;

		// 将两表中较小的数插入merged表中
		while (i < this.size() && j < other.size()) {

			if (this.get(i) < other.get(j)) {
				merged.insert(this.get(i));
				i++;

			} else {
				merged.insert(other.get(j));
				j++;

			}

		}

		// 若剩余的是this表，将表中剩余的元素全部插入merged表
		while (i < this.size()) {
			merged.insert(this.get(i));
			i++;
		}

		// 若剩余的是other表，将表中剩余的元素全部插入merged表
		while (j < other.size()) {
			merged.insert(other.get(j));
			j++;
		}

		return merged;
	}

}
