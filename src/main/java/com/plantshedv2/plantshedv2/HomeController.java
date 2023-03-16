package com.plantshedv2.plantshedv2;

import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@GetMapping("index")
	public String index(Map<String, Object> model) {
		return "index";
	}

	
	@GetMapping("/account")
	public String account(Model model, @AuthenticationPrincipal OidcUser principal) {
		String userName = principal.getNickName();
		
		model.addAttribute("userName", userName);

		String email = principal.getEmail();

		model.addAttribute("userEmail", email);
		
		return "account";
	}
	
	

	
}