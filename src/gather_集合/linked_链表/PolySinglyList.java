package gather_集合.linked_链表;

import gather_集合.node_节点.Node;
import others.PolyTerm;

public class PolySinglyList extends SortLinkedList<PolyTerm> {

    public PolySinglyList(PolyTerm[] elements) {
        super();
    }

    public PolySinglyList() {
        super();
    }

    /**
     * 删除系数为0的结点
     * @return 移除的结点个数
     */
    public int removable() {
        int i = 0;

        // prev为p的前驱结点
        Node<PolyTerm> prev = this.head, p = prev.next;

        while (p != null) {
            if (p.data.coefficient == 0) {
                p = p.next;
                prev.next = p;
                i++;

            } else {
                prev = p;
                p = p.next;
            }
        }

        return i;
    }

    public PolySinglyList add(PolySinglyList other) {
        PolySinglyList merged = new PolySinglyList();
        Node<PolyTerm> pa = this.head.next;
        Node<PolyTerm> pb = null;
        if (other != null && other.head.next != null) {
            pb = other.head.next;
        }

        while (pa != null && pb != null) {
            PolyTerm a = pa.data;
            PolyTerm b = pb.data;

            if (a.compareTo(b) < 0) {
                merged.insert(a);
                pa = pa.next;

            } else if (a.compareTo(b) > 0) {
                merged.insert(b);
                pb = pb.next;

            } else {
                double sum = a.coefficient + b.coefficient;

                // 相加后系数不为0，则插入
                if (sum != 0.0) {
                    PolyTerm term = new PolyTerm(sum, a.exponent);
                    merged.insert(term);
                }

                pa = pa.next;
                pb = pb.next;

            }

        }

        while (pa != null) {
            merged.insert(pa.data);
            pa = pa.next;
        }

        while (pb != null) {
            merged.insert(pb.data);
            pb = pb.next;
        }

        return merged;
    }

    @Override
    public void printList() {
        Node<PolyTerm> p = this.head.next;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (p != null) {
            String str = p.data.toString();
            str = str.replace("+", " + ").replace("-", " - ");
            if (i == 0) {
                sb.append(str.substring(3));
            } else {
                sb.append(str);
            }
            p = p.next;
            i++;
        }
        System.out.print(sb);
    }

}
