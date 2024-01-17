import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/myCart")
public class MyCartServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html;charset=UTF-8");
            ArrayList<Product> products=null;
            HttpSession session = req.getSession();
            String username=(String) session.getAttribute("username");
            String value=req.getParameter("param");
            if(value!=null) {
		           removeFromCart(req, resp,username,value);
			}
            for(int i=0;i<Database.users.size();i++) {
            	if(username.equals(Database.users.get(i).username)) {
            		products=Database.users.get(i).getMyCart();
            		req.setAttribute("totalPrice", Database.users.get(i).totalPrice());
            		break;
            	}
            }
            req.setAttribute("productList", products);
            req.getRequestDispatcher("MyCart.jsp").forward(req, resp);

  }
	private void removeFromCart(HttpServletRequest req, HttpServletResponse resp,String username,String name)
            throws ServletException, IOException {
		Product product=null;
		for(int i=0;i<Database.products.size();i++) {
			if(name.equals(Database.products.get(i).name)) {
				product=new Product(Database.products.get(i).name,Database.products.get(i).price,Database.products.get(i).category);
			}
		}
        for(int i=0;i<Database.users.size();i++) {
        	if(username.equals(Database.users.get(i).username)) {
        		if(product!=null) {
        			Database.users.get(i).removeFromCart(product);
        		}
        		break;
        	}
        }
    }

}


