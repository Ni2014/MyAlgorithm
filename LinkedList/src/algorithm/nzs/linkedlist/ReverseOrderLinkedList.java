package algorithm.nzs.linkedlist;

import java.util.Stack;

import algorithm.nzs.linkedlist.LinkedListBase.Node;

public class ReverseOrderLinkedList {

	/**
	 * 题目：从尾到头打印单链表(不能破坏原有的结构) 思路：用辅助空间=>栈
	 */

	public static void reverseOrderList(Node node) {
		if (node == null) {
			return;
		}
		Node current = node;
		Stack<Node> stack = new Stack<Node>();
		while (current != null) {
			stack.add(current);
			current = current.next;
		}
		while (stack.size() > 0) {
			System.out.println(stack.pop().data);
		}
	}

	public static void main(String[] args) {

		LinkedListBase list = new LinkedListBase();
		for (int i = 0; i < 9; i++) {
			list.add(i);
		}
		reverseOrderList(list.head);
	}

}
