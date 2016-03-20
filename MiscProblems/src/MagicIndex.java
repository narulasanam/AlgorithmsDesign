

/*
 * Given a sorted array of distinct elements, 
 * find the index which is equal to the array element. 
 * For example: A = -4, -3, -2, 0, 2, 5, 8, find an index where A[i] = i
 */
public class MagicIndex {
	static int[] array ={-4, -3, -2, 0, 2, 5, 8};
	public static void main(String arg[]) {
		findMagicIndex(array);
	}

	static void findMagicIndex(int[] array) {
		int start = 0, last =array.length -1, mid = 0;
		boolean found = false;
		while(start<last) {
			mid = (start + last)/2;
			if(array[mid] < mid) {
				start = mid+1;
			} else if(array[mid] > mid) {
				last = mid - 1;
			} else {
				found = true;
				break;
			}
		}
		if(found){
			System.out.println(mid);
		} else {
			System.out.println("no such element");
		}
		
	}
}
