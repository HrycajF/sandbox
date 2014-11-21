package random;

public class StringOverride {
	
	String s1 = "Hello";
	String s2 = "World";
	
	@Override
	public String toString() {
		return this.s1 + this.s2;		
	}
	

}
