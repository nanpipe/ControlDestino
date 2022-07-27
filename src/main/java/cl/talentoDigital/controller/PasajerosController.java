package cl.talentoDigital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import cl.talentoDigital.modelo.Pasajero;
import cl.talentoDigital.service.IDestinoService;
import cl.talentoDigital.service.IPasajeroService;

@Controller
public class PasajerosController {

	@Autowired
	IPasajeroService pasajeroService;
	
	@Autowired
	IDestinoService destinoService;

	@GetMapping("/listaPasajeros")
	public String listaPasajeros(Model model) {
		
		model.addAttribute("listaD",destinoService.getListaDestinos());
		model.addAttribute("listaP",pasajeroService.getListaPasajeros());
		
	return "pasajeros";
	
	}
	
	@GetMapping("/crearPasajero")
	public String crearPasajero(Model model) {
		
		
		model.addAttribute("pasajero", new Pasajero());
		
	return "crear-pasajero";
	
	}
	
	@PostMapping("/crearPasajero")
	public RedirectView guardarPasajero(Model model, @ModelAttribute Pasajero pasajeroEntrante) {
		
		pasajeroService.add(pasajeroEntrante);
		
		
	return new RedirectView("listaPasajeros");
	
	}
	
	
}
