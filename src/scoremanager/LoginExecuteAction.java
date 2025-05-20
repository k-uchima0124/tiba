package scoremanager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Teacher;
import dao.TeacherDao;
import tool.Action;


public class LoginExecuteAction extends Action{

	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		HttpSession session = request.getSession();

		String id = request.getParameter("id");
		String password = request.getParameter("pass");

		TeacherDao dao = new TeacherDao();

		Teacher teacher = dao.login(id, password);





		return "menu.jsp";
	}
}
