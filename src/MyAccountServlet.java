import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/myAccount")
public class MyAccountServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				resp.setContentType("text/html;charset=UTF-8");
				String value=req.getParameter("param");
				HttpSession session = req.getSession();
		        String username=(String) session.getAttribute("username");
		        for(int i=0;i<Database.users.size();i++) {
		        	if(username.equals(Database.users.get(i).username)) {
		        		req.setAttribute("fullName", Database.users.get(i).name+" "+Database.users.get(i).surname);
			            req.setAttribute("username", username);
		        		break;
		        	}
		        }
		        req.getRequestDispatcher("MyAccount.jsp").forward(req, resp);
  }
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String username=(String) session.getAttribute("username");
        String password=req.getParameter("password");
        for(int i=0;i<Database.users.size();i++) {
        	if(Database.users.get(i).username.equals(username)) {
        		Database.users.set(i, new User(Database.users.get(i).name,Database.users.get(i).surname,
            			Database.users.get(i).username,password,Database.users.get(i).index));
        		Database.changePassword(Database.users.get(i).index);
        			resp.sendRedirect("myAccount"); return;
        	}
        }
        req.getRequestDispatcher("MyAccount.jsp").forward(req, resp);
        
    }
}




