import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class UserEntryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	boolean log=true;
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("valid", 0);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("valid", 0);
		if(log) {
			new Database();
		    log=false;
		}
		HttpSession session = req.getSession();
		if(req.getParameter("pageName").equals("login")) {
			String username = req.getParameter("username");
	        String password = req.getParameter("password");
	        for(int i=0;i<Database.users.size();i++) {
	        	if(Database.users.get(i).username.equals(username)) {
	        		if(Database.users.get(i).password.equals(password)) {
	        			session.setAttribute("username", username);
	        			resp.sendRedirect("homePage"); return;
	        		}
	        		req.setAttribute("valid", 1);
	        	}
	        }
		}
		if(req.getParameter("pageName").equals("signUp")) {
			String name = req.getParameter("name");
			String surname = req.getParameter("surname");
			String username = req.getParameter("username");
	        String password = req.getParameter("password");
	        if(!name.equals("")||!surname.equals("")||!username.equals("")||!password.equals("")) {
	        	boolean valid=Database.addUser(new User(name,surname,username,password,Database.users.size()));
		        if(!valid) {
		        	req.setAttribute("valid", -1);
		        }
	        }
	        
		}
		req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
