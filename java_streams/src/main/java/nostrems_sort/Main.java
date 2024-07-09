package nostrems_sort;

import java.util.ArrayList;
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
		
		List<String> aLine = new ArrayList<>();

		//Tratando elementos com letras minúsculas
		sparseTable.forEach(element-> {
			if( element.toUpperCase().startsWith("A")) {
				aLine.add(element);
			}
		});
		
		//Ordenando ...
		aLine.sort((String s1, String s2) -> s1.compareTo(s2));
		aLine.forEach((String s) -> System.out.println(s)); 
		
	}

}
