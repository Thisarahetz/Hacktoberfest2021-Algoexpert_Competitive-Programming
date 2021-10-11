
public class Demo {

	public static void main(String[] args) {

		System.out.println("Generic class ===============================");
		
//		Using Generic Class (It can sort any numerical values) ==========================

		Integer[] intArr = {1, 5, 6, 3, 8, 2, 9};
		GenaricSort<Integer> gs = new GenaricSort<Integer>();
		gs.sortAsc(intArr);
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		
		
		System.out.println("Normal class ===============================");
		
//		Using non generic (Normal) class (It only can sort integers) ====================

		int[] arr = {1, 5, 6, 3, 8, 2, 9};
		Sort gsInt = new Sort();
		gsInt.sortAsc(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(intArr[i]);
		}
		
	}
}
