package test.algorithm.linkedlist;

import test.algorithm.linkedlist.LinkedListUtils.Node;

public class ReverseLinkedList {

	/**
	 * ��ת������
	 */
	public static Node reverseList(Node node) {
		if (node == null) {
			return null;
		}
		Node current=node;
		Node next;
		Node pre=null;
		while(current!=null){
			//������һ�ڵ�
			next=current.next;
			//���������ڵ�
			current.next=pre;
			//���浱ǰ�ڵ�
			pre=current;
			//�ýڵ�����
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
