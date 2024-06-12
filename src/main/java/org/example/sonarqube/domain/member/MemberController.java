package org.example.sonarqube.domain.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {



	@GetMapping
	public String index() {
		return "/index.html";
	}

	@GetMapping("/memberInfo")
	public String memberInfo() {
		return null;
	}

	@GetMapping("/save")
	public String save() {
		return null;
	}
}
