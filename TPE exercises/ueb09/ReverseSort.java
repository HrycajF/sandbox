package ueb09;

import java.util.Date;
import java.util.Arrays;
import java.util.Comparator;

public class ReverseSort {

	public static void main(String[] args) {
		
		Date[] dates = {
				new Date (5034500000000L),
				new Date (6042700000000L),
				new Date (5051100000000L),
				new Date (9083200000000L),
				new Date (1029300000000L),
		};
		
	Arrays.sort(dates, new Comparator<Date>() {
		
		@Override
		public int compare(Date o1, Date o2) {
			return o1.compareTo(o2) * -1;
		}
	});
		
	System.out.println(Arrays.asList(dates));
		
		
	}
		
}
	
	



