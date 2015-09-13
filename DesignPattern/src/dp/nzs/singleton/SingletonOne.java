package dp.nzs.singleton;

public class SingletonOne {

	/**
	 * 饿汉式的单例模式
	 */
	private static final SingletonOne instance = new SingletonOne();

	private SingletonOne() {

	}

	public static SingletonOne getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		System.out.println(SingletonOne.getInstance());
	}

}
