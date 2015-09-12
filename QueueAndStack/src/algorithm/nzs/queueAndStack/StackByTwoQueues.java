package algorithm.nzs.queueAndStack;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackByTwoQueues {

	Queue<Integer> queue1= new ArrayDeque<Integer>();
	Queue<Integer> queue2= new ArrayDeque<Integer>();
	/**
	 * 入栈操作
	 * @param data
	 */
	public void push(int data){
		queue1.add(data);
	}
	/**
	 * 出栈操作
	 * @return
	 * @throws Exception 
	 */
	public int pop() throws Exception{
		int data = 0;
		if(queue1.size()==0){
			throw new Exception("栈为空啊");
		}
		while(queue1.size()>0){
			if(queue1.size()==1){
				data=queue1.poll();
				while(queue2.size()>0){
					queue1.add(queue2.poll());
				}
				return data;
			}
			queue2.add(queue1.poll());
		}
		throw new Exception("栈为空啊");
	}
	/**
	 * 用两个队列去实现一个栈
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		StackByTwoQueues stack = new StackByTwoQueues();
		stack.push(14);
		stack.push(8);
		stack.push(29);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push(65);
		System.out.println(stack.pop());

	}

}
