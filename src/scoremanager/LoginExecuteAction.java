package scoremanager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Teacher;
import dao.TeacherDao;
import tool.Action;

public class LoginExecuteAction extends Action {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String id = request.getParameter("id");
        String password = request.getParameter("pass");

        TeacherDao dao = new TeacherDao();
        Teacher teacher = dao.login(id, password);

        if (teacher != null) {
            HttpSession session = request.getSession();
            session.setAttribute("teacher", teacher);
            session.setAttribute("teachername", teacher.getName());

            return "/JSPFiles/menu.jsp";
        } else {
            request.setAttribute("errorMessage", "ログイン名またはパスワードが間違っています");
            return "/JSPFiles/login.jsp";
        }
    }
}
