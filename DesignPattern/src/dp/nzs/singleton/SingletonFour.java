package dp.nzs.singleton;

public class SingletonFour {
	/**
	 * 懒汉式设计模式(线程安全)
	 * 但是加了同步后，效率会低，加锁和释放锁
	 */
    private static SingletonFour instance;
	private SingletonFour(){
		
	}
	public static synchronized SingletonFour  getInstance(){
		if(instance==null){
			instance = new SingletonFour();
		}
		return instance;
	}
	
	public static void main(String[] args) {

	}

}
