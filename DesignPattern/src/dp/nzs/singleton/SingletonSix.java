package dp.nzs.singleton;

public class SingletonSix {

	/**
	 * 单例模式(静态内部类的写法，比较优雅)
	 * 也是在延迟加载的，主动调用，常见
	 */
	//写个静态内部类
	static class SingleHolder{
		private static final SingletonSix INSTANCE = new SingletonSix();
		
	}
	public static SingletonSix getInstance(){
		return SingleHolder.INSTANCE;
	}
	private SingletonSix(){}
	
	public static void main(String[] args) {

	}

}
