package algorithm.nzs.string;

public class FindFristCharactor {

	public static char findFirstCharactor(String str){
		if(str==null){
			throw new RuntimeException("str is null");
		}
		char[] data = str.toCharArray();
		int[] array = new int[256];
		for(int i=0;i<data.length;i++){
			array[data[i]]+=1;
		}
		for(int i=0;i<data.length;i++){
			if(array[data[i]]==1){
				return data[i];
			}
		}
		throw new RuntimeException("Error");
	}
	/**
	 * 找第一个只出现一次的字符
	 */
	public static void main(String[] args) {
		String str = new String("addadad2");
		System.out.println(findFirstCharactor(str));
	}

}
