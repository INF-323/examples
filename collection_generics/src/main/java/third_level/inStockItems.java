package third_level;

import java.util.ArrayList;

public class inStockItems<T extends Item> implements Comparable<inStockItems<T>> {
	
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


	@Override
	public int compareTo(inStockItems<T> list) {
		
		if( this.items.size() > list.items.size() ) 
			return 1;
		else if(this.items.size() < list.items.size())
			return -1;
		else
			return 0;
	}
}




	
