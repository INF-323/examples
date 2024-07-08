package no_generic;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<FoodItem> foodList = new ArrayList<>();
		List<DrinkItem> drinkList = new ArrayList<>();
		
		FoodItem alface = new FoodItem("Alface", 3);
		FoodItem arroz = new FoodItem("Arroz", 7);
		FoodItem feijao = new FoodItem("Feijao", 8);
		
		DrinkItem agua = new DrinkItem("Agua Mineral", false);
		DrinkItem cerveja = new DrinkItem("Cerveja", true);
		
		foodList.add(alface);
		// foodList.add(cerveja);
		
		// drinkList.add(feijao);
		drinkList.add(agua);
		
		// 1. Rode o código. Você identifica algo estranho?
		// 2. Descomente a parte abaixo. Rode novamente. O que aconteceu?
		 
		
		  int numAlc = 0; DrinkItem it;
		  
		  for(int i = 0; i < drinkList.size(); i++) { it = drinkList.get(i); if (it.isAlcohol()) numAlc++; }
		  
		  System.out.println("Temos "+ numAlc + " bebidas alcoólicas cadastradas");
				 
	}

}
