package algorithm.nzs.linkedlist;

import algorithm.nzs.linkedlist.LinkedListBase.Node;

public class ReverseLinkerlist {

	/**
	 * 题目：反转单链表
	 */

	public static Node reverse(Node node) {
		if (node == null) {
			return null;
		}
		// 定义当前结点的下一个结点变量
		Node next;
		Node currend = node;
		// 定义当前结点的前面结点是什么
		Node pre = null;
		while (currend != null) {
			// 1 取出当前结点的下一个结点
			next = currend.next;
			// 对链表进行转换
			currend.next = pre;
			// 把当前链表的位置记录下来
			pre = currend;
			// 让当前链表进行下移
			currend = next;
		}
		return pre;
	}

	public static void main(String[] args) {
		LinkedListBase list = new LinkedListBase();
		for (int i = 0; i < 9; i++) {
			list.add(i);
		}

		list.print(reverse(list.head));
	}

}
