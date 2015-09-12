package algorithm.nzs.queueAndStack;

import java.util.Stack;

public class QueueByTwoStacks {

	//栈1用于存储数据
	Stack<Integer> stack1 = new Stack<Integer>();
	//栈2用于弹出数据
	Stack<Integer> stack2 = new Stack<Integer>();
	/**
	 * 入队操作
	 */
	public void add(int data){
		stack1.add(data);
	}
	/**
	 * 出队操作
	 * @throws Exception 
	 */
	public int pop() throws Exception{
		if(stack2.size()==0){
			while(stack1.size()>0){
				stack2.add(stack1.pop());
			}
		}
		if(stack2.size()==0){
			throw new Exception("队列为空");
		}
		return stack2.pop();
		
	}
	
	/**
	 *用两个栈去实现一个队列
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
