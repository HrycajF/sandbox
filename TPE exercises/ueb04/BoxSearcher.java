package ueb04;

public class BoxSearcher {
	
	public static void main(String args[]) {
		Integer[] array = new Integer[200];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		for (Integer element : array) {
			boolean identisch = (element == Integer.valueOf(element.intValue()));
			System.out.printf("%d: %s%n", element, identisch);
		}
	}

}
