package first_level;

import java.util.ArrayList;

public class inStockItems<T> {
	
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
		
		//This is not a good practice. This cast is not that safe ...
		System.out.println("Adicionando " + ((Item) i).getName() + " em " + this.getName());
	}

}
