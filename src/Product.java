
public class Product {
	String name;
	double price;
	Category category;
	int amount;
	
	public Product(String name,double price,Category category) {
		this.name=name;
		this.price=price;
		this.category=category;
		this.amount=1;
	}
	public Product(String name,double price,Category category,int amount) {
		this.name=name;
		this.price=price;
		this.category=category;
		this.amount=amount;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public Category getCategory() {
		return category;
	}
	public int getAmount() {
		return amount;
	}
}
