package _01_array_manipulation;



public class Inserting {
	
	
	static int[] insertAt(int[] testArray, int i, int j) {	
			
		int[] newArray = new int[testArray.length + 1];
		int counter = 0;
		for(int x = 0; x < newArray.length; x++) {
			if(x == i) {
				newArray[x] = j;
			}
			else {
				newArray[x] = testArray[counter];
				counter++;
			}
		}
		
		testArray[i] = j;
		return testArray;
	}
	
	
	
}
