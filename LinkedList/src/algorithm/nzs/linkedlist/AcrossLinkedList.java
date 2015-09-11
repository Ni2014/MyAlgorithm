package algorithm.nzs.linkedlist;

import java.util.HashSet;

public class AcrossLinkedList {

	private Node head;
	private Node current;

	/**
	 * 定义Node的数据类型
	 */
	class Node {
		int data;
		Node next;

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + data;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (data != other.data)
				return false;
			return true;
		}

		public Node() {

		}

	 	public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void add(int data) {
		// 判断链表为空的情况
		if (head == null) {
			head = new Node(data, null);
			current = head;
		} else {
			// 创建新的节点
			Node node = new Node(data, null);
			// 把新创建的节点跟链表进行关联
			current.next = node;
			// 移动当前链表的位置
			current = node;
		}
	}

	/**
	 * 解法1：用HashSet
	 * 
	 * @param node1
	 * @param node2
	 * @return
	 */

	public Node getCrossPoint(Node node1, Node node2) {
		if (node1 == null || node2 == null) {
			return null;
		}
		HashSet<Node> hashSet = new HashSet<Node>();
		while (node1 != null) {
			hashSet.add(node1);
			node1 = node1.next;
		}

		if (hashSet.contains(node2)) {
			return node2;
		}
		return null;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AcrossLinkedList list1 = new AcrossLinkedList();
		AcrossLinkedList list2 = new AcrossLinkedList();
		for (int i = 1; i < 5; i++) {
			list1.add(i);
		}
		for (int j = 2; j < 5; j++) {
			list2.add(j);
		}

		System.out.println(list1.getCrossPoint(list1.head, list2.head).data);

	}

}
