package per.nitish.springsecurity.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringSecurityController {

	private Map<String, LocalDateTime> userLastAccess = new HashMap<>();

	@GetMapping("/")
	public String getCurrentUser(@AuthenticationPrincipal User user, Model model) {
		String userName = user.getUsername();
		model.addAttribute("username", userName);
		model.addAttribute("lastAccess", userLastAccess.get("username"));
		userLastAccess.put(userName, LocalDateTime.now());
		return "home";

	}
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
}
