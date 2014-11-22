package ueb09;

@FunctionalInterface
public interface StringFunction {
	
	abstract String apply(String s);
	
	static StringFunction caesar(final int shift) { 
		return (s) -> shiftCharacters(s, shift);
	}
	
	static String shiftCharacters(String s, int shift) {
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			c[i] = (char) (c[i] + shift);
		}
		return new String(c);
	}

}
