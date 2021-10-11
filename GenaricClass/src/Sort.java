
public class Sort {

	public void sortAsc(int[] arr) {
		
		// sort values as ascending in same array
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tempValue = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tempValue;
				}
			}
		}
	}

}
