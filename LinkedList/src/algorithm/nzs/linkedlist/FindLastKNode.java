package algorithm.nzs.linkedlist;

import algorithm.nzs.linkedlist.LinkedListBase.Node;

public class FindLastKNode {

	public static void findLastKNode(Node node, int k) {
		if (node == null) {
			return;
		}
		//快指针
		Node first = node;
		//慢指针
		Node second = node;
		//先让快指针走k个节点
		for (int i = 0; i < k; i++) {
			first = first.next;
		}
		while (first != null) {
			first = first.next;
			second = second.next;
		}
		if (first == null) {
			System.out.println(second.data);
		}
	}

	/**
	 * 题目二：查找链表中倒数第k个节点 
	 * 一般的思路是经过两次遍历，第一次得到长度length，第二次遍历length-k次，但是不提倡
	 * 改进的思路是用"两指针法"
	 */
	public static void main(String[] args) {
		LinkedListBase list = new LinkedListBase();
		for (int i = 0; i < 8; i++) {
			list.add(i);
		}
		findLastKNode(list.head, 3);

	}

}
