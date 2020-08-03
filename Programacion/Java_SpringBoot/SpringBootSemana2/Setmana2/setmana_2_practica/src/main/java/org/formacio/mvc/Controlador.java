package org.formacio.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.formacio.repositori.*;

@Controller
public class Controlador extends RuntimeException {
	
	@Autowired
	AgendaService agenda;
	Persona persona;
	
	@RequestMapping("/nombre")
	@ResponseBody
	public int nombre() {
		return agenda.nombreContactes();
	}
	
	@RequestMapping("/telefon")
	@ResponseBody
	public String recuperaTelefon(@RequestParam(name="id", required=false, defaultValue="0")String id) {
		return agenda.recupera(id).getTelefon();
	}
	
	@RequestMapping(path="/contacte/{id}")
	@ResponseBody
	public Persona recuperaContacte(@PathVariable String id){
		if(agenda.recupera(id) == null){
			throw new OperacioException();
		} 	
		else
			return agenda.recupera(id);
	}
	
	@RequestMapping(path="/afegir", method=RequestMethod.POST)
	@ResponseBody
	public String afegirContacte(@RequestParam String id, @RequestParam String nom, @RequestParam String telefon){
		agenda.inserta(id, nom, telefon);
		return "ok";
	}
	
	

}
