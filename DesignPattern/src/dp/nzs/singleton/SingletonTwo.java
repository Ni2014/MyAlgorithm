package dp.nzs.singleton;

public class SingletonTwo {

	/**
	 * 饿汉式的变形 instance在静态代码块中new 能否真正用到才做初始化呢
	 */
	private static SingletonTwo instance;
	static {
		instance = new SingletonTwo();
	}

	private SingletonTwo() {

	}

	public static SingletonTwo getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
