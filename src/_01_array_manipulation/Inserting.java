package _01_array_manipulation;

public class Inserting {

	static int[] insertAt(int[] testArray, int i, int j) {

		int[] newArray = new int[testArray.length + 1];
		int counter = 0;
		for (int x = 0; x < newArray.length; x++) {
			if (x == i) {
				newArray[x] = j;
			} else {
				newArray[x] = testArray[counter];
				counter++;
			}
		}
		testArray = newArray;
		// testArray[i] = j;
		return testArray;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {

		String[] newOrderArray = new String[orderedArray.length + 1];
		newOrderArray[orderedArray.length] = string;
		for(int c = 0; c < orderedArray.length; c++) {
			newOrderArray[c] = orderedArray[c];
		}
		for (int a = 0; a < newOrderArray.length; a++) {
			for (int b = a + 1; b < newOrderArray.length; b++) {
		
				String s1 = newOrderArray[a];
				String s2 = newOrderArray[b];
				if (s1.compareTo(s2) < 0) {

				} else if (s1.compareTo(s2) > 0) {
					newOrderArray[a] = s2;
					newOrderArray[b] = s1;
				}
			}
		}
		orderedArray = newOrderArray;
		return orderedArray;
	}

}