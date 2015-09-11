package algorithm.nzs.linkedlist;

import algorithm.nzs.linkedlist.LinkedListBase.Node;

public class HoopLinkedlist {

	/**
	 * ���������� �٣��ж��Ƿ��л� �ڣ�ȡ�����ĳ��� �ۣ��һ������
	 */

	/**
	 * �ж��Ƿ��л�
	 * @param node
	 * @return
	 */
	public static Node isHoop(Node node) {
		if (node == null) {
			return null;
		}
		// ��ָ��
		Node first = node;
		// ��ָ��
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
	 * �õ����ĳ���
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
				System.out.println("���ĳ�����:"+length);
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
