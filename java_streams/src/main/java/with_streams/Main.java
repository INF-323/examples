package with_streams;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> sparseTable = Arrays.asList(
				"A11", "A25", "A47", "A14", "a99",
				"B7", "B13",
				"G56", "G33",
				"K77", "k13"						
				);
		
		/* Código anterior para referência
		 * 
		 *
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
		*/
		
		/* Veja nos comentários o que cada linha de código retorna
		 * 
		 */
		sparseTable
			.stream()						//uma stream com todos os itens e mesma ordem
			.map(String::toUpperCase)		//uma stream com todos os elementos maiúsculos
			.filter(s -> s.startsWith("A"))	//uma stream com todos os elementos iniciados em "A"
			.sorted()						//uma stream ordenada pela ordem natural dos elementos
			.forEach(System.out::println);	//Cada item é impresso no monitor. Retorno nulo. Fim da cadeia.
		
		System.out.println();
		sparseTable.forEach((String s) -> System.out.println(s));
	}

}
