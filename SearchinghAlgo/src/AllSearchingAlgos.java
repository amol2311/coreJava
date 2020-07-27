
public class AllSearchingAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input= {3,6,7,9,11,14,15,17,21,24,30};
		int  target = 15;
		
		System.out.println("linearSearch: index of 15:"+linearSearch(input,target));//timecomplexity= O(n)
		System.out.println("binarySearch: index of 15:"+binarySearch(input,target)); //timecomplexity= O(logn) base2
		System.out.println("ternarySearch: index of 15:"+ternarySearch(input,target));//timecomplexity= O(logn) base3
		System.out.println("jumpSearch: index of 15:"+jumpSearch(input,target));//timecomplexity= O(sqrt n) 
		//System.out.println("exponentialSearch: index of 15:"+exponentialSearch(input,target));//timecomplexity= O(sqrt n) 
		
		

	}

	private static String exponentialSearch(int[] in, int t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	 * @param in
	 * @param t
	 * @return
	 * Steps of Jump Search:
	 * Divide the array into blocks  with blocksize= Squareroot of n
	 * two pointers required : start : first index of current block and next = first index of next block
	 * compare last element of current block with target
	 * if target > element at last index of current block then jump to next block and repeat the steps
	 * Time Complexity : O(Sqrt N)   N: Number of element 
	 */
	private static int jumpSearch(int[] in, int t) {
		// TODO Auto-generated method stub
		
		//find blocksize = sq root of n, start = first item of block, next= first item of next block
		//comparing with last element of block if less then jump to next block
		int blocksize = (int) Math.sqrt(in.length);
		int start=0,next=blocksize+1;
		while(in[next-1]<t) {
			start=next;
			next+=blocksize;
			
		}
		for(int i=start;i<next;i++) {
			if(in[i]==t)
				return i;
		}
		return -1;
	}
/**
 * 
 * @param in
 * @param t
 * @return
 * Steps of ternary Search:
 * Divide the array in 3 partitions with partition_size= (last_index-first_index)/3
 * find two middles mid1 = first_index+partition_size and mid2 = last_index-1partition_size
 * compare if element at mid1 index is equal to target then return the mid1
 * compare if element at mid2 index is equal to target then return the mid2
 * if target element is less than element at mid1 index then consider array from first_index till mid1-1 for searching target 
 * if target element is greater than element at mid2 index then consider array from mid2+1 till last_index for searching target
 * if target element is in between mid1 and mid2 then consider array from mid1+1 till mid2-1 for searching
 * Time Complexity : O(logN)   N: Number of element and log to the base 3
 */
	private static int ternarySearch(int[] in, int t) {
		// TODO Auto-generated method stub
		//get partition size
		
		int left=0, right=in.length-1;
		
		while(right> left) {
			int ps = (right-left)/3;
			int mid1=left+ps;
			int mid2=right-ps;
			if(in[mid1]==t)
				return mid1;
			if(in[mid2]==t)
				return mid2;
			if(in[mid1]>t)
				right=mid1-1;
			if(in[mid2]<t)
				left=mid2+1;
			if(in[mid1]<t && in[mid2]>t) {
				right=mid2-1;
			    left=mid1+1;
			}
			
			
		}
		return -1;
	}

	/**
	 * 
	 * @param in
	 * @param t
	 * @return
	 * steps for binary search:
	 * find middle index with middle = (first_index+last_index)/2
	 * compare if element at middle index is equal to target then return the index
	 * if element at middle index is smaller than target then consider second half of array for searching target 
	 * if element at middle index is smaller than target then consider first half of array for searching target
	 * Time Complexity : O(logN)   N: Number of element and log to the base 2
	 * 
	 */
	private static int binarySearch(int[] in, int t) {
		// TODO Auto-generated method stub
		
		//find middle and check if middle > target 
		int left=0;
		int right=in.length-1;
		
		while(left<=right) {
			int mid = (left+right)/2;
		if(in[mid]==t)
			return mid;
		if(in[mid]<t)
			left=mid+1;
		if(in[mid]>t)
			right=mid-1;
		}
		return -1;
	}

	/**
	 * 
	 * @param input
	 * @param target
	 * @return
	 * Steps for linear Search
	 * starting from first to the last item in the array check target is equal if yes return else continue till eol
	 * Time Complexity : if its first element then O(1) 
	 * Time Complexity : if its last element then O(n) 
	 */
	private static int linearSearch(int[] input, int target) {
		// TODO Auto-generated method stub
		for(int i=0;i<input.length;i++) {
			if(input[i]==target)
				return i;
		}
		return -1;
	}

}
