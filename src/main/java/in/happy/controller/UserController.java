package in.happy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	@GetMapping("/signup")
	public String signUp() {
		return "signup";
	}
	@GetMapping("/unlock")
	public String unlock() {
		return "unlock";
	}
    @GetMapping("/forgotpwd")
	public String forgotPwdPage() {
		return "forgotpwd";
	}
   
   
	

}
