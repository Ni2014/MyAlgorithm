package algorithm.nzs.array;

public class SumArray {

	private static int[] data = {1,-2,3,10,-4,7,2,-5}; 
	/**
	 * 求连续子数组和最大
	 * @param args
	 */
	public static int sumGreat(int[] data){
		if(data==null||data.length==0){
			return -1;
		}
		//之前数组的最大值
		int sum = 0;
		//子数组的最大值
		int sumGreat = 0;
		for(int i=0;i<data.length;i++){
			if(sum<=0){
				sum=data[i];
			}else {
				sum+=data[i];
			}
			if(sum>sumGreat){
				sumGreat=sum;
			}
		}
		return sumGreat;
	}
	public static void main(String[] args) {
		System.out.println(sumGreat(data));
	}

}
