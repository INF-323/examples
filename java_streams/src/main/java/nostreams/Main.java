package nostreams;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sparseTable = Arrays.asList(
				"A11", "A25", "A47", "A14", "a99",
				"B7", "B13",
				"G56", "G33",
				"K77", "k13"						
				);

		sparseTable.forEach(element-> {
			if( element.startsWith("A")) {
				System.out.println(element);
			}
		});
	}

}
