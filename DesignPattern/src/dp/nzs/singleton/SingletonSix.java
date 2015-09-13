package dp.nzs.singleton;

public class SingletonSix {

	/**
	 * ����ģʽ(��̬�ڲ����д�����Ƚ�����)
	 * Ҳ�����ӳټ��صģ��������ã�����
	 */
	//д����̬�ڲ���
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
