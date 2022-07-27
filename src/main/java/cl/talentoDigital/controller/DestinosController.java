package cl.talentoDigital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cl.talentoDigital.modelo.Destino;
import cl.talentoDigital.service.IDestinoService;
import cl.talentoDigital.service.IPasajeroService;

@Controller
public class DestinosController {

	@Autowired
	IPasajeroService pasajeroService;
	
	@Autowired
	IDestinoService destinoService;
	

	@GetMapping("/listaDestinos")
	public String listaDestinos(Model model) {
		
		model.addAttribute("listaD",destinoService.getListaDestinos());
		
	return "destinos";
	
	}
	
	
	@GetMapping("/crearDestino")
	public String crearDestinos(Model model) {
		
		model.addAttribute("destino",new Destino());
		model.addAttribute("listaP",pasajeroService.getListaPasajeros());
			
	return "crear-destino";
	
	}
	
	
	@PostMapping("/crearDestino")
	public String crearDestinos(Model model, @ModelAttribute Destino destinoEntrante) {
		
		destinoService.add(destinoEntrante);
		
	return "destinos";
	
	}
	
	
}
