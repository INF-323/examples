package third_level;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inStockItems<FoodItem> foodList = new inStockItems<>("Horti-fruti");
		inStockItems<DrinkItem> alcoholList = new inStockItems<>("Bebidas Alcólicas");
		inStockItems<DrinkItem> sodaList = new inStockItems<>("Refrigerantes");


		FoodItem alface = new FoodItem("Alface", 3);
		FoodItem arroz = new FoodItem("Arroz", 7);
		FoodItem feijao = new FoodItem("Feijao", 8);
		
		DrinkItem agua = new DrinkItem("Agua Mineral", false);
		DrinkItem cerveja = new DrinkItem("Cerveja", true);
		
		foodList.addItem(alface);
//		foodList.addItem(cerveja);
		
//		drinkList.addItem(feijao);
		sodaList.addItem(new DrinkItem("Coca-Cola", 100, false));
		sodaList.addItem(new DrinkItem("Guarana", 100, false));

		alcoholList.addItem(cerveja);
		
		
		if( sodaList.compareTo(alcoholList) > 0)
			System.out.println("Temos mais refrigerantes!!");
		else
			if( sodaList.compareTo(alcoholList) == 0)
				System.out.println("Empate!!");
		

	}

}
