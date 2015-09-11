package algorithm.nzs.linkedlist;

import algorithm.nzs.linkedlist.LinkedListBase.Node;

public class FindMiddleNode {

	public static void findMid(Node node) {
		if (node == null) {
			return;
		}
		Node first = node;
		Node second = node;
		while (first != null && first.next != null) {
			first = first.next.next;
			second = second.next;
		}
		System.out.println(second.data);
	}

	/**
	 * 题目：查找单链表中的中间元素
	 */
	public static void main(String[] args) {

		LinkedListBase list = new LinkedListBase();
		for (int i = 0; i < 8; i++) {
			list.add(i);
		}
		findMid(list.head);

	}

}
