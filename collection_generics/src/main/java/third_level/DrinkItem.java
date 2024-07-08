package third_level;

public class DrinkItem extends Item {
	
	private boolean alcohol;

	public DrinkItem(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public DrinkItem(String name, int quantity) {
		super(name, quantity);
		// TODO Auto-generated constructor stub
	}

	public DrinkItem(String name, int quantity, boolean alcohol) {
		super(name, quantity);
		this.alcohol = alcohol;
	}



	public DrinkItem(String name, boolean alcohol) {
		super(name);
		this.alcohol = alcohol;
	}

	public boolean isAlcohol() {
		return alcohol;
	}

	public void setAlcohol(boolean alcohol) {
		this.alcohol = alcohol;
	}

}
