import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/homePage")
public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String username=(String) session.getAttribute("username");
		for(int i=0;i<Database.users.size();i++) {
        	if(Database.users.get(i).username.equals(username)) {
        		   req.setAttribute("name", Database.users.get(i).name);
        	}
        }
		req.getRequestDispatcher("HomePage.jsp").forward(req, resp);
    }
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("homePage");
	}
}