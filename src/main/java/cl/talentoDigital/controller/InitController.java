package cl.talentoDigital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@RequestMapping({"/",""})
public class InitController {

	@GetMapping("")
	public RedirectView init(){
		
		
		return new RedirectView("listaPasajeros");
		
		
	}
	
}
