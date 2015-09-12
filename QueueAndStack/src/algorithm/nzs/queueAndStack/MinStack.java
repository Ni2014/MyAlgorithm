package algorithm.nzs.queueAndStack;

import java.util.Stack;

public class MinStack {

	private Stack<Integer> stack =new Stack<Integer>();
	private Stack<Integer> minStack =new Stack<Integer>();
	public void add(int data){
		stack.add(data);
		if(minStack.size()==0||minStack.peek()>data){
			// ���stack��ջ��Ԫ�ر�minStack��ջ��Ԫ��С��minStackҪ���ϸ��������Сֵ
			minStack.add(data);
		}else{
			// ���stack��ջ��Ԫ�ر�minStack��ջ��Ԫ�ش�minStack�ӵ�����һ�ε���Сֵ
			minStack.add(minStack.peek());
		}
	}
	public int pop() throws Exception{
		if(stack.size()==0){
			throw new Exception("ջ�п���");
		}
		int data = stack.pop();
		minStack.pop();
		return data;
	}

	public int min() throws Exception{
		if(minStack.size()==0){
			throw new Exception("ջ�п���");
		}
		int data = minStack.peek();
		return data;
	}
	/**
	 * ��Ŀ:���һ������min������ջ��Ҫ��min,pop��push������ʱ�临�Ӷȶ���O(1)
	 * ˼·���ռ任ʱ�䣬��һ������ջ
	 * by Wechat
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		MinStack stack =new MinStack();
		stack.add(5);
		stack.add(3);
		stack.add(4);
		stack.add(2);
		stack.pop();
		System.out.println(stack.min());
	}

}
