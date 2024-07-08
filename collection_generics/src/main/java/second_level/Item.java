package second_level;

public class Item {
	private String name;
	private int quantity;

	public Item(String name) {
		super();
		this.name = name;
		this.quantity = 0;
	}
	

	public Item(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
