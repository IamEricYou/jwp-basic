package next.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(name = "dispatcher", urlPatterns = "/", loadOnStartup = 1)
public class DispatcherServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(DispatcherServlet.class);
			
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String getRequestUrl = req.getRequestURI();
		logger.info("Requested Url = {}", getRequestUrl);
		
//		RequestDispatcher rd = req.getRequestDispatcher(getRequestUrl);
//		rd.forward(req, resp);
	}
	
}
