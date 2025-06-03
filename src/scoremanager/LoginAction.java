package scoremanager;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Action;

public class LoginAction extends Action {
    public String execute(
        HttpServletRequest request, HttpServletResponse response
    ) throws Exception {
        // 入力情報を取得
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        // ダミーの認証処理（ここをデータベース認証に変更可能）
        if ("user".equals(login) && "pass".equals(password)) {
            // ログイン成功 → menu.jspへフォワード
            RequestDispatcher dispatcher = request.getRequestDispatcher("menu.jsp");
            dispatcher.forward(request, response);

            // フォワード済みなので null を返す
            return null;
        } else {
            // ログイン失敗 → ログインページへ戻る
            request.setAttribute("errorMessage", "ログイン名またはパスワードが間違っています");
            return "login.jsp";
        }
    }
}