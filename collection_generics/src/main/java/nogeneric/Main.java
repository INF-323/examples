package nogeneric;

public class Main {

	public static void main(String[] args) {
		inStockItems foodList = new inStockItems("Comida");
		inStockItems drinkList = new inStockItems("Bebida");

		FoodItem alface = new FoodItem("Alface", 3);
		FoodItem arroz = new FoodItem("Arroz", 7);
		FoodItem feijao = new FoodItem("Feijao", 8);

		DrinkItem agua = new DrinkItem("Agua Mineral", false);
		DrinkItem cerveja = new DrinkItem("Cerveja", true);

		foodList.addItem(alface);
		foodList.addItem(cerveja);

		drinkList.addItem(feijao);
		drinkList.addItem(agua);

		// 1. Rode o código. Você identifica algo estranho?
		// 2. Descomente a parte abaixo. Rode novamente. O que aconteceu?

		int numAlc = 0;
		DrinkItem it;

		for (int i = 0; i < drinkList.getSize(); i++) {
			it = (DrinkItem) drinkList.getItem(i);
			if (it.isAlcohol())
				numAlc++;
		}

		System.out.println("Temos " + numAlc + " bebidas alcoólicas cadastradas");

	}

}
