package algorithm.nzs.linkedlist;

import algorithm.nzs.linkedlist.LinkedListBase.Node;

public class AcrossLinkedListPro {

	/**
	 * 题目：链表相交，取出相交的第一个结点
	 */

	/**
	 * 改进
	 * 
	 * @param node1
	 * @param node2
	 * @return
	 */
	public static Node getCrossPointPro(Node node1, Node node2) {
		if (node1 == null || node2 == null) {
			return null;
		}
		int length1 = LinkedListBase.getLength(node1);
		int length2 = LinkedListBase.getLength(node2);
		int index;
		Node longHead;
		Node shortHead;
		if (length1 > length2) {
			index = length1 - length2;
			longHead = node1;
			shortHead = node2;
		} else {
			index = length2 - length1;
			longHead = node2;
			shortHead = node1;
		}
		for (int i = 0; i < index; i++) {
			longHead = longHead.next;
		}
		if (longHead.data == shortHead.data) {
			return longHead;
		}
		return null;
	}

	public static void main(String[] args) {
		LinkedListBase list1 = new LinkedListBase();
		LinkedListBase list2 = new LinkedListBase();
		for (int i = 1; i < 5; i++) {
			list1.add(i);
		}
		for (int j = 2; j < 5; j++) {
			list2.add(j);
		}

		System.out.println(getCrossPointPro(list1.head, list2.head).data);

	}

}
