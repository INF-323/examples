package nogeneric;

import java.util.ArrayList;

public class inStockItems {
	
	private String name;
	
	private ArrayList<Item> items = new ArrayList<>();

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


	public void addItem(  Item i ) {
		
		items.add(i);
		System.out.println("Adicionando " + i.getName() + " em " + this.getName());
	}
	
	public Item getItem(int index) {
		
		return items.get(index);
	}
	
	public int getSize() {
		return items.size();
	}

}
