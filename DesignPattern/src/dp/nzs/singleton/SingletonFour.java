package dp.nzs.singleton;

public class SingletonFour {
	/**
	 * ����ʽ���ģʽ(�̰߳�ȫ)
	 * ���Ǽ���ͬ����Ч�ʻ�ͣ��������ͷ���
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
