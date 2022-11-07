package unit_2_2_Assignment_rj0509;

import gather_集合.linked_链表.PolySinglyList;
import others.PolyTerm;

public class T34 {
	public static void main(String[] args) {
		PolyTerm[] pa = { new PolyTerm(4, 4), new PolyTerm(-4, 1), new PolyTerm(9, 0), new PolyTerm(7, 2) };
		PolyTerm[] pb = { new PolyTerm(3, 3), new PolyTerm(4, 1), new PolyTerm(8, 5), new PolyTerm(-6, 7) };
		PolySinglyList listA = new PolySinglyList(pa);
		PolySinglyList listB = new PolySinglyList(pb);

		// 删除系数为0的项
		listA.removable();
		listB.removable();

		PolySinglyList listC = listA.add(listB);

		System.out.print("listA = ");
		listA.printList();

		System.out.print("\nlistB = ");
		listB.printList();

		System.out.print("\nA + B = ");
		listC.printList();

		System.out.println("");
	}
}
