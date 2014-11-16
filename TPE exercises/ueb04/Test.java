package ueb04;

public class Test {

	public static void main(String[] args) {
		
		Lebewesen l1 = new Dackel();
		Lebewesen l2 = new Amoebe();
		
		l1.bewegen();
		l2.bewegen();
		
		if (l1 instanceof Dackel) {
			((Dackel) l1).bellen();
		}
		
	}

}
