import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class User {
	String name;
	String surname;
	String username;
	String password;
	int index;
	public static HashMap<String,Product> myCart;
	
	public User(String name,String surname,String username,String password,int index) {
		this.name=name;
		this.surname=surname;
		this.username=username;
		this.password=password;
		this.index=index;
		myCart=new HashMap<String,Product>();
	}
	
	public void addtoCart(Product product) {
		if(!myCart.containsKey(product.name)) {
			myCart.put(product.name, product);
		}
		else {
			Product tempProduct=new Product(product.name,product.price,product.category,1+myCart.get(product.name).amount);
			myCart.replace(product.name,tempProduct);
		}
	}
	public void removeFromCart(Product product) {
		if(myCart.get(product.name).amount==1) {
			myCart.remove(product.name);
		}
		else {
			Product tempProduct=new Product(product.name,product.price,product.category,-1+myCart.get(product.name).amount);
			myCart.replace(product.name,tempProduct);
		}
	}
	public ArrayList<Product> getMyCart(){
		Collection<Product> values = myCart.values();
		ArrayList<Product> products = new ArrayList<>(values);
		return products;
	}
	public double totalPrice() {
		double total=0;
		Collection<Product> values = myCart.values();
		ArrayList<Product> products = new ArrayList<>(values);
		for(int i=0;i<products.size();i++) {
			total+=products.get(i).price*products.get(i).amount;
		}
		return total;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getUserame() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
}
