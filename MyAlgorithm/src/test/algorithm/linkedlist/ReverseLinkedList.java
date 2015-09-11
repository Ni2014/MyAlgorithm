package test.algorithm.linkedlist;

import test.algorithm.linkedlist.LinkedListUtils.Node;

public class ReverseLinkedList {

	/**
	 * 反转单链表
	 */
	public static Node reverseList(Node node) {
		if (node == null) {
			return null;
		}
		Node current=node;
		Node next;
		Node pre=null;
		while(current!=null){
			//保存下一节点
			next=current.next;
			//交换两个节点
			current.next=pre;
			//保存当前节点
			pre=current;
			//让节点下移
//			current=current.next;
			current=next;
		}
		return pre;
		
		
		

	}

	public static void main(String[] args) {
		LinkedListUtils list=new LinkedListUtils();
		for(int i=0;i<9;i++){
			list.add(i);
		}
		list.print(reverseList(list.header));
	}

}
