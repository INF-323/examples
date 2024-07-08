package second_level;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inStockItems<FoodItem> foodList = new inStockItems<>("Comida");
		inStockItems<DrinkItem> drinkList = new inStockItems<>("Bebidas");
		
		FoodItem alface = new FoodItem("Alface", 3);
		FoodItem arroz = new FoodItem("Arroz", 7);
		FoodItem feijao = new FoodItem("Feijao", 8);
		
		DrinkItem agua = new DrinkItem("Agua Mineral", false);
		DrinkItem cerveja = new DrinkItem("Cerveja", true);
		
		foodList.addItem(alface);
//		foodList.addItem(cerveja);
		
//		drinkList.addItem(feijao);
		drinkList.addItem(agua);

		//Try to uncomment the code below ... what happens this time?
//		inStockItems<String> badList = new inStockItems<String>("BAD LIST");
//		badList.addItem("OOOOpsss");
		

	}

}
