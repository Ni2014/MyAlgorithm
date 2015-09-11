package algorithm.nzs.linkedlist;


public class MergeTwoLists {

	Node head;
	private Node current;

	/**
	 * 定义Node的数据类型
	 */
	static class Node {
		int data;
		Node next;

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
	 * 遍历单链表
	 * 
	 * @param node
	 */
	public void print(Node node) {
		if (node == null) {
			return;
		}
		Node current = node;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	/**
	 * 题目：合并两个有序的单链表
	 */

	public static Node mergeTwoLists(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return null;
		}
		if (node1 == null) {
			return node2;
		} else if (node2 == null) {
			return node1;
		}
		//创建一个哑元结点
		Node dummy = new Node(0);
		Node current = dummy;
		while (node1 != null && node2 != null) {

			if (node1.data <= node2.data) {
				current.next = node1;
				node1 = node1.next;
			} else {
				current.next = node2;
				node2 = node2.next;
			}
			current = current.next;
		}
		//处理链表1或者链表2不为空的情况
		if (node1 != null) {
			current.next = node1;
		} else if (node2 != null) {
			current.next = node2;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		MergeTwoLists list1 = new MergeTwoLists();
		MergeTwoLists list2 = new MergeTwoLists();

		list1.add(5);
		list1.add(15);
		list2.add(10);
		list2.add(15);
		list2.add(20);

		list1.print(mergeTwoLists(list1.head, list2.head));

	}

}
