package next.controller;

import core.db.DataBase;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users")
public class ListUserController implements Controller {
    private static final long serialVersionUID = 1L;

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		if (!UserSessionUtils.isLogined(request.getSession())) {
			return "redirect:/users/loginForm";
		}
		
		request.setAttribute("users", DataBase.findAll());
		return "/user/list.jsp";
	}
	
	/*
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (!UserSessionUtils.isLogined(req.getSession())) {
            resp.sendRedirect("/users/loginForm");
            return;
        }

        req.setAttribute("users", DataBase.findAll());

        RequestDispatcher rd = req.getRequestDispatcher("/user/list.jsp");
        rd.forward(req, resp);
    }
	*/
}
