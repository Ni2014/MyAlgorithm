package dp.nzs.singleton;
/**
 * 单例模式的枚举实现
 * 好处是可以防止反序列化生成对象(《Effective Java》和java1.5提倡)，开源代码常见
 */
public enum SingletonSeven {
	INSTANCE;
	public void doSomething() {
		System.out.println("do something");
	}

	public static void main(String[] args) {
		SingletonSeven.INSTANCE.doSomething();
	}
}
