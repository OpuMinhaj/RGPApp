import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistTestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("name");
        String password = req.getParameter("pass");
        String hobby = req.getParameter("hobby"); // ★趣味追加

        req.setAttribute("name", username);
        req.setAttribute("pass", password);
        req.setAttribute("hobby", hobby); // ★JSPに渡す

        RequestDispatcher dispatcher =
                req.getRequestDispatcher("registresult");
        dispatcher.forward(req, res);
    }
}