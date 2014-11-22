package ueb09;

public class StringTransmogrifier {
	
		
	
	public static String[] transmogrify(String[] array, StringFunction sFunction) {
		int size = array.length;
		String[] newArray = new String[size];
		
		for(int i = 0; i < size; i++) {
			newArray[i] = sFunction.apply(array[i]);
		}
		
		return newArray;
		
	}

}
