package dp.nzs.singleton;

public class SingletonFive {

	/**
	 * 双重校验锁(两种判断，对单纯加同步的改进)
	 */
	private static SingletonFive instance;

	private SingletonFive() {

	}

	public static SingletonFive getInstance() {
		if (instance == null) {
			//拿到类对象的锁，空时才加锁
			synchronized (SingletonFive.class) {
				instance = new SingletonFive();
			}
		}
		return instance;
	}

	public static void main(String[] args) {

	}

}
