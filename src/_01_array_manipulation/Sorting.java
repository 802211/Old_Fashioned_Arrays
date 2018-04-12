package _01_array_manipulation;


public class Sorting {

	public static void main(String[] args) {
	
	}
	
	static void sort(String[] s) {
		String s1;
		String s2;
		for(int i = 0; i < s.length; i++) {
			
			for(int j = i+1; j < s.length; j++) {
			s1 = s[i];
			s2 = s[j];
			if(s1.compareTo(s2) < 0) {
				
			}
			else if(s1.compareTo(s2) > 0) {
				s[i] = s2;
				s[j] = s1;
			}
	}}
		
}
	
	
	
	
	
	
	
	
}