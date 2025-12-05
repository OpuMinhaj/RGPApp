import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 名前と趣味の登録処理用サーブレット
 */
public class NameHobbyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // リクエストパラメータの文字コードを指定する（入力JSPの文字コードと合わせる）
        req.setCharacterEncoding("utf-8");

        // リクエストパラメータを取得する
        String username = req.getParameter("name");   // ユーザー名を取得
        String hobby    = req.getParameter("hobby");  // 趣味を取得

        // リクエストにデータを登録する（結果のJSPにデータを渡すため）
        req.setAttribute("name",  username);  // "name" という登録名でユーザー名を登録
        req.setAttribute("hobby", hobby);     // "hobby" という登録名で趣味を登録

        // JSP の URL を指定する（web.xml で jsp-file に対応させる）
        RequestDispatcher dispatcher =
                req.getRequestDispatcher("registresult");  // 転送先のJSPのURL（例）

        // JSP にリクエストを転送する
        dispatcher.forward(req, res);
    }
}
