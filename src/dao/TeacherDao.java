package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Teacher;

public class TeacherDao extends Dao {
    private static final String JDBC_URL = "jdbc:h2:~/test2"; // データベースのパス
    private static final String JDBC_USER = "sa"; // デフォルトユーザー
    private static final String JDBC_PASSWORD = ""; // パスワード（デフォルトは空）

    public Teacher login(String id, String password) {
        Teacher teacher = null;
        String sql = "SELECT * FROM Teacher WHERE id = ? AND password = ?";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, id);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();


            teacher = new Teacher();
            teacher.setName(rs.getString("name"));
                // 必要に応じて他のフィールドをセット

        } catch (SQLException e) {
            e.printStackTrace(); // 本番環境では適切なエラーハンドリングを
        }
        return teacher;
    }
    public Teacher get(String id) {
        Teacher teacher = null;
        String sql = "SELECT * FROM Teacher WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();


            teacher = new Teacher();
            teacher.setName(rs.getString("name"));
                // 必要に応じて他のフィールドをセット

        } catch (SQLException e) {
            e.printStackTrace(); // 本番環境では適切なエラーハンドリングを
        }
        return teacher;
    }
}












