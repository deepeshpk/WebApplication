

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sample.UserBean;
import sample.UserDAO;

/**
 * Servlet implementation class Sample1
 */
public class Sample1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	
    	HttpSession session = request.getSession(true);
	    response.setContentType("text/html");
	    try {

			UserBean user = new UserBean();
			user.setUserName(request.getParameter("name"));
			user.setPassword(request.getParameter("password"));

			user = UserDAO.login(user);

			if (user.isValid()) {

				session.setAttribute("Username", user.getUsername());
				session.setAttribute("Password", user.getPassword());
				response.sendRedirect("success.jsp"); // logged-in page
			}

			else
				response.sendRedirect("failure.jsp"); // error page
		}

		catch (Throwable theException) {
			System.out.println(theException);
		}

	}
	}


