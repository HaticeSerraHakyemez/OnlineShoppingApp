import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/productMenu")
public class ProductMenuServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				resp.setContentType("text/html;charset=UTF-8");
	            req.getRequestDispatcher("ProductMenu.jsp").forward(req, resp);
  }
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String category=req.getParameter("category");
		ArrayList<Product> temp=new ArrayList<Product>();
		for(int i=0;i<Database.products.size();i++) {
			if(category.equals(Database.products.get(i).category.name())) {
				temp.add(Database.products.get(i));
			}
		}
		HttpSession session = req.getSession();
		session.setAttribute("category", category);
		session.setAttribute("prods", temp);
		resp.sendRedirect("categorizedProductList");
    }
}


