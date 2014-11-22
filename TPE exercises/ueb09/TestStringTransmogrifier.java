package ueb09;

import java.util.Arrays;

import ueb04.Lebewesen;

public class TestStringTransmogrifier {

	public static void main(String[] args) {

		String[] elements = { "Hello", "World", "I", "am", "here", "zzz" };

		System.out.println(Arrays.toString(StringTransmogrifier.transmogrify(
				elements, s -> s.toLowerCase())));

		System.out.println(Arrays.toString(StringTransmogrifier.transmogrify(
				elements, s -> s.toUpperCase())));

		System.out.println(Arrays.toString(StringTransmogrifier.transmogrify(
				elements, s -> {
					char[] c = s.toCharArray();
					for (int i = 0; i < c.length; i++) {
						c[i] = (char) (c[i] + 1);
					}
					return new String(c);
				})));

		System.out.println(Arrays.toString(StringTransmogrifier.transmogrify(
				elements, StringFunction.caesar(3))));
	}
}
