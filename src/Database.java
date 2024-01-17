import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Database   {
	 
	public static ArrayList<String> userRecord;
	public static ArrayList<String> productRecord;
	public static ArrayList<User> users;
	public static ArrayList<Product> products;
	
	public Database() throws FileNotFoundException {
		userRecord=new ArrayList<String>();
		productRecord=new ArrayList<String>();
		users=new ArrayList<User>();
		products=new ArrayList<Product>();
		
		File userInput=new File("UserInfo.txt");
		Scanner reader=new Scanner(userInput);
		int i=0;
		while(reader.hasNextLine()) {
			String line = reader.nextLine();
			userRecord.add(line);
			Scanner scanner=new Scanner(line);
			users.add(new User(scanner.next(),scanner.next(),scanner.next(),scanner.next(),i));
			scanner.close();
			i++;
		}
		reader.close(); 
		
		File productInput=new File("ProductInfo.txt");
		reader=new Scanner(productInput);
		while(reader.hasNextLine()) {
			String line = reader.nextLine();
			productRecord.add(line);
			Scanner scanner=new Scanner(line);
			products.add(new Product(scanner.next(),scanner.nextDouble(),Category.valueOf(scanner.next())));
			scanner.close();
		}
		
		reader.close();
		
	}
public static void changePassword(int userIndex) throws FileNotFoundException {
		FileOutputStream outputFile=new FileOutputStream(new File("UserInfo.txt"));
		String[] userData=new String[4];
		userData=userRecord.get(userIndex).split(" ");
		userData[3]=users.get(userIndex).password;
		userRecord.set(userIndex,String.join(" ", userData));
		try {
			outputFile.write(String.join("\n", userRecord).getBytes());
			outputFile.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static boolean addUser(User user) throws FileNotFoundException {
		
		boolean valid=true;
		
		for(int i=0;i<Database.users.size();i++) {
			if(Database.users.get(i).username.equals(user.username)) {
				valid=false;
				break;
			}
		}
		
			if(valid) {
				FileOutputStream outputFile=new FileOutputStream(new File("UserInfo.txt"));
				userRecord.add(user.name+" "+user.surname+" "+user.username+" "+user.password);
				users.add(user);
				try {
					outputFile.write(String.join("\n", userRecord).getBytes());
					outputFile.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
			return valid;
	}
	
}
