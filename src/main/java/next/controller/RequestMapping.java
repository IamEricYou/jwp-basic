package next.controller;

import java.util.HashMap;
import java.util.Map;

public class RequestMapping {
	private Map<String, Controller> requestedUrl = new HashMap<>();

	public void mappingUrl() {
		requestedUrl.put("/", new HomeController());
		requestedUrl.put("/users", new ListUserController());
		requestedUrl.put("/users/form", new ForwardController("/user/form.jsp"));
		requestedUrl.put("/users/loginForm", new ForwardController("/user/login.jsp"));
		requestedUrl.put("/users/profile", new ProfileController());
		//TODO: ADD the rest of the class
	}
}
