package in.happy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnqController {
	@GetMapping("/dashboard")
	public String dashBoardPages() {
		return "dashboard";
	}
	@GetMapping("/viewenq")
	public String viewEnq() {
		return "viewEnq";
	}
	@GetMapping("/addenq")
	public String addEnq() {
		return "addEnq";
	}

}
