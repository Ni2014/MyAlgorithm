package dp.nzs.singleton;

public class SingletonThree {

	/**
	 * 懒汉式的单例模式(线程不安全)
	 */
	private static SingletonThree instance;
	private SingletonThree(){
		
	}
	
	public static SingletonThree getInstance(){
		if(instance==null){
			instance = new SingletonThree();
		}
		return instance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
