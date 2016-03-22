
public class UniqueElement {

	static int array[] = {1,1,1,2,3,3,4,5};
	public static void main(String[] args) {
		checkUnique(array);

	}
	
	static void checkUnique(int[] array) {	
		for(int i=0; i<array.length;i++) {
			boolean unique = true;
			while (i+1 < array.length && array[i] == array[i+1]) {
				 unique = false;
				 i++;
			} if (unique) {
				System.out.println(array[i]);
			}
		}
	}

}
