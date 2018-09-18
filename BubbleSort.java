
public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		int x,y;
		int n = a.length;
		int temp; // Need a temp variable to store a value of the arr
		
		for(x = 0; x < n-1; x++ ) {
			for ( y = 0; y < n-x-1; y++) {
				if (a[y] > a[y+1]) {
					temp = a[y];
					a[y] = a[y+1];
					a[y+1] = temp;
							
				}
			}
		}
	}

}
