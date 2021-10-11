// Create a genaric class
public class GenaricSort <T extends Number> {	 //It only take numbers (Number class for use it)
	
	public void sortAsc(T[] arr) {
		
		// sort values as ascending in same array
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(arr[j].doubleValue() > arr[j+1].doubleValue()) {
					T tempValue = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tempValue;
				}
			}
		}
	}

}
