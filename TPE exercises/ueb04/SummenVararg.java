package ueb04;

public class SummenVararg {
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public int sum(int a, int b, int c, int ... x) {
		int sum = a + b + c;
		
		for (int i : x) {
			sum += i;
			}
		return sum;
	}
	
	

}
