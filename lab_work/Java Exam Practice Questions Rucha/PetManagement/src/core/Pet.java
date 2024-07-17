package core;

public class Pet {
	private int petId;
	private String name;
	private Category category;
	private int unitPrice;
	private int stocks;
	
	public Pet(String name, Category category, int unitPrice) {
		super();
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
	}

	public Pet(int petId, String name, Category category, int unitPrice, int stocks) {
		super();
		this.petId = petId;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}

	public Pet(String name, Category category, int unitPrice, int stocks) {
		super();
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getStocks() {
		return stocks;
	}

	public void setStocks(int stocks) {
		this.stocks = stocks;
	}

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", category=" + category + ", unitPrice=" + unitPrice
				+ ", stocks=" + stocks + "]";
	}
}
