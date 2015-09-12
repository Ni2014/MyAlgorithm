package algorithm.nzs.string;

public class LeftRotateString {

	public static String leftRotateString(String str,int count) throws Exception{
		if(str==null||count>str.length()){
			throw new Exception("string is null or count is false");
		}
		char[] data = str.toCharArray();
		reverse(data,0,count-1);
		reverse(data,count,data.length-1);
		reverse(data,0,data.length-1);
		return new String(data);
	}
	public static void reverse(char[] data,int begin,int end){
		if(data==null||data.length==0||begin>end){
			return;
		}
		while(begin<end){
			char tmp = data[begin];
			data[begin] = data[end];
			data[end] = tmp;
			begin++;
			end--;
		}
		
	} 
	/**
	 * ×óĞıµ¥´Ê
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String str = "abcdefg";
		System.out.println(leftRotateString(str, 4));
	}

}
