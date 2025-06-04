package scoremanager;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutAction {
	public String execute(
			HttpServletRequest request, HttpServletResponse response)
	throws Exception {

		System.out.print("as;dlkfjsa;ldfjksa;ldkjf");
		System.out.print("htioueniewbnif");

		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}

		return "/JSPFiles/logout.jsp";
	}
}
