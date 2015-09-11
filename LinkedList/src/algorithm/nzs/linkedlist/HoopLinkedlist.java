package algorithm.nzs.linkedlist;

import algorithm.nzs.linkedlist.LinkedListBase.Node;

public class HoopLinkedlist {

	/**
	 * 带环的链表 ①：判断是否有环 ②：取出环的长度 ③：找环的起点
	 */

	/**
	 * 判断是否有环
	 * @param node
	 * @return
	 */
	public static Node isHoop(Node node) {
		if (node == null) {
			return null;
		}
		// 快指针
		Node first = node;
		// 慢指针
		Node second = node;
		while (first != null && first.next != null) {
			first = first.next.next;
			second = second.next;
			if (first == second) {
				return first;
			}
		}
		return null;
	}
	/**
	 * 得到环的长度
	 * @param node
	 */
	public static void getHoopLength(Node node){
		if(node==null){
			return;
		}
		Node current = node;
		int length=0;
		while(current!=null){
			current=current.next;
			length++;
			if(current == node){
				System.out.println("环的长度是:"+length);
				return;
			}
		}
	}

	public static void main(String[] args) {

		LinkedListBase list = new LinkedListBase();
		list.add(0);
		Node node = list.head;
		for (int i = 1; i < 5; i++) {
			list.add(i);
		}
		list.add(node);
		System.out.println(isHoop(list.head));
//		getHoopLength(isHoop(list.head));
//		System.out.println(list.getLength(list.head));
	}

}
