package dp.nzs.singleton;

public class SingletonThree {

	/**
	 * ����ʽ�ĵ���ģʽ(�̲߳���ȫ)
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
