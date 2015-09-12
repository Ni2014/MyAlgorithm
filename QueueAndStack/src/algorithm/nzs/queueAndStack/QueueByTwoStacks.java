package algorithm.nzs.queueAndStack;

import java.util.Stack;

public class QueueByTwoStacks {

	//ջ1���ڴ洢����
	Stack<Integer> stack1 = new Stack<Integer>();
	//ջ2���ڵ�������
	Stack<Integer> stack2 = new Stack<Integer>();
	/**
	 * ��Ӳ���
	 */
	public void add(int data){
		stack1.add(data);
	}
	/**
	 * ���Ӳ���
	 * @throws Exception 
	 */
	public int pop() throws Exception{
		if(stack2.size()==0){
			while(stack1.size()>0){
				stack2.add(stack1.pop());
			}
		}
		if(stack2.size()==0){
			throw new Exception("����Ϊ��");
		}
		return stack2.pop();
		
	}
	
	/**
	 *������ջȥʵ��һ������
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		QueueByTwoStacks queue = new QueueByTwoStacks();
		queue.add(8);
		queue.add(9);
		queue.add(2);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
	}

}
