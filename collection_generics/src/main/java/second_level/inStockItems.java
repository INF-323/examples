package second_level;

import java.util.ArrayList;

public class inStockItems<T extends Item> {
	
	private String name;
	
	private ArrayList<T> items = new ArrayList<>();

	public inStockItems(String name) {
		super();
		this.name = name;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void addItem(  T i ) {
		
		items.add(i);
		
		//We do not need a cast anymore ...
		System.out.println("Adicionando " + i.getName() + " em " + this.getName());
	}

}
