import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/allProducts")
public class AllProductsServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String value=req.getParameter("param");
				resp.setContentType("text/html;charset=UTF-8");
	            req.setAttribute("productList", Database.products);
	            req.getRequestDispatcher("AllProducts.jsp").forward(req, resp);
			if(value!=null) {
				HttpSession session = req.getSession();
		        String username=(String) session.getAttribute("username");
		                addToCart(req, resp,username,value);
			}

  }
	private void addToCart(HttpServletRequest req, HttpServletResponse resp,String username,String name)
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
        			Database.users.get(i).addtoCart(product);
        		}
        		break;
        	}
        }
    }
}


